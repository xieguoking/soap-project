package com.shdata.gateway.plugin.soap;

import com.shdata.gateway.plugin.soap.client.OdocExchangeWebServiceLocator;
import com.shdata.gateway.plugin.soap.client.OdocExchangeWebServicePortType;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * @author xieguoking
 * @author (2023 / 4 / 26 add by xieguoking
 * @version 1.0
 * @since 1.0
 */
public class Client {
    public static void main(String[] args) throws ServiceException, RemoteException {
        final OdocExchangeWebServicePortType port = new OdocExchangeWebServiceLocator().getOdocExchangeWebServiceHttpPort();
        final String test = port.getAccessSystemData("test");

        System.out.println(test);
    }
}
