
package com.erpl.employee.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeBasicDataByIdentificationQueryMessage_sync complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeBasicDataByIdentificationQueryMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmployeeBasicDataSelectionByIdentification" type="{http://sap.com/xi/A1S/Global}EmployeeBasicDataSelectionByIdentification" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingConditions" type="{http://sap.com/xi/AP/Common/GDT}QueryProcessingConditions" minOccurs="0"/&gt;
 *         &lt;element name="RequestedElements" type="{http://sap.com/xi/A1S/Global}EmployeeRequestedElements" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeBasicDataByIdentificationQueryMessage_sync", propOrder = {
    "employeeBasicDataSelectionByIdentification",
    "processingConditions",
    "requestedElements"
})
public class EmployeeBasicDataByIdentificationQueryMessageSync {

    @XmlElement(name = "EmployeeBasicDataSelectionByIdentification")
    protected EmployeeBasicDataSelectionByIdentification employeeBasicDataSelectionByIdentification;
    @XmlElement(name = "ProcessingConditions")
    protected QueryProcessingConditions processingConditions;
    @XmlElement(name = "RequestedElements")
    protected EmployeeRequestedElements requestedElements;

    /**
     * Gets the value of the employeeBasicDataSelectionByIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeBasicDataSelectionByIdentification }
     *     
     */
    public EmployeeBasicDataSelectionByIdentification getEmployeeBasicDataSelectionByIdentification() {
        return employeeBasicDataSelectionByIdentification;
    }

    /**
     * Sets the value of the employeeBasicDataSelectionByIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeBasicDataSelectionByIdentification }
     *     
     */
    public void setEmployeeBasicDataSelectionByIdentification(EmployeeBasicDataSelectionByIdentification value) {
        this.employeeBasicDataSelectionByIdentification = value;
    }

    /**
     * Gets the value of the processingConditions property.
     * 
     * @return
     *     possible object is
     *     {@link QueryProcessingConditions }
     *     
     */
    public QueryProcessingConditions getProcessingConditions() {
        return processingConditions;
    }

    /**
     * Sets the value of the processingConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryProcessingConditions }
     *     
     */
    public void setProcessingConditions(QueryProcessingConditions value) {
        this.processingConditions = value;
    }

    /**
     * Gets the value of the requestedElements property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeRequestedElements }
     *     
     */
    public EmployeeRequestedElements getRequestedElements() {
        return requestedElements;
    }

    /**
     * Sets the value of the requestedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeRequestedElements }
     *     
     */
    public void setRequestedElements(EmployeeRequestedElements value) {
        this.requestedElements = value;
    }

}
