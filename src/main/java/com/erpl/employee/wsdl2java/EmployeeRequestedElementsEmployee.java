
package com.erpl.employee.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EmployeeRequestedElementsEmployee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeRequestedElementsEmployee"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="BiographicalDataTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="WorkplaceAddressInformationTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="JobAssignmentTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeRequestedElementsEmployee", propOrder = {
    "value"
})
public class EmployeeRequestedElementsEmployee {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "BiographicalDataTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String biographicalDataTransmissionRequestCode;
    @XmlAttribute(name = "WorkplaceAddressInformationTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String workplaceAddressInformationTransmissionRequestCode;
    @XmlAttribute(name = "JobAssignmentTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String jobAssignmentTransmissionRequestCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the biographicalDataTransmissionRequestCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiographicalDataTransmissionRequestCode() {
        return biographicalDataTransmissionRequestCode;
    }

    /**
     * Sets the value of the biographicalDataTransmissionRequestCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiographicalDataTransmissionRequestCode(String value) {
        this.biographicalDataTransmissionRequestCode = value;
    }

    /**
     * Gets the value of the workplaceAddressInformationTransmissionRequestCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkplaceAddressInformationTransmissionRequestCode() {
        return workplaceAddressInformationTransmissionRequestCode;
    }

    /**
     * Sets the value of the workplaceAddressInformationTransmissionRequestCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkplaceAddressInformationTransmissionRequestCode(String value) {
        this.workplaceAddressInformationTransmissionRequestCode = value;
    }

    /**
     * Gets the value of the jobAssignmentTransmissionRequestCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobAssignmentTransmissionRequestCode() {
        return jobAssignmentTransmissionRequestCode;
    }

    /**
     * Sets the value of the jobAssignmentTransmissionRequestCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobAssignmentTransmissionRequestCode(String value) {
        this.jobAssignmentTransmissionRequestCode = value;
    }

}
