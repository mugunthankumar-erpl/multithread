package com.erpl.businesslogic;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import com.erpl.employee.wsdl2java.EmployeeBasicDataByIdentificationQueryMessageSync;
import com.erpl.employee.wsdl2java.EmployeeBasicDataResponseMessageSync;
import com.erpl.employee.wsdl2java.EmployeeBasicDataSelectionByIdentification;
import com.erpl.employee.wsdl2java.EmployeeDataSelectionByIdentification;
import com.erpl.employee.wsdl2java.EmployeeDataSimpleByQueryMessageSync;
import com.erpl.employee.wsdl2java.EmployeeDataSimpleByResponseMessageSync;
import com.erpl.employee.wsdl2java.EmployeeID;
import com.erpl.employee.wsdl2java.EmployeeSelectionByEmployeeID;
import com.erpl.employee.wsdl2java.StandardFaultMessage_Exception;
import com.erplogic.material.utilities.BydSoapConnection;

public class FindEmployee {

	public void employeeRequest()
			throws KeyManagementException, NoSuchAlgorithmException, StandardFaultMessage_Exception {
		EmployeeDataSimpleByQueryMessageSync employeeBasicDataByIdentificationQueryMessageSync = new EmployeeDataSimpleByQueryMessageSync();
		EmployeeDataSelectionByIdentification basicDataSelectionByIdentification = new EmployeeDataSelectionByIdentification();
		EmployeeSelectionByEmployeeID employeeID = new EmployeeSelectionByEmployeeID();
		employeeID.setInclusionExclusionCode("I");
		employeeID.setIntervalBoundaryTypeCode("1");
		EmployeeID id = new EmployeeID();
		id.setValue("E0001");
		employeeID.setLowerBoundaryEmployeeID(id);
		employeeBasicDataByIdentificationQueryMessageSync
				.setEmployeeDataSelectionByIdentification(basicDataSelectionByIdentification);
		basicDataSelectionByIdentification.getSelectionByEmployeeID().add(employeeID);
		BydSoapConnection connection = new BydSoapConnection(

				"https://my350410.sapbydesign.com/sap/bc/srt/scs/sap/queryemployeein", "_THREADJAVAS", "Welcome01",
				"Query Employees");
		EmployeeDataSimpleByResponseMessageSync response = connection
				.materialFindRequest(employeeBasicDataByIdentificationQueryMessageSync);
		String note = response.getEmployeeData().get(0).getEmployeeID().getValue();
		System.out.println(note);
	}

}
