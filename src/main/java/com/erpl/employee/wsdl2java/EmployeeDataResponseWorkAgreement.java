
package com.erpl.employee.wsdl2java;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EmployeeDataResponseWorkAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeDataResponseWorkAgreement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ChangeStateID" type="{http://sap.com/xi/AP/Common/GDT}ChangeStateID" minOccurs="0"/&gt;
 *         &lt;element name="WorkAgreementID" type="{http://sap.com/xi/AP/Common/GDT}WorkAgreementID"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}CLOSED_DatePeriod"/&gt;
 *         &lt;element name="AdditionalClauses" type="{http://sap.com/xi/A1S/Global}EmployeeDataResponseWorkAgreementAdditionalClauses" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrganisationalAssignment" type="{http://sap.com/xi/A1S/Global}EmployeeDataResponseWorkAgreementOrganisationalValidityPeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeDataResponseWorkAgreement", propOrder = {
    "uuid",
    "changeStateID",
    "workAgreementID",
    "validityPeriod",
    "additionalClauses",
    "organisationalAssignment"
})
public class EmployeeDataResponseWorkAgreement {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "ChangeStateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String changeStateID;
    @XmlElement(name = "WorkAgreementID", required = true)
    protected WorkAgreementID workAgreementID;
    @XmlElement(name = "ValidityPeriod", required = true)
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "AdditionalClauses")
    protected List<EmployeeDataResponseWorkAgreementAdditionalClauses> additionalClauses;
    @XmlElement(name = "OrganisationalAssignment")
    protected List<EmployeeDataResponseWorkAgreementOrganisationalValidityPeriod> organisationalAssignment;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the changeStateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeStateID() {
        return changeStateID;
    }

    /**
     * Sets the value of the changeStateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeStateID(String value) {
        this.changeStateID = value;
    }

    /**
     * Gets the value of the workAgreementID property.
     * 
     * @return
     *     possible object is
     *     {@link WorkAgreementID }
     *     
     */
    public WorkAgreementID getWorkAgreementID() {
        return workAgreementID;
    }

    /**
     * Sets the value of the workAgreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkAgreementID }
     *     
     */
    public void setWorkAgreementID(WorkAgreementID value) {
        this.workAgreementID = value;
    }

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
     * Gets the value of the additionalClauses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalClauses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalClauses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeDataResponseWorkAgreementAdditionalClauses }
     * 
     * 
     */
    public List<EmployeeDataResponseWorkAgreementAdditionalClauses> getAdditionalClauses() {
        if (additionalClauses == null) {
            additionalClauses = new ArrayList<EmployeeDataResponseWorkAgreementAdditionalClauses>();
        }
        return this.additionalClauses;
    }

    /**
     * Gets the value of the organisationalAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationalAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationalAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeDataResponseWorkAgreementOrganisationalValidityPeriod }
     * 
     * 
     */
    public List<EmployeeDataResponseWorkAgreementOrganisationalValidityPeriod> getOrganisationalAssignment() {
        if (organisationalAssignment == null) {
            organisationalAssignment = new ArrayList<EmployeeDataResponseWorkAgreementOrganisationalValidityPeriod>();
        }
        return this.organisationalAssignment;
    }

}
