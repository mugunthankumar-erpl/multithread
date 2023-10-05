
package com.erpl.employee.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeDataSimpleByQueryMessage_sync complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeDataSimpleByQueryMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmployeeDataSelectionByIdentification" type="{http://sap.com/xi/A1S/Global}EmployeeDataSelectionByIdentification" minOccurs="0"/&gt;
 *         &lt;element name="PROCESSING_CONDITIONS" type="{http://sap.com/xi/AP/Common/GDT}QueryProcessingConditions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeDataSimpleByQueryMessage_sync", propOrder = {
    "employeeDataSelectionByIdentification",
    "processingconditions"
})
public class EmployeeDataSimpleByQueryMessageSync {

    @XmlElement(name = "EmployeeDataSelectionByIdentification")
    protected EmployeeDataSelectionByIdentification employeeDataSelectionByIdentification;
    @XmlElement(name = "PROCESSING_CONDITIONS")
    protected QueryProcessingConditions processingconditions;

    /**
     * Gets the value of the employeeDataSelectionByIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDataSelectionByIdentification }
     *     
     */
    public EmployeeDataSelectionByIdentification getEmployeeDataSelectionByIdentification() {
        return employeeDataSelectionByIdentification;
    }

    /**
     * Sets the value of the employeeDataSelectionByIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDataSelectionByIdentification }
     *     
     */
    public void setEmployeeDataSelectionByIdentification(EmployeeDataSelectionByIdentification value) {
        this.employeeDataSelectionByIdentification = value;
    }

    /**
     * Gets the value of the processingconditions property.
     * 
     * @return
     *     possible object is
     *     {@link QueryProcessingConditions }
     *     
     */
    public QueryProcessingConditions getPROCESSINGCONDITIONS() {
        return processingconditions;
    }

    /**
     * Sets the value of the processingconditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryProcessingConditions }
     *     
     */
    public void setPROCESSINGCONDITIONS(QueryProcessingConditions value) {
        this.processingconditions = value;
    }

}
