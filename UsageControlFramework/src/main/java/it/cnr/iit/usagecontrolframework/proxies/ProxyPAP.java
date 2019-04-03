/*******************************************************************************
 * Copyright 2018 IIT-CNR
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package it.cnr.iit.usagecontrolframework.proxies;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import it.cnr.iit.ucs.builders.PAPBuilder;
import it.cnr.iit.ucs.configuration.PapProperties;
import it.cnr.iit.ucs.constants.CONNECTION;
import it.cnr.iit.ucsinterface.pap.PAPInterface;

/**
 * This is the proxy to deal with the PAP.
 * <p>
 * The core of this class is basically the same of the ProxyPDP. Also here we
 * have to manage all the possible ways in which we can communicate with the
 * PAP. <br>
 * For now the only implemented way of communication is the local one, hence the
 * ContextHandler can call the PAP via API. <br>
 * TODO: Since it is possible not to have a PAP we have to implement also that
 * feature
 * </p>
 *
 * @author antonio
 *
 */
final public class ProxyPAP extends Proxy implements PAPInterface {

    private static final Logger log = Logger.getLogger( ProxyPAP.class.getName() );

    private PapProperties properties;
    private PAPInterface papInterface;

    private boolean initialized = false;

    /**
     * This is the constructor of the proxy to the PAP.
     * <p>
     * Basically here we have to distinguish between the various possibilities we
     * have to implement the pap and act accordingli. There are 3 different
     * options:
     * <ol>
     * <li>API: in this case the PAP is in the same virtual machine of the
     * UCS</li>
     * <li>REST_API: in this case the PAP can be queried using REST_API</li>
     * <li>SOCKET: in this case the PAP can be queried by passing to it messages
     * via socket</li>
     * </ol>
     * </p>
     *
     * @param properties
     *          the configuration of the PAP
     */
    public ProxyPAP( PapProperties properties ) {
        // BEGIN parameter checking
        if( properties == null ) {
            return;
            // TODO throw exception
        }
        // END parameter checking

        this.properties = properties;

        switch( getConnection() ) {
            case API:
                if( setLocalPAP( properties ) ) {
                    initialized = true;
                }
                break;
            case SOCKET:
                if( connectSocket( properties ) ) {
                    initialized = true;
                }
                break;
            case REST_API:
                if( connectRest( properties ) ) {
                    initialized = true;
                }
                break;
            default:
                log.severe( "WRONG communication " + properties.getCommunication() );
                return;
        }
    }

    /**
     * This is the implementation of the local PAP.
     *
     * @param properties
     *          the configuration of the PAP in xml format
     * @return true if everything goes ok, false otherwise
     */
    private boolean setLocalPAP( PapProperties properties ) {
        Optional<PAPInterface> optPAP = PAPBuilder.buildFromProperties( properties );

        if( optPAP.isPresent() ) {
            papInterface = optPAP.get();
            return true;
        }

        return false;
    }

    private boolean connectSocket( PapProperties properties ) {
        return false;
    }

    private boolean connectRest( PapProperties properties ) {
        return false;
    }

    @Override
    public String retrievePolicy( String policyId ) {
        // BEGIN parameter checking
        if( initialized != true ) {
            return null;
        }
        if( policyId == null || policyId.equals( "" ) ) {
            return null;
        }
        // END parameter checking
        switch( getConnection() ) {
            case API:
                return papInterface.retrievePolicy( policyId );
            case SOCKET:
                return null;
            case REST_API:
                return null;
        }
        return null;
    }

    @Override
    public boolean addPolicy( String policy ) {
        // BEGIN parameter checking
        if( initialized != true ) {
            return false;
        }
        if( policy == null || policy.equals( "" ) ) {
            return false;
        }
        // END parameter checking
        switch( getConnection() ) {
            case API:
                return papInterface.addPolicy( policy );
            case SOCKET:
                return false;
            case REST_API:
                return false;
        }
        return false;
    }

    @Override
    public List<String> listPolicies() {
        // BEGIN parameter checking
        if( initialized != true ) {
            return null;
        }
        // END parameter checking
        switch( getConnection() ) {
            case API:
                return papInterface.listPolicies();
            case SOCKET:
                return null;
            case REST_API:
                return null;
        }
        return null;
    }

    @Override
    protected CONNECTION getConnection() {
        return CONNECTION.valueOf( properties.getCommunication() );
    }

    /**
     * Checks if the proxy was correctly initialized
     *
     * @return the value of the initialized volatile variable
     */
    @Override
    public boolean isInitialized() {
        return initialized;
    }

}
