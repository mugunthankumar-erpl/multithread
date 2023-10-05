
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
 * <p>Java class for EmployeeQueryResponseWorkplaceOrganisationAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeQueryResponseWorkplaceOrganisationAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}AddressTypeCode"/&gt;
 *         &lt;element name="EMail" type="{http://sap.com/xi/A1S/Global}EmployeeQueryResponseAddressEmail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Facsimile" type="{http://sap.com/xi/A1S/Global}EmployeeQueryAddressFascimile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrganisationName" type="{http://sap.com/xi/A1S/Global}EmployeeQueryResponseAddressOrganisationName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" type="{http://sap.com/xi/A1S/Global}EmployeeQueryResponseAddressTelephone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Web" type="{http://sap.com/xi/A1S/Global}EmployeeQueryResponseAddressWeb" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PostalAddress" type="{http://sap.com/xi/A1S/Global}EmployeeQueryResponseAddressPostalAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeQueryResponseWorkplaceOrganisationAddress", propOrder = {
    "typeCode",
    "eMail",
    "facsimile",
    "organisationName",
    "telephone",
    "web",
    "postalAddress"
})
public class EmployeeQueryResponseWorkplaceOrganisationAddress {

    @XmlElement(name = "TypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCode;
    @XmlElement(name = "EMail")
    protected List<EmployeeQueryResponseAddressEmail> eMail;
    @XmlElement(name = "Facsimile")
    protected List<EmployeeQueryAddressFascimile> facsimile;
    @XmlElement(name = "OrganisationName")
    protected List<EmployeeQueryResponseAddressOrganisationName> organisationName;
    @XmlElement(name = "Telephone")
    protected List<EmployeeQueryResponseAddressTelephone> telephone;
    @XmlElement(name = "Web")
    protected List<EmployeeQueryResponseAddressWeb> web;
    @XmlElement(name = "PostalAddress")
    protected List<EmployeeQueryResponseAddressPostalAddress> postalAddress;

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eMail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeQueryResponseAddressEmail }
     * 
     * 
     */
    public List<EmployeeQueryResponseAddressEmail> getEMail() {
        if (eMail == null) {
            eMail = new ArrayList<EmployeeQueryResponseAddressEmail>();
        }
        return this.eMail;
    }

    /**
     * Gets the value of the facsimile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facsimile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacsimile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeQueryAddressFascimile }
     * 
     * 
     */
    public List<EmployeeQueryAddressFascimile> getFacsimile() {
        if (facsimile == null) {
            facsimile = new ArrayList<EmployeeQueryAddressFascimile>();
        }
        return this.facsimile;
    }

    /**
     * Gets the value of the organisationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeQueryResponseAddressOrganisationName }
     * 
     * 
     */
    public List<EmployeeQueryResponseAddressOrganisationName> getOrganisationName() {
        if (organisationName == null) {
            organisationName = new ArrayList<EmployeeQueryResponseAddressOrganisationName>();
        }
        return this.organisationName;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeQueryResponseAddressTelephone }
     * 
     * 
     */
    public List<EmployeeQueryResponseAddressTelephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<EmployeeQueryResponseAddressTelephone>();
        }
        return this.telephone;
    }

    /**
     * Gets the value of the web property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the web property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeQueryResponseAddressWeb }
     * 
     * 
     */
    public List<EmployeeQueryResponseAddressWeb> getWeb() {
        if (web == null) {
            web = new ArrayList<EmployeeQueryResponseAddressWeb>();
        }
        return this.web;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeQueryResponseAddressPostalAddress }
     * 
     * 
     */
    public List<EmployeeQueryResponseAddressPostalAddress> getPostalAddress() {
        if (postalAddress == null) {
            postalAddress = new ArrayList<EmployeeQueryResponseAddressPostalAddress>();
        }
        return this.postalAddress;
    }

}
