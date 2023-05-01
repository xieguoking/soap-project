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
        final OdocExchangeWebServicePortType login = new OdocExchangeWebServiceLocator("http://192.168.2.84:6001/odoc/login").getOdocExchangeWebServiceHttpPort();
        System.out.println(login.login("xieguojun","password",1,""));

        final OdocExchangeWebServicePortType getAccessSystemData =
                new OdocExchangeWebServiceLocator("http://192.168.2.84:6001/odoc/getAccessSystemData").getOdocExchangeWebServiceHttpPort();
        System.out.println(getAccessSystemData.getAccessSystemData("谢国钧"));

        final OdocExchangeWebServicePortType getDocOperateData =
                new OdocExchangeWebServiceLocator("http://192.168.2.84:6001/odoc/getDocOperateData").getOdocExchangeWebServiceHttpPort();
        System.out.println(getDocOperateData.getDocOperateData(1,""));

        final OdocExchangeWebServicePortType sendData =
                new OdocExchangeWebServiceLocator("http://192.168.2.84:6001/odoc/sendData").getOdocExchangeWebServiceHttpPort();
        System.out.println(sendData.sendData("","谢国钧"));
    }
}
