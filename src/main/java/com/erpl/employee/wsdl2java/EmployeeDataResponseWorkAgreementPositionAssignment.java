
package com.erpl.employee.wsdl2java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeDataResponseWorkAgreementPositionAssignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeDataResponseWorkAgreementPositionAssignment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="PositionUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="PositionID" type="{http://sap.com/xi/AP/Common/GDT}PositionID" minOccurs="0"/&gt;
 *         &lt;element name="AssignmentPercent" type="{http://sap.com/xi/AP/Common/GDT}SMALLNONNEGATIVE_Percent" minOccurs="0"/&gt;
 *         &lt;element name="OrganisationalCenterDetails" type="{http://sap.com/xi/A1S/Global}EmployeeDataResponseWorkAgreementOrganisationalDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JobAssignmentDetails" type="{http://sap.com/xi/A1S/Global}EmployeeDataResponseWorkAgreementJobDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeDataResponseWorkAgreementPositionAssignment", propOrder = {
    "validityPeriod",
    "positionUUID",
    "positionID",
    "assignmentPercent",
    "organisationalCenterDetails",
    "jobAssignmentDetails"
})
public class EmployeeDataResponseWorkAgreementPositionAssignment {

    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "PositionUUID")
    protected UUID positionUUID;
    @XmlElement(name = "PositionID")
    protected PositionID positionID;
    @XmlElement(name = "AssignmentPercent")
    protected BigDecimal assignmentPercent;
    @XmlElement(name = "OrganisationalCenterDetails")
    protected List<EmployeeDataResponseWorkAgreementOrganisationalDetails> organisationalCenterDetails;
    @XmlElement(name = "JobAssignmentDetails")
    protected List<EmployeeDataResponseWorkAgreementJobDetails> jobAssignmentDetails;

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
     * Gets the value of the positionUUID property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getPositionUUID() {
        return positionUUID;
    }

    /**
     * Sets the value of the positionUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setPositionUUID(UUID value) {
        this.positionUUID = value;
    }

    /**
     * Gets the value of the positionID property.
     * 
     * @return
     *     possible object is
     *     {@link PositionID }
     *     
     */
    public PositionID getPositionID() {
        return positionID;
    }

    /**
     * Sets the value of the positionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionID }
     *     
     */
    public void setPositionID(PositionID value) {
        this.positionID = value;
    }

    /**
     * Gets the value of the assignmentPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAssignmentPercent() {
        return assignmentPercent;
    }

    /**
     * Sets the value of the assignmentPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAssignmentPercent(BigDecimal value) {
        this.assignmentPercent = value;
    }

    /**
     * Gets the value of the organisationalCenterDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationalCenterDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationalCenterDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeDataResponseWorkAgreementOrganisationalDetails }
     * 
     * 
     */
    public List<EmployeeDataResponseWorkAgreementOrganisationalDetails> getOrganisationalCenterDetails() {
        if (organisationalCenterDetails == null) {
            organisationalCenterDetails = new ArrayList<EmployeeDataResponseWorkAgreementOrganisationalDetails>();
        }
        return this.organisationalCenterDetails;
    }

    /**
     * Gets the value of the jobAssignmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobAssignmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobAssignmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeDataResponseWorkAgreementJobDetails }
     * 
     * 
     */
    public List<EmployeeDataResponseWorkAgreementJobDetails> getJobAssignmentDetails() {
        if (jobAssignmentDetails == null) {
            jobAssignmentDetails = new ArrayList<EmployeeDataResponseWorkAgreementJobDetails>();
        }
        return this.jobAssignmentDetails;
    }

}
