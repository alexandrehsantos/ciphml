/**
 * ControleGarantia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.org.cipbancos.scg.webservice;

public interface ControleGarantia extends java.rmi.Remote {
    public br.org.cipbancos.scg.webservice.dto.SCGResponse executeOperation(br.org.cipbancos.scg.webservice.dto.SCGRequest scgRequest) throws java.rmi.RemoteException;
    public br.org.cipbancos.scg.webservice.dto.SCGResponse retryByConfirmationOperation(java.lang.String confirmation) throws java.rmi.RemoteException;
    public br.org.cipbancos.scg.webservice.dto.SCGResponse retryByIdOperation(java.lang.String id) throws java.rmi.RemoteException;
}
