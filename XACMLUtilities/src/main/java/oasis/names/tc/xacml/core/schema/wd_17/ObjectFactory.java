/*******************************************************************************
 * Copyright 2018 IIT-CNR
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.04.24 alle 12:34:54 PM CEST 
//


package oasis.names.tc.xacml.core.schema.wd_17;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.tc.xacml._3_0.core.schema.wd_17 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Target_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Target");
    private final static QName _AttributeDesignator_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "AttributeDesignator");
    private final static QName _Function_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Function");
    private final static QName _ObligationExpression_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "ObligationExpression");
    private final static QName _AttributeAssignmentExpression_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "AttributeAssignmentExpression");
    private final static QName _Attribute_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Attribute");
    private final static QName _PolicySetCombinerParameters_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "PolicySetCombinerParameters");
    private final static QName _Description_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Description");
    private final static QName _PolicyCombinerParameters_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "PolicyCombinerParameters");
    private final static QName _PolicySetDefaults_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "PolicySetDefaults");
    private final static QName _PolicySet_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "PolicySet");
    private final static QName _Match_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Match");
    private final static QName _CombinerParameter_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "CombinerParameter");
    private final static QName _Expression_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Expression");
    private final static QName _AssociatedAdvice_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "AssociatedAdvice");
    private final static QName _Response_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Response");
    private final static QName _AllOf_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "AllOf");
    private final static QName _XPathVersion_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "XPathVersion");
    private final static QName _AdviceExpressions_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "AdviceExpressions");
    private final static QName _VariableReference_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "VariableReference");
    private final static QName _RequestReference_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "RequestReference");
    private final static QName _Condition_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Condition");
    private final static QName _Decision_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Decision");
    private final static QName _StatusMessage_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "StatusMessage");
    private final static QName _Request_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Request");
    private final static QName _PolicyIssuer_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "PolicyIssuer");
    private final static QName _RuleCombinerParameters_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "RuleCombinerParameters");
    private final static QName _PolicyDefaults_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "PolicyDefaults");
    private final static QName _Apply_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Apply");
    private final static QName _Obligation_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Obligation");
    private final static QName _AnyOf_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "AnyOf");
    private final static QName _VariableDefinition_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "VariableDefinition");
    private final static QName _AttributeValue_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "AttributeValue");
    private final static QName _AttributesReference_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "AttributesReference");
    private final static QName _Policy_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Policy");
    private final static QName _Result_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Result");
    private final static QName _StatusCode_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "StatusCode");
    private final static QName _PolicyIdentifierList_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "PolicyIdentifierList");
    private final static QName _PolicyIdReference_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "PolicyIdReference");
    private final static QName _Attributes_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Attributes");
    private final static QName _Content_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Content");
    private final static QName _CombinerParameters_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "CombinerParameters");
    private final static QName _PolicySetIdReference_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "PolicySetIdReference");
    private final static QName _StatusDetail_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "StatusDetail");
    private final static QName _Obligations_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Obligations");
    private final static QName _Advice_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Advice");
    private final static QName _Rule_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Rule");
    private final static QName _ObligationExpressions_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "ObligationExpressions");
    private final static QName _AdviceExpression_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "AdviceExpression");
    private final static QName _MissingAttributeDetail_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "MissingAttributeDetail");
    private final static QName _Status_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "Status");
    private final static QName _AttributeAssignment_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "AttributeAssignment");
    private final static QName _AttributeSelector_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "AttributeSelector");
    private final static QName _RequestDefaults_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "RequestDefaults");
    private final static QName _MultiRequests_QNAME = new QName("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", "MultiRequests");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.tc.xacml._3_0.core.schema.wd_17
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PolicyType }
     * 
     */
    public PolicyType createPolicyType() {
        return new PolicyType();
    }

    /**
     * Create an instance of {@link AttributeValueType }
     * 
     */
    public AttributeValueType createAttributeValueType() {
        return new AttributeValueType();
    }

    /**
     * Create an instance of {@link AttributesReferenceType }
     * 
     */
    public AttributesReferenceType createAttributesReferenceType() {
        return new AttributesReferenceType();
    }

    /**
     * Create an instance of {@link ObligationType }
     * 
     */
    public ObligationType createObligationType() {
        return new ObligationType();
    }

    /**
     * Create an instance of {@link AnyOfType }
     * 
     */
    public AnyOfType createAnyOfType() {
        return new AnyOfType();
    }

    /**
     * Create an instance of {@link VariableDefinitionType }
     * 
     */
    public VariableDefinitionType createVariableDefinitionType() {
        return new VariableDefinitionType();
    }

    /**
     * Create an instance of {@link ApplyType }
     * 
     */
    public ApplyType createApplyType() {
        return new ApplyType();
    }

    /**
     * Create an instance of {@link AttributesType }
     * 
     */
    public AttributesType createAttributesType() {
        return new AttributesType();
    }

    /**
     * Create an instance of {@link PolicyIdentifierListType }
     * 
     */
    public PolicyIdentifierListType createPolicyIdentifierListType() {
        return new PolicyIdentifierListType();
    }

    /**
     * Create an instance of {@link IdReferenceType }
     * 
     */
    public IdReferenceType createIdReferenceType() {
        return new IdReferenceType();
    }

    /**
     * Create an instance of {@link StatusCodeType }
     * 
     */
    public StatusCodeType createStatusCodeType() {
        return new StatusCodeType();
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link RuleCombinerParametersType }
     * 
     */
    public RuleCombinerParametersType createRuleCombinerParametersType() {
        return new RuleCombinerParametersType();
    }

    /**
     * Create an instance of {@link PolicyIssuerType }
     * 
     */
    public PolicyIssuerType createPolicyIssuerType() {
        return new PolicyIssuerType();
    }

    /**
     * Create an instance of {@link DefaultsType }
     * 
     */
    public DefaultsType createDefaultsType() {
        return new DefaultsType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link AttributeAssignmentType }
     * 
     */
    public AttributeAssignmentType createAttributeAssignmentType() {
        return new AttributeAssignmentType();
    }

    /**
     * Create an instance of {@link AdviceExpressionType }
     * 
     */
    public AdviceExpressionType createAdviceExpressionType() {
        return new AdviceExpressionType();
    }

    /**
     * Create an instance of {@link MissingAttributeDetailType }
     * 
     */
    public MissingAttributeDetailType createMissingAttributeDetailType() {
        return new MissingAttributeDetailType();
    }

    /**
     * Create an instance of {@link RequestDefaultsType }
     * 
     */
    public RequestDefaultsType createRequestDefaultsType() {
        return new RequestDefaultsType();
    }

    /**
     * Create an instance of {@link MultiRequestsType }
     * 
     */
    public MultiRequestsType createMultiRequestsType() {
        return new MultiRequestsType();
    }

    /**
     * Create an instance of {@link AttributeSelectorType }
     * 
     */
    public AttributeSelectorType createAttributeSelectorType() {
        return new AttributeSelectorType();
    }

    /**
     * Create an instance of {@link ObligationsType }
     * 
     */
    public ObligationsType createObligationsType() {
        return new ObligationsType();
    }

    /**
     * Create an instance of {@link ContentType }
     * 
     */
    public ContentType createContentType() {
        return new ContentType();
    }

    /**
     * Create an instance of {@link CombinerParametersType }
     * 
     */
    public CombinerParametersType createCombinerParametersType() {
        return new CombinerParametersType();
    }

    /**
     * Create an instance of {@link StatusDetailType }
     * 
     */
    public StatusDetailType createStatusDetailType() {
        return new StatusDetailType();
    }

    /**
     * Create an instance of {@link ObligationExpressionsType }
     * 
     */
    public ObligationExpressionsType createObligationExpressionsType() {
        return new ObligationExpressionsType();
    }

    /**
     * Create an instance of {@link AdviceType }
     * 
     */
    public AdviceType createAdviceType() {
        return new AdviceType();
    }

    /**
     * Create an instance of {@link RuleType }
     * 
     */
    public RuleType createRuleType() {
        return new RuleType();
    }

    /**
     * Create an instance of {@link PolicyCombinerParametersType }
     * 
     */
    public PolicyCombinerParametersType createPolicyCombinerParametersType() {
        return new PolicyCombinerParametersType();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link PolicySetCombinerParametersType }
     * 
     */
    public PolicySetCombinerParametersType createPolicySetCombinerParametersType() {
        return new PolicySetCombinerParametersType();
    }

    /**
     * Create an instance of {@link CombinerParameterType }
     * 
     */
    public CombinerParameterType createCombinerParameterType() {
        return new CombinerParameterType();
    }

    /**
     * Create an instance of {@link PolicySetType }
     * 
     */
    public PolicySetType createPolicySetType() {
        return new PolicySetType();
    }

    /**
     * Create an instance of {@link MatchType }
     * 
     */
    public MatchType createMatchType() {
        return new MatchType();
    }

    /**
     * Create an instance of {@link FunctionType }
     * 
     */
    public FunctionType createFunctionType() {
        return new FunctionType();
    }

    /**
     * Create an instance of {@link TargetType }
     * 
     */
    public TargetType createTargetType() {
        return new TargetType();
    }

    /**
     * Create an instance of {@link AttributeDesignatorType }
     * 
     */
    public AttributeDesignatorType createAttributeDesignatorType() {
        return new AttributeDesignatorType();
    }

    /**
     * Create an instance of {@link AttributeAssignmentExpressionType }
     * 
     */
    public AttributeAssignmentExpressionType createAttributeAssignmentExpressionType() {
        return new AttributeAssignmentExpressionType();
    }

    /**
     * Create an instance of {@link ObligationExpressionType }
     * 
     */
    public ObligationExpressionType createObligationExpressionType() {
        return new ObligationExpressionType();
    }

    /**
     * Create an instance of {@link ConditionType }
     * 
     */
    public ConditionType createConditionType() {
        return new ConditionType();
    }

    /**
     * Create an instance of {@link VariableReferenceType }
     * 
     */
    public VariableReferenceType createVariableReferenceType() {
        return new VariableReferenceType();
    }

    /**
     * Create an instance of {@link RequestReferenceType }
     * 
     */
    public RequestReferenceType createRequestReferenceType() {
        return new RequestReferenceType();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link AssociatedAdviceType }
     * 
     */
    public AssociatedAdviceType createAssociatedAdviceType() {
        return new AssociatedAdviceType();
    }

    /**
     * Create an instance of {@link AdviceExpressionsType }
     * 
     */
    public AdviceExpressionsType createAdviceExpressionsType() {
        return new AdviceExpressionsType();
    }

    /**
     * Create an instance of {@link AllOfType }
     * 
     */
    public AllOfType createAllOfType() {
        return new AllOfType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Target")
    public JAXBElement<TargetType> createTarget(TargetType value) {
        return new JAXBElement<TargetType>(_Target_QNAME, TargetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeDesignatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "AttributeDesignator", substitutionHeadNamespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", substitutionHeadName = "Expression")
    public JAXBElement<AttributeDesignatorType> createAttributeDesignator(AttributeDesignatorType value) {
        return new JAXBElement<AttributeDesignatorType>(_AttributeDesignator_QNAME, AttributeDesignatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FunctionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Function", substitutionHeadNamespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", substitutionHeadName = "Expression")
    public JAXBElement<FunctionType> createFunction(FunctionType value) {
        return new JAXBElement<FunctionType>(_Function_QNAME, FunctionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObligationExpressionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "ObligationExpression")
    public JAXBElement<ObligationExpressionType> createObligationExpression(ObligationExpressionType value) {
        return new JAXBElement<ObligationExpressionType>(_ObligationExpression_QNAME, ObligationExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeAssignmentExpressionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "AttributeAssignmentExpression")
    public JAXBElement<AttributeAssignmentExpressionType> createAttributeAssignmentExpression(AttributeAssignmentExpressionType value) {
        return new JAXBElement<AttributeAssignmentExpressionType>(_AttributeAssignmentExpression_QNAME, AttributeAssignmentExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Attribute")
    public JAXBElement<AttributeType> createAttribute(AttributeType value) {
        return new JAXBElement<AttributeType>(_Attribute_QNAME, AttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicySetCombinerParametersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "PolicySetCombinerParameters")
    public JAXBElement<PolicySetCombinerParametersType> createPolicySetCombinerParameters(PolicySetCombinerParametersType value) {
        return new JAXBElement<PolicySetCombinerParametersType>(_PolicySetCombinerParameters_QNAME, PolicySetCombinerParametersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyCombinerParametersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "PolicyCombinerParameters")
    public JAXBElement<PolicyCombinerParametersType> createPolicyCombinerParameters(PolicyCombinerParametersType value) {
        return new JAXBElement<PolicyCombinerParametersType>(_PolicyCombinerParameters_QNAME, PolicyCombinerParametersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefaultsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "PolicySetDefaults")
    public JAXBElement<DefaultsType> createPolicySetDefaults(DefaultsType value) {
        return new JAXBElement<DefaultsType>(_PolicySetDefaults_QNAME, DefaultsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicySetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "PolicySet")
    public JAXBElement<PolicySetType> createPolicySet(PolicySetType value) {
        return new JAXBElement<PolicySetType>(_PolicySet_QNAME, PolicySetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Match")
    public JAXBElement<MatchType> createMatch(MatchType value) {
        return new JAXBElement<MatchType>(_Match_QNAME, MatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CombinerParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "CombinerParameter")
    public JAXBElement<CombinerParameterType> createCombinerParameter(CombinerParameterType value) {
        return new JAXBElement<CombinerParameterType>(_CombinerParameter_QNAME, CombinerParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpressionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Expression")
    public JAXBElement<ExpressionType> createExpression(ExpressionType value) {
        return new JAXBElement<ExpressionType>(_Expression_QNAME, ExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociatedAdviceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "AssociatedAdvice")
    public JAXBElement<AssociatedAdviceType> createAssociatedAdvice(AssociatedAdviceType value) {
        return new JAXBElement<AssociatedAdviceType>(_AssociatedAdvice_QNAME, AssociatedAdviceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Response")
    public JAXBElement<ResponseType> createResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_Response_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllOfType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "AllOf")
    public JAXBElement<AllOfType> createAllOf(AllOfType value) {
        return new JAXBElement<AllOfType>(_AllOf_QNAME, AllOfType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "XPathVersion")
    public JAXBElement<String> createXPathVersion(String value) {
        return new JAXBElement<String>(_XPathVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdviceExpressionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "AdviceExpressions")
    public JAXBElement<AdviceExpressionsType> createAdviceExpressions(AdviceExpressionsType value) {
        return new JAXBElement<AdviceExpressionsType>(_AdviceExpressions_QNAME, AdviceExpressionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "VariableReference", substitutionHeadNamespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", substitutionHeadName = "Expression")
    public JAXBElement<VariableReferenceType> createVariableReference(VariableReferenceType value) {
        return new JAXBElement<VariableReferenceType>(_VariableReference_QNAME, VariableReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "RequestReference")
    public JAXBElement<RequestReferenceType> createRequestReference(RequestReferenceType value) {
        return new JAXBElement<RequestReferenceType>(_RequestReference_QNAME, RequestReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConditionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Condition")
    public JAXBElement<ConditionType> createCondition(ConditionType value) {
        return new JAXBElement<ConditionType>(_Condition_QNAME, ConditionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecisionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Decision")
    public JAXBElement<DecisionType> createDecision(DecisionType value) {
        return new JAXBElement<DecisionType>(_Decision_QNAME, DecisionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "StatusMessage")
    public JAXBElement<String> createStatusMessage(String value) {
        return new JAXBElement<String>(_StatusMessage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Request")
    public JAXBElement<RequestType> createRequest(RequestType value) {
        return new JAXBElement<RequestType>(_Request_QNAME, RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyIssuerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "PolicyIssuer")
    public JAXBElement<PolicyIssuerType> createPolicyIssuer(PolicyIssuerType value) {
        return new JAXBElement<PolicyIssuerType>(_PolicyIssuer_QNAME, PolicyIssuerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleCombinerParametersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "RuleCombinerParameters")
    public JAXBElement<RuleCombinerParametersType> createRuleCombinerParameters(RuleCombinerParametersType value) {
        return new JAXBElement<RuleCombinerParametersType>(_RuleCombinerParameters_QNAME, RuleCombinerParametersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefaultsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "PolicyDefaults")
    public JAXBElement<DefaultsType> createPolicyDefaults(DefaultsType value) {
        return new JAXBElement<DefaultsType>(_PolicyDefaults_QNAME, DefaultsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Apply", substitutionHeadNamespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", substitutionHeadName = "Expression")
    public JAXBElement<ApplyType> createApply(ApplyType value) {
        return new JAXBElement<ApplyType>(_Apply_QNAME, ApplyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObligationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Obligation")
    public JAXBElement<ObligationType> createObligation(ObligationType value) {
        return new JAXBElement<ObligationType>(_Obligation_QNAME, ObligationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyOfType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "AnyOf")
    public JAXBElement<AnyOfType> createAnyOf(AnyOfType value) {
        return new JAXBElement<AnyOfType>(_AnyOf_QNAME, AnyOfType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableDefinitionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "VariableDefinition")
    public JAXBElement<VariableDefinitionType> createVariableDefinition(VariableDefinitionType value) {
        return new JAXBElement<VariableDefinitionType>(_VariableDefinition_QNAME, VariableDefinitionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "AttributeValue", substitutionHeadNamespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", substitutionHeadName = "Expression")
    public JAXBElement<AttributeValueType> createAttributeValue(AttributeValueType value) {
        return new JAXBElement<AttributeValueType>(_AttributeValue_QNAME, AttributeValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributesReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "AttributesReference")
    public JAXBElement<AttributesReferenceType> createAttributesReference(AttributesReferenceType value) {
        return new JAXBElement<AttributesReferenceType>(_AttributesReference_QNAME, AttributesReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Policy")
    public JAXBElement<PolicyType> createPolicy(PolicyType value) {
        return new JAXBElement<PolicyType>(_Policy_QNAME, PolicyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Result")
    public JAXBElement<ResultType> createResult(ResultType value) {
        return new JAXBElement<ResultType>(_Result_QNAME, ResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "StatusCode")
    public JAXBElement<StatusCodeType> createStatusCode(StatusCodeType value) {
        return new JAXBElement<StatusCodeType>(_StatusCode_QNAME, StatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyIdentifierListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "PolicyIdentifierList")
    public JAXBElement<PolicyIdentifierListType> createPolicyIdentifierList(PolicyIdentifierListType value) {
        return new JAXBElement<PolicyIdentifierListType>(_PolicyIdentifierList_QNAME, PolicyIdentifierListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "PolicyIdReference")
    public JAXBElement<IdReferenceType> createPolicyIdReference(IdReferenceType value) {
        return new JAXBElement<IdReferenceType>(_PolicyIdReference_QNAME, IdReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Attributes")
    public JAXBElement<AttributesType> createAttributes(AttributesType value) {
        return new JAXBElement<AttributesType>(_Attributes_QNAME, AttributesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Content")
    public JAXBElement<ContentType> createContent(ContentType value) {
        return new JAXBElement<ContentType>(_Content_QNAME, ContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CombinerParametersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "CombinerParameters")
    public JAXBElement<CombinerParametersType> createCombinerParameters(CombinerParametersType value) {
        return new JAXBElement<CombinerParametersType>(_CombinerParameters_QNAME, CombinerParametersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "PolicySetIdReference")
    public JAXBElement<IdReferenceType> createPolicySetIdReference(IdReferenceType value) {
        return new JAXBElement<IdReferenceType>(_PolicySetIdReference_QNAME, IdReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "StatusDetail")
    public JAXBElement<StatusDetailType> createStatusDetail(StatusDetailType value) {
        return new JAXBElement<StatusDetailType>(_StatusDetail_QNAME, StatusDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObligationsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Obligations")
    public JAXBElement<ObligationsType> createObligations(ObligationsType value) {
        return new JAXBElement<ObligationsType>(_Obligations_QNAME, ObligationsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdviceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Advice")
    public JAXBElement<AdviceType> createAdvice(AdviceType value) {
        return new JAXBElement<AdviceType>(_Advice_QNAME, AdviceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Rule")
    public JAXBElement<RuleType> createRule(RuleType value) {
        return new JAXBElement<RuleType>(_Rule_QNAME, RuleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObligationExpressionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "ObligationExpressions")
    public JAXBElement<ObligationExpressionsType> createObligationExpressions(ObligationExpressionsType value) {
        return new JAXBElement<ObligationExpressionsType>(_ObligationExpressions_QNAME, ObligationExpressionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdviceExpressionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "AdviceExpression")
    public JAXBElement<AdviceExpressionType> createAdviceExpression(AdviceExpressionType value) {
        return new JAXBElement<AdviceExpressionType>(_AdviceExpression_QNAME, AdviceExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MissingAttributeDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "MissingAttributeDetail")
    public JAXBElement<MissingAttributeDetailType> createMissingAttributeDetail(MissingAttributeDetailType value) {
        return new JAXBElement<MissingAttributeDetailType>(_MissingAttributeDetail_QNAME, MissingAttributeDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "Status")
    public JAXBElement<StatusType> createStatus(StatusType value) {
        return new JAXBElement<StatusType>(_Status_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeAssignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "AttributeAssignment")
    public JAXBElement<AttributeAssignmentType> createAttributeAssignment(AttributeAssignmentType value) {
        return new JAXBElement<AttributeAssignmentType>(_AttributeAssignment_QNAME, AttributeAssignmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeSelectorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "AttributeSelector", substitutionHeadNamespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", substitutionHeadName = "Expression")
    public JAXBElement<AttributeSelectorType> createAttributeSelector(AttributeSelectorType value) {
        return new JAXBElement<AttributeSelectorType>(_AttributeSelector_QNAME, AttributeSelectorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestDefaultsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "RequestDefaults")
    public JAXBElement<RequestDefaultsType> createRequestDefaults(RequestDefaultsType value) {
        return new JAXBElement<RequestDefaultsType>(_RequestDefaults_QNAME, RequestDefaultsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiRequestsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", name = "MultiRequests")
    public JAXBElement<MultiRequestsType> createMultiRequests(MultiRequestsType value) {
        return new JAXBElement<MultiRequestsType>(_MultiRequests_QNAME, MultiRequestsType.class, null, value);
    }

}