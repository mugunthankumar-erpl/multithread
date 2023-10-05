
package com.erpl.employee.wsdl2java;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeDataResponseWorkAgreementOrganisationalValidityPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeDataResponseWorkAgreementOrganisationalValidityPeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="PositionAssignment" type="{http://sap.com/xi/A1S/Global}EmployeeDataResponseWorkAgreementPositionAssignment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReportingLineUnit" type="{http://sap.com/xi/A1S/Global}EmployeeDataResponseWorkAgreementReportingLineUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CostCenter" type="{http://sap.com/xi/A1S/Global}EmployeeDataResponseWorkAgreementCostCenter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeDataResponseWorkAgreementOrganisationalValidityPeriod", propOrder = {
    "validityPeriod",
    "positionAssignment",
    "reportingLineUnit",
    "costCenter"
})
public class EmployeeDataResponseWorkAgreementOrganisationalValidityPeriod {

    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "PositionAssignment")
    protected List<EmployeeDataResponseWorkAgreementPositionAssignment> positionAssignment;
    @XmlElement(name = "ReportingLineUnit")
    protected List<EmployeeDataResponseWorkAgreementReportingLineUnit> reportingLineUnit;
    @XmlElement(name = "CostCenter")
    protected List<EmployeeDataResponseWorkAgreementCostCenter> costCenter;

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
     * Gets the value of the positionAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeDataResponseWorkAgreementPositionAssignment }
     * 
     * 
     */
    public List<EmployeeDataResponseWorkAgreementPositionAssignment> getPositionAssignment() {
        if (positionAssignment == null) {
            positionAssignment = new ArrayList<EmployeeDataResponseWorkAgreementPositionAssignment>();
        }
        return this.positionAssignment;
    }

    /**
     * Gets the value of the reportingLineUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportingLineUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportingLineUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeDataResponseWorkAgreementReportingLineUnit }
     * 
     * 
     */
    public List<EmployeeDataResponseWorkAgreementReportingLineUnit> getReportingLineUnit() {
        if (reportingLineUnit == null) {
            reportingLineUnit = new ArrayList<EmployeeDataResponseWorkAgreementReportingLineUnit>();
        }
        return this.reportingLineUnit;
    }

    /**
     * Gets the value of the costCenter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costCenter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostCenter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeDataResponseWorkAgreementCostCenter }
     * 
     * 
     */
    public List<EmployeeDataResponseWorkAgreementCostCenter> getCostCenter() {
        if (costCenter == null) {
            costCenter = new ArrayList<EmployeeDataResponseWorkAgreementCostCenter>();
        }
        return this.costCenter;
    }

}
