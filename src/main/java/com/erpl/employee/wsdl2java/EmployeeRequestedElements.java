
package com.erpl.employee.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EmployeeRequestedElements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeRequestedElements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Employee" type="{http://sap.com/xi/A1S/Global}EmployeeRequestedElementsEmployee" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="employeeTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeRequestedElements", propOrder = {
    "employee"
})
public class EmployeeRequestedElements {

    @XmlElement(name = "Employee")
    protected EmployeeRequestedElementsEmployee employee;
    @XmlAttribute(name = "employeeTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String employeeTransmissionRequestCode;

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeRequestedElementsEmployee }
     *     
     */
    public EmployeeRequestedElementsEmployee getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeRequestedElementsEmployee }
     *     
     */
    public void setEmployee(EmployeeRequestedElementsEmployee value) {
        this.employee = value;
    }

    /**
     * Gets the value of the employeeTransmissionRequestCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeTransmissionRequestCode() {
        return employeeTransmissionRequestCode;
    }

    /**
     * Sets the value of the employeeTransmissionRequestCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeTransmissionRequestCode(String value) {
        this.employeeTransmissionRequestCode = value;
    }

}
