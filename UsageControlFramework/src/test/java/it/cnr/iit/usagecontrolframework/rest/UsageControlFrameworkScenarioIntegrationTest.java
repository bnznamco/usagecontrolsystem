package it.cnr.iit.usagecontrolframework.rest;

import static it.cnr.iit.ucs.configuration.RestOperation.TRY_ACCESS;
import static it.cnr.iit.ucs.configuration.RestOperation.TRY_ACCESS_RESPONSE;

import org.apache.http.HttpStatus;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;

import com.tngtech.jgiven.annotation.ScenarioStage;
import com.tngtech.jgiven.integration.spring.SpringRuleScenarioTest;

import it.cnr.iit.usagecontrolframework.rest.jgiven.stages.GivenMessage;
import it.cnr.iit.usagecontrolframework.rest.jgiven.stages.GivenPEPRestSimulator;
import it.cnr.iit.usagecontrolframework.rest.jgiven.stages.ThenMessage;
import it.cnr.iit.usagecontrolframework.rest.jgiven.stages.WhenUCFRestController;

import oasis.names.tc.xacml.core.schema.wd_17.DecisionType;

@SpringBootTest( classes = { MockServletContext.class, UCFTestContext.class } )
public class UsageControlFrameworkScenarioIntegrationTest
        extends SpringRuleScenarioTest<GivenMessage, WhenUCFRestController, ThenMessage> {

    private static final String DECISION_PERMIT = DecisionType.PERMIT.value();

    @ScenarioStage
    GivenPEPRestSimulator givenPEPRestSimulator;

    @Test
    public void a_tryAccess_request_is_replied_with_tryAccessResponse_containg_Permit_decision() {
        given().a_TryAccess_request();
        givenPEPRestSimulator.and().a_mocked_PEPRest_for_$( TRY_ACCESS_RESPONSE.getOperationUri() )
            .and().a_success_response_status_code_of_$( HttpStatus.SC_OK );

        when().the_UCF_is_executed_for_$( TRY_ACCESS.getOperationUri() );

        then().the_asynch_post_request_for_$_with_decision_$_was_received_by_PEPRest( TRY_ACCESS_RESPONSE.getOperationUri(),
            DECISION_PERMIT );
    }
}