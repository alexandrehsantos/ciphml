
/**
 * SCGServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

    package br.org.cipbancos.scg.webservice;

    /**
     *  SCGServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class SCGServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public SCGServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public SCGServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for retryByConfirmationOperation method
            * override this method for handling normal response from retryByConfirmationOperation operation
            */
           public void receiveResultretryByConfirmationOperation(
                    br.org.cipbancos.scg.webservice.ScgResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from retryByConfirmationOperation operation
           */
            public void receiveErrorretryByConfirmationOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for executeOperation method
            * override this method for handling normal response from executeOperation operation
            */
           public void receiveResultexecuteOperation(
                    br.org.cipbancos.scg.webservice.ScgResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from executeOperation operation
           */
            public void receiveErrorexecuteOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for retryByIdOperation method
            * override this method for handling normal response from retryByIdOperation operation
            */
           public void receiveResultretryByIdOperation(
                    br.org.cipbancos.scg.webservice.ScgResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from retryByIdOperation operation
           */
            public void receiveErrorretryByIdOperation(java.lang.Exception e) {
            }
                


    }
    