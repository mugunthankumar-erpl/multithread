
package com.erpl.employee.wsdl2java;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeDataSelectionByIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeDataSelectionByIdentification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionByEmployeeID" type="{http://sap.com/xi/A1S/Global}EmployeeSelectionByEmployeeID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByEmployeeFamilyName" type="{http://sap.com/xi/A1S/Global}EmployeeSelectionByEmployeeFamilyName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByEmployeeGivenName" type="{http://sap.com/xi/A1S/Global}EmployeeSelectionByEmployeeGivenName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySearchText" type="{http://sap.com/xi/AP/Common/GDT}SearchText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeDataSelectionByIdentification", propOrder = {
    "selectionByEmployeeID",
    "selectionByEmployeeFamilyName",
    "selectionByEmployeeGivenName",
    "selectionBySearchText"
})
public class EmployeeDataSelectionByIdentification {

    @XmlElement(name = "SelectionByEmployeeID")
    protected List<EmployeeSelectionByEmployeeID> selectionByEmployeeID;
    @XmlElement(name = "SelectionByEmployeeFamilyName")
    protected List<EmployeeSelectionByEmployeeFamilyName> selectionByEmployeeFamilyName;
    @XmlElement(name = "SelectionByEmployeeGivenName")
    protected List<EmployeeSelectionByEmployeeGivenName> selectionByEmployeeGivenName;
    @XmlElement(name = "SelectionBySearchText")
    protected String selectionBySearchText;

    /**
     * Gets the value of the selectionByEmployeeID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByEmployeeID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByEmployeeID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeSelectionByEmployeeID }
     * 
     * 
     */
    public List<EmployeeSelectionByEmployeeID> getSelectionByEmployeeID() {
        if (selectionByEmployeeID == null) {
            selectionByEmployeeID = new ArrayList<EmployeeSelectionByEmployeeID>();
        }
        return this.selectionByEmployeeID;
    }

    /**
     * Gets the value of the selectionByEmployeeFamilyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByEmployeeFamilyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByEmployeeFamilyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeSelectionByEmployeeFamilyName }
     * 
     * 
     */
    public List<EmployeeSelectionByEmployeeFamilyName> getSelectionByEmployeeFamilyName() {
        if (selectionByEmployeeFamilyName == null) {
            selectionByEmployeeFamilyName = new ArrayList<EmployeeSelectionByEmployeeFamilyName>();
        }
        return this.selectionByEmployeeFamilyName;
    }

    /**
     * Gets the value of the selectionByEmployeeGivenName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByEmployeeGivenName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByEmployeeGivenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeSelectionByEmployeeGivenName }
     * 
     * 
     */
    public List<EmployeeSelectionByEmployeeGivenName> getSelectionByEmployeeGivenName() {
        if (selectionByEmployeeGivenName == null) {
            selectionByEmployeeGivenName = new ArrayList<EmployeeSelectionByEmployeeGivenName>();
        }
        return this.selectionByEmployeeGivenName;
    }

    /**
     * Gets the value of the selectionBySearchText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionBySearchText() {
        return selectionBySearchText;
    }

    /**
     * Sets the value of the selectionBySearchText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionBySearchText(String value) {
        this.selectionBySearchText = value;
    }

}
