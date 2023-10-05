
package com.erpl.employee.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EmployeeSelectionByCreationIdentityID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeSelectionByCreationIdentityID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="LowerBoundaryEmployeeCreationIdentityID" type="{http://sap.com/xi/AP/Common/GDT}IdentityID" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryEmployeeCreationIdentityID" type="{http://sap.com/xi/AP/Common/GDT}IdentityID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeSelectionByCreationIdentityID", propOrder = {
    "inclusionExclusionCode",
    "intervalBoundaryTypeCode",
    "lowerBoundaryEmployeeCreationIdentityID",
    "upperBoundaryEmployeeCreationIdentityID"
})
public class EmployeeSelectionByCreationIdentityID {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryEmployeeCreationIdentityID")
    protected IdentityID lowerBoundaryEmployeeCreationIdentityID;
    @XmlElement(name = "UpperBoundaryEmployeeCreationIdentityID")
    protected IdentityID upperBoundaryEmployeeCreationIdentityID;

    /**
     * Gets the value of the inclusionExclusionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInclusionExclusionCode() {
        return inclusionExclusionCode;
    }

    /**
     * Sets the value of the inclusionExclusionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInclusionExclusionCode(String value) {
        this.inclusionExclusionCode = value;
    }

    /**
     * Gets the value of the intervalBoundaryTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntervalBoundaryTypeCode() {
        return intervalBoundaryTypeCode;
    }

    /**
     * Sets the value of the intervalBoundaryTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntervalBoundaryTypeCode(String value) {
        this.intervalBoundaryTypeCode = value;
    }

    /**
     * Gets the value of the lowerBoundaryEmployeeCreationIdentityID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityID }
     *     
     */
    public IdentityID getLowerBoundaryEmployeeCreationIdentityID() {
        return lowerBoundaryEmployeeCreationIdentityID;
    }

    /**
     * Sets the value of the lowerBoundaryEmployeeCreationIdentityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityID }
     *     
     */
    public void setLowerBoundaryEmployeeCreationIdentityID(IdentityID value) {
        this.lowerBoundaryEmployeeCreationIdentityID = value;
    }

    /**
     * Gets the value of the upperBoundaryEmployeeCreationIdentityID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityID }
     *     
     */
    public IdentityID getUpperBoundaryEmployeeCreationIdentityID() {
        return upperBoundaryEmployeeCreationIdentityID;
    }

    /**
     * Sets the value of the upperBoundaryEmployeeCreationIdentityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityID }
     *     
     */
    public void setUpperBoundaryEmployeeCreationIdentityID(IdentityID value) {
        this.upperBoundaryEmployeeCreationIdentityID = value;
    }

}
