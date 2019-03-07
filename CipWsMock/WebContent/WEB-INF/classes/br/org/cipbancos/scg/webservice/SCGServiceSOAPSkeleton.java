/**
 * SCGServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.org.cipbancos.scg.webservice;

public class SCGServiceSOAPSkeleton implements br.org.cipbancos.scg.webservice.ControleGarantia, org.apache.axis.wsdl.Skeleton {
    private br.org.cipbancos.scg.webservice.ControleGarantia impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservice.scg.cipbancos.org.br", "scgRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.webservice.scg.cipbancos.org.br", "SCGRequest"), br.org.cipbancos.scg.webservice.dto.SCGRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("executeOperation", _params, new javax.xml.namespace.QName("http://webservice.scg.cipbancos.org.br", "scgResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dto.webservice.scg.cipbancos.org.br", "SCGResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "executeOperation"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("executeOperation") == null) {
            _myOperations.put("executeOperation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("executeOperation")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservice.scg.cipbancos.org.br", "confirmation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("retryByConfirmationOperation", _params, new javax.xml.namespace.QName("http://webservice.scg.cipbancos.org.br", "scgResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dto.webservice.scg.cipbancos.org.br", "SCGResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "retryByConfirmationOperation"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("retryByConfirmationOperation") == null) {
            _myOperations.put("retryByConfirmationOperation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("retryByConfirmationOperation")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservice.scg.cipbancos.org.br", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("retryByIdOperation", _params, new javax.xml.namespace.QName("http://webservice.scg.cipbancos.org.br", "scgResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dto.webservice.scg.cipbancos.org.br", "SCGResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "retryByIdOperation"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("retryByIdOperation") == null) {
            _myOperations.put("retryByIdOperation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("retryByIdOperation")).add(_oper);
    }

    public SCGServiceSOAPSkeleton() {
        this.impl = new br.org.cipbancos.scg.webservice.SCGServiceSOAPImpl();
    }

    public SCGServiceSOAPSkeleton(br.org.cipbancos.scg.webservice.ControleGarantia impl) {
        this.impl = impl;
    }
    public br.org.cipbancos.scg.webservice.dto.SCGResponse executeOperation(br.org.cipbancos.scg.webservice.dto.SCGRequest scgRequest) throws java.rmi.RemoteException
    {
        br.org.cipbancos.scg.webservice.dto.SCGResponse ret = impl.executeOperation(scgRequest);
        return ret;
    }

    public br.org.cipbancos.scg.webservice.dto.SCGResponse retryByConfirmationOperation(java.lang.String confirmation) throws java.rmi.RemoteException
    {
        br.org.cipbancos.scg.webservice.dto.SCGResponse ret = impl.retryByConfirmationOperation(confirmation);
        return ret;
    }

    public br.org.cipbancos.scg.webservice.dto.SCGResponse retryByIdOperation(java.lang.String id) throws java.rmi.RemoteException
    {
        br.org.cipbancos.scg.webservice.dto.SCGResponse ret = impl.retryByIdOperation(id);
        return ret;
    }

}
