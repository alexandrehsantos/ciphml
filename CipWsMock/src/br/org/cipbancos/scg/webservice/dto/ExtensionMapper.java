
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:47 CEST)
 */

            package br.org.cipbancos.scg.webservice.dto;
            /**
            *  ExtensionMapper class
            */
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://dto.webservice.scg.cipbancos.org.br".equals(namespaceURI) &&
                  "SCGRequest".equals(typeName)){
                   
                            return  br.org.cipbancos.scg.webservice.dto.SCGRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.webservice.scg.cipbancos.org.br".equals(namespaceURI) &&
                  "SCGResponse".equals(typeName)){
                   
                            return  br.org.cipbancos.scg.webservice.dto.SCGResponse.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    