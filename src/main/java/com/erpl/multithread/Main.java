package com.erpl.multithread;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import com.erpl.businesslogic.FindEmployee;
import com.erpl.employee.wsdl2java.StandardFaultMessage_Exception;

public class Main {

	public static void main(String[] args) throws KeyManagementException, NoSuchAlgorithmException, StandardFaultMessage_Exception {
		FindEmployee findEmp = new FindEmployee();
		findEmp.employeeRequest();

	}

}
