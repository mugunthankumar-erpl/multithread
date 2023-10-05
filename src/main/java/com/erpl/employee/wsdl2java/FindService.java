package com.erpl.employee.wsdl2java;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 3.5.3 2023-10-05T16:45:18.560+05:30
 * Generated source version: 3.5.3
 *
 */
@WebServiceClient(name = "service", wsdlLocation = "/integrationhome/wsdl/emp.wsdl", targetNamespace = "http://sap.com/xi/A1S/Global")
public class FindService extends javax.xml.ws.Service {

	public final static URL WSDL_LOCATION;

	public final static QName SERVICE = new QName("http://sap.com/xi/A1S/Global", "service");
	public final static QName Binding = new QName("http://sap.com/xi/A1S/Global", "binding");
	public final static QName BindingSOAP12 = new QName("http://sap.com/xi/A1S/Global", "binding_SOAP12");
	static {
		URL url = null;
		try {
			url = new URL("file:///" + System.getProperty("user.dir") + "/integrationhome/wsdl/emp.wsdl");
		} catch (MalformedURLException e) {
			java.util.logging.Logger.getLogger(FindService.class.getName()).log(java.util.logging.Level.INFO,
					"Can not initialize the default wsdl from {0}",
					"file:/D:/eclipse_workplace2/Testing/integrationhome/wsdl/emp.wsdl");
		}
		WSDL_LOCATION = url;
	}

	public FindService(URL wsdlLocation) {
		super(wsdlLocation, SERVICE);
	}

	public FindService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public FindService() {
		super(WSDL_LOCATION, SERVICE);
	}

	/**
	 *
	 * @return returns QueryEmployeeIn
	 */
	@WebEndpoint(name = "binding")
	public QueryEmployeeIn getBinding() {
		return super.getPort(Binding, QueryEmployeeIn.class);
	}

	/**
	 *
	 * @return returns QueryEmployeeIn
	 */
	@WebEndpoint(name = "binding_SOAP12")
	public QueryEmployeeIn getBindingSOAP12() {
		return super.getPort(BindingSOAP12, QueryEmployeeIn.class);
	}

}
