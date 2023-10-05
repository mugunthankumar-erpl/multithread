
package com.erpl.employee.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeBiographicalDataByIdentificationQueryMessage_sync complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeBiographicalDataByIdentificationQueryMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmployeeBiographicalDataSelectionByIdentification" type="{http://sap.com/xi/A1S/Global}EmployeeBiographicalDataSelectionByIdentification" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingConditions" type="{http://sap.com/xi/AP/Common/GDT}QueryProcessingConditions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeBiographicalDataByIdentificationQueryMessage_sync", propOrder = {
    "employeeBiographicalDataSelectionByIdentification",
    "processingConditions"
})
public class EmployeeBiographicalDataByIdentificationQueryMessageSync {

    @XmlElement(name = "EmployeeBiographicalDataSelectionByIdentification")
    protected EmployeeBiographicalDataSelectionByIdentification employeeBiographicalDataSelectionByIdentification;
    @XmlElement(name = "ProcessingConditions")
    protected QueryProcessingConditions processingConditions;

    /**
     * Gets the value of the employeeBiographicalDataSelectionByIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeBiographicalDataSelectionByIdentification }
     *     
     */
    public EmployeeBiographicalDataSelectionByIdentification getEmployeeBiographicalDataSelectionByIdentification() {
        return employeeBiographicalDataSelectionByIdentification;
    }

    /**
     * Sets the value of the employeeBiographicalDataSelectionByIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeBiographicalDataSelectionByIdentification }
     *     
     */
    public void setEmployeeBiographicalDataSelectionByIdentification(EmployeeBiographicalDataSelectionByIdentification value) {
        this.employeeBiographicalDataSelectionByIdentification = value;
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

}
