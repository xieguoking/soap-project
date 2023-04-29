/**
 * OdocExchangeWebServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.shdata.gateway.plugin.soap.server;

public interface OdocExchangeWebServicePortType extends java.rmi.Remote {
    public java.lang.String getAccessSystemData(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String getExchangeFields(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String receiveDocFromAK007AndUpdateFormDataByRequestId(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String sendData(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public java.lang.String sendBaseXMLEsbWebServiceToAk006(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public java.lang.String synchronizeOdocExchangeReceiveOrSendUnit(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String postDocOperateData(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public java.lang.String postReceivedRouteStatusData(int in0, java.lang.String in1) throws java.rmi.RemoteException;
    public java.lang.String login(java.lang.String in0, java.lang.String in1, int in2, java.lang.String in3) throws java.rmi.RemoteException;
    public java.lang.String updateReceiveDocStatus(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public java.lang.String getReceiveSystemXml(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String postReceivedOperateStatusData(int in0, java.lang.String in1) throws java.rmi.RemoteException;
    public java.lang.String receiveDocFromE8AndCreateWorkflow(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public java.lang.String receiveData(int in0, java.lang.String in1) throws java.rmi.RemoteException;
    public java.lang.String getDocOperateData(int in0, java.lang.String in1) throws java.rmi.RemoteException;
    public java.lang.String getAllUnProcessData(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
}
