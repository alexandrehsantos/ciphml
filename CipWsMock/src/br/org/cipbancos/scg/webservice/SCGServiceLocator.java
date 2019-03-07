/**
 * SCGServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.org.cipbancos.scg.webservice;

public class SCGServiceLocator extends org.apache.axis.client.Service implements br.org.cipbancos.scg.webservice.SCGService {

    public SCGServiceLocator() {
    }


    public SCGServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SCGServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for controleGarantia
    private java.lang.String controleGarantia_address = "http://10.200.54.108:9080/webservice-scg/SCGService";

    public java.lang.String getcontroleGarantiaAddress() {
        return controleGarantia_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String controleGarantiaWSDDServiceName = "controleGarantia";

    public java.lang.String getcontroleGarantiaWSDDServiceName() {
        return controleGarantiaWSDDServiceName;
    }

    public void setcontroleGarantiaWSDDServiceName(java.lang.String name) {
        controleGarantiaWSDDServiceName = name;
    }

    public br.org.cipbancos.scg.webservice.ControleGarantia getcontroleGarantia() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(controleGarantia_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getcontroleGarantia(endpoint);
    }

    public br.org.cipbancos.scg.webservice.ControleGarantia getcontroleGarantia(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.org.cipbancos.scg.webservice.SCGServiceSOAPStub _stub = new br.org.cipbancos.scg.webservice.SCGServiceSOAPStub(portAddress, this);
            _stub.setPortName(getcontroleGarantiaWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setcontroleGarantiaEndpointAddress(java.lang.String address) {
        controleGarantia_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.org.cipbancos.scg.webservice.ControleGarantia.class.isAssignableFrom(serviceEndpointInterface)) {
                br.org.cipbancos.scg.webservice.SCGServiceSOAPStub _stub = new br.org.cipbancos.scg.webservice.SCGServiceSOAPStub(new java.net.URL(controleGarantia_address), this);
                _stub.setPortName(getcontroleGarantiaWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("controleGarantia".equals(inputPortName)) {
            return getcontroleGarantia();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.scg.cipbancos.org.br", "SCGService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.scg.cipbancos.org.br", "controleGarantia"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("controleGarantia".equals(portName)) {
            setcontroleGarantiaEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
