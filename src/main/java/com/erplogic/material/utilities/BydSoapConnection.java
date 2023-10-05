package com.erplogic.material.utilities;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.xml.ws.BindingProvider;

import com.erpl.employee.wsdl2java.EmployeeDataSimpleByQueryMessageSync;
import com.erpl.employee.wsdl2java.EmployeeDataSimpleByResponseMessageSync;
import com.erpl.employee.wsdl2java.FindService;
import com.erpl.employee.wsdl2java.QueryEmployeeIn;
import com.erpl.employee.wsdl2java.StandardFaultMessage_Exception;

public class BydSoapConnection {
	private String webServiceUrl;
	private String webServiceUserName;
	private String webServicePassword;
	private String webServiceName;

	// wsdl 1
	private FindService findService;
	private QueryEmployeeIn queryMaterialPort;

	

	private Map<String, Object> context;

	public BydSoapConnection(final String webServiceUrl, final String webServiceUserName,
			final String webServicePassword, final String webServiceName)
			throws KeyManagementException, NoSuchAlgorithmException, KeyManagementException, NoSuchAlgorithmException {
		this.webServiceUrl = webServiceUrl;
		this.webServiceUserName = webServiceUserName;
		this.webServicePassword = webServicePassword;
		this.webServiceName = webServiceName;
		if (this.webServiceName.equalsIgnoreCase("Query Employees")) {
			findService = new FindService();
			queryMaterialPort = findService.getBinding();
			context = ((BindingProvider) queryMaterialPort).getRequestContext();
		} 
		// ADDING URL AND CREDENTIALS FOR CONNECT WEBSERVICES
		context.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.webServiceUrl);
		context.put(BindingProvider.USERNAME_PROPERTY, this.webServiceUserName);
		context.put(BindingProvider.PASSWORD_PROPERTY, this.webServicePassword);

		SSLContext sSLContext = SSLContext.getInstance("SSL");
		TrustManager[] trustAllCerts = null;
		sSLContext.init(null, trustAllCerts, new java.security.SecureRandom());
		HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
	}

	public EmployeeDataSimpleByResponseMessageSync materialFindRequest(EmployeeDataSimpleByQueryMessageSync queryReq)
			throws StandardFaultMessage_Exception {

		return queryMaterialPort.findByIdentification(queryReq);

	}
	
//	    public CustomerInvoiceRequestMaintainConfirmationBundleMessageSyncV1 customerInvRequest(
//	        final CustomerInvoiceRequestMaintainRequestBundleMessageSync customerReq) throws Exception {
//
//	        try {
//	            return customerInvPort.maintainBundle(customerReq);
//	        } catch (com.sun.xml.ws.fault.ServerSOAPFaultException e) {
//
//	            throw new ApplicationException(
//	                new ErrorMessage(List.of("CustomerInvoice >>" + e.getFault().getFaultString())),
//	                HttpStatus.INTERNAL_SERVER_ERROR);
//	        }
//
//	    }

}
