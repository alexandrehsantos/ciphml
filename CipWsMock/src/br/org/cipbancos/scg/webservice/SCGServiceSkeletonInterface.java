
/**
 * SCGServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */
    package br.org.cipbancos.scg.webservice;
    /**
     *  SCGServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface SCGServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param confirmation
         */

        
                public br.org.cipbancos.scg.webservice.ScgResponseE retryByConfirmationOperation
                (
                  br.org.cipbancos.scg.webservice.Confirmation confirmation
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param scgRequest
         */

        
                public br.org.cipbancos.scg.webservice.ScgResponseE executeOperation
                (
                  br.org.cipbancos.scg.webservice.ScgRequestE scgRequest
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param id
         */

        
                public br.org.cipbancos.scg.webservice.ScgResponseE retryByIdOperation
                (
                  br.org.cipbancos.scg.webservice.Id id
                 )
            ;
        
         }
    