/**
 * OdocExchangeWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.shdata.gateway.plugin.soap.server;

public class OdocExchangeWebServiceLocator extends org.apache.axis.client.Service implements com.shdata.gateway.plugin.soap.server.OdocExchangeWebService {

    public OdocExchangeWebServiceLocator() {
    }


    public OdocExchangeWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OdocExchangeWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OdocExchangeWebServiceHttpPort
    private java.lang.String OdocExchangeWebServiceHttpPort_address = "http://61.129.165.86:8080/services/OdocExchangeWebService";

    public java.lang.String getOdocExchangeWebServiceHttpPortAddress() {
        return OdocExchangeWebServiceHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OdocExchangeWebServiceHttpPortWSDDServiceName = "OdocExchangeWebServiceHttpPort";

    public java.lang.String getOdocExchangeWebServiceHttpPortWSDDServiceName() {
        return OdocExchangeWebServiceHttpPortWSDDServiceName;
    }

    public void setOdocExchangeWebServiceHttpPortWSDDServiceName(java.lang.String name) {
        OdocExchangeWebServiceHttpPortWSDDServiceName = name;
    }

    public com.shdata.gateway.plugin.soap.server.OdocExchangeWebServicePortType getOdocExchangeWebServiceHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OdocExchangeWebServiceHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOdocExchangeWebServiceHttpPort(endpoint);
    }

    public com.shdata.gateway.plugin.soap.server.OdocExchangeWebServicePortType getOdocExchangeWebServiceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.shdata.gateway.plugin.soap.server.OdocExchangeWebServiceHttpBindingStub _stub = new com.shdata.gateway.plugin.soap.server.OdocExchangeWebServiceHttpBindingStub(portAddress, this);
            _stub.setPortName(getOdocExchangeWebServiceHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOdocExchangeWebServiceHttpPortEndpointAddress(java.lang.String address) {
        OdocExchangeWebServiceHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.shdata.gateway.plugin.soap.server.OdocExchangeWebServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.shdata.gateway.plugin.soap.server.OdocExchangeWebServiceHttpBindingStub _stub = new com.shdata.gateway.plugin.soap.server.OdocExchangeWebServiceHttpBindingStub(new java.net.URL(OdocExchangeWebServiceHttpPort_address), this);
                _stub.setPortName(getOdocExchangeWebServiceHttpPortWSDDServiceName());
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
        if ("OdocExchangeWebServiceHttpPort".equals(inputPortName)) {
            return getOdocExchangeWebServiceHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost/services/OdocExchangeWebService", "OdocExchangeWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost/services/OdocExchangeWebService", "OdocExchangeWebServiceHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OdocExchangeWebServiceHttpPort".equals(portName)) {
            setOdocExchangeWebServiceHttpPortEndpointAddress(address);
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
