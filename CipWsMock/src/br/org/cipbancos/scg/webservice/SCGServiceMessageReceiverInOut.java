
/**
 * SCGServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */
        package br.org.cipbancos.scg.webservice;

        /**
        *  SCGServiceMessageReceiverInOut message receiver
        */

        public class SCGServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        SCGServiceSkeletonInterface skel = (SCGServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){

        

            if("retryByConfirmationOperation".equals(methodName)){
                
                br.org.cipbancos.scg.webservice.ScgResponseE scgResponse21 = null;
	                        br.org.cipbancos.scg.webservice.Confirmation wrappedParam =
                                                             (br.org.cipbancos.scg.webservice.Confirmation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    br.org.cipbancos.scg.webservice.Confirmation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               scgResponse21 =
                                                   
                                                   
                                                         skel.retryByConfirmationOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), scgResponse21, false);
                                    } else 

            if("executeOperation".equals(methodName)){
                
                br.org.cipbancos.scg.webservice.ScgResponseE scgResponse23 = null;
	                        br.org.cipbancos.scg.webservice.ScgRequestE wrappedParam =
                                                             (br.org.cipbancos.scg.webservice.ScgRequestE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    br.org.cipbancos.scg.webservice.ScgRequestE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               scgResponse23 =
                                                   
                                                   
                                                         skel.executeOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), scgResponse23, false);
                                    } else 

            if("retryByIdOperation".equals(methodName)){
                
                br.org.cipbancos.scg.webservice.ScgResponseE scgResponse25 = null;
	                        br.org.cipbancos.scg.webservice.Id wrappedParam =
                                                             (br.org.cipbancos.scg.webservice.Id)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    br.org.cipbancos.scg.webservice.Id.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               scgResponse25 =
                                                   
                                                   
                                                         skel.retryByIdOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), scgResponse25, false);
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(br.org.cipbancos.scg.webservice.Confirmation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.org.cipbancos.scg.webservice.Confirmation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.org.cipbancos.scg.webservice.ScgResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.org.cipbancos.scg.webservice.ScgResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.org.cipbancos.scg.webservice.ScgRequestE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.org.cipbancos.scg.webservice.ScgRequestE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.org.cipbancos.scg.webservice.Id param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.org.cipbancos.scg.webservice.Id.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.org.cipbancos.scg.webservice.ScgResponseE param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(br.org.cipbancos.scg.webservice.ScgResponseE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private br.org.cipbancos.scg.webservice.ScgResponseE wrapretryByConfirmationOperation(){
                                br.org.cipbancos.scg.webservice.ScgResponseE wrappedElement = new br.org.cipbancos.scg.webservice.ScgResponseE();
                                return wrappedElement;
                         }
                    
                         private br.org.cipbancos.scg.webservice.ScgResponseE wrapexecuteOperation(){
                                br.org.cipbancos.scg.webservice.ScgResponseE wrappedElement = new br.org.cipbancos.scg.webservice.ScgResponseE();
                                return wrappedElement;
                         }
                    
                         private br.org.cipbancos.scg.webservice.ScgResponseE wrapretryByIdOperation(){
                                br.org.cipbancos.scg.webservice.ScgResponseE wrappedElement = new br.org.cipbancos.scg.webservice.ScgResponseE();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (br.org.cipbancos.scg.webservice.Confirmation.class.equals(type)){
                
                           return br.org.cipbancos.scg.webservice.Confirmation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.org.cipbancos.scg.webservice.ScgResponseE.class.equals(type)){
                
                           return br.org.cipbancos.scg.webservice.ScgResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.org.cipbancos.scg.webservice.ScgRequestE.class.equals(type)){
                
                           return br.org.cipbancos.scg.webservice.ScgRequestE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.org.cipbancos.scg.webservice.ScgResponseE.class.equals(type)){
                
                           return br.org.cipbancos.scg.webservice.ScgResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.org.cipbancos.scg.webservice.Id.class.equals(type)){
                
                           return br.org.cipbancos.scg.webservice.Id.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.org.cipbancos.scg.webservice.ScgResponseE.class.equals(type)){
                
                           return br.org.cipbancos.scg.webservice.ScgResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    