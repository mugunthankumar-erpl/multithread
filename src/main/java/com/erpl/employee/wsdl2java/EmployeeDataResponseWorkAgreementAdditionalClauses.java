
package com.erpl.employee.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EmployeeDataResponseWorkAgreementAdditionalClauses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeDataResponseWorkAgreementAdditionalClauses"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="AgreedWorkingTimeRate" type="{http://sap.com/xi/AP/Common/GDT}AgreedWorkingHoursRate" minOccurs="0"/&gt;
 *         &lt;element name="WorkAgreementTypeCode" type="{http://sap.com/xi/AP/Common/GDT}WorkAgreementTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="WorkAgreementAdministrativeCategoryCode" type="{http://sap.com/xi/AP/Common/GDT}WorkAgreementAdministrativeCategoryCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeDataResponseWorkAgreementAdditionalClauses", propOrder = {
    "validityPeriod",
    "agreedWorkingTimeRate",
    "workAgreementTypeCode",
    "workAgreementAdministrativeCategoryCode"
})
public class EmployeeDataResponseWorkAgreementAdditionalClauses {

    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "AgreedWorkingTimeRate")
    protected AgreedWorkingHoursRate agreedWorkingTimeRate;
    @XmlElement(name = "WorkAgreementTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String workAgreementTypeCode;
    @XmlElement(name = "WorkAgreementAdministrativeCategoryCode")
    protected WorkAgreementAdministrativeCategoryCode workAgreementAdministrativeCategoryCode;

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public CLOSEDDatePeriod getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public void setValidityPeriod(CLOSEDDatePeriod value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the agreedWorkingTimeRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedWorkingHoursRate }
     *     
     */
    public AgreedWorkingHoursRate getAgreedWorkingTimeRate() {
        return agreedWorkingTimeRate;
    }

    /**
     * Sets the value of the agreedWorkingTimeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedWorkingHoursRate }
     *     
     */
    public void setAgreedWorkingTimeRate(AgreedWorkingHoursRate value) {
        this.agreedWorkingTimeRate = value;
    }

    /**
     * Gets the value of the workAgreementTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkAgreementTypeCode() {
        return workAgreementTypeCode;
    }

    /**
     * Sets the value of the workAgreementTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkAgreementTypeCode(String value) {
        this.workAgreementTypeCode = value;
    }

    /**
     * Gets the value of the workAgreementAdministrativeCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link WorkAgreementAdministrativeCategoryCode }
     *     
     */
    public WorkAgreementAdministrativeCategoryCode getWorkAgreementAdministrativeCategoryCode() {
        return workAgreementAdministrativeCategoryCode;
    }

    /**
     * Sets the value of the workAgreementAdministrativeCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkAgreementAdministrativeCategoryCode }
     *     
     */
    public void setWorkAgreementAdministrativeCategoryCode(WorkAgreementAdministrativeCategoryCode value) {
        this.workAgreementAdministrativeCategoryCode = value;
    }

}
