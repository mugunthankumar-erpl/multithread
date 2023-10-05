
package com.erpl.employee.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeReponseEmployeeWorkplaceAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeReponseEmployeeWorkplaceAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrganisationalPostalAddress" type="{http://sap.com/xi/A1S/Global}EmployeeReponseEmployeeOrganisationalAddressPostalAddress" minOccurs="0"/&gt;
 *         &lt;element name="Workplace" type="{http://sap.com/xi/A1S/Global}EmployeeReponseEmployeeWorkplaceAddressWorkplace" minOccurs="0"/&gt;
 *         &lt;element name="EmailURI" type="{http://sap.com/xi/AP/Common/GDT}EmailURI" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="MobilePhone" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="FormattedAddress" type="{http://sap.com/xi/A1S/Global}EmployeeReponseEmployeeFormattedAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeReponseEmployeeWorkplaceAddress", propOrder = {
    "organisationalPostalAddress",
    "workplace",
    "emailURI",
    "fax",
    "phone",
    "mobilePhone",
    "formattedAddress"
})
public class EmployeeReponseEmployeeWorkplaceAddress {

    @XmlElement(name = "OrganisationalPostalAddress")
    protected EmployeeReponseEmployeeOrganisationalAddressPostalAddress organisationalPostalAddress;
    @XmlElement(name = "Workplace")
    protected EmployeeReponseEmployeeWorkplaceAddressWorkplace workplace;
    @XmlElement(name = "EmailURI")
    protected EmailURI emailURI;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "MobilePhone")
    protected String mobilePhone;
    @XmlElement(name = "FormattedAddress")
    protected EmployeeReponseEmployeeFormattedAddress formattedAddress;

    /**
     * Gets the value of the organisationalPostalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeReponseEmployeeOrganisationalAddressPostalAddress }
     *     
     */
    public EmployeeReponseEmployeeOrganisationalAddressPostalAddress getOrganisationalPostalAddress() {
        return organisationalPostalAddress;
    }

    /**
     * Sets the value of the organisationalPostalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeReponseEmployeeOrganisationalAddressPostalAddress }
     *     
     */
    public void setOrganisationalPostalAddress(EmployeeReponseEmployeeOrganisationalAddressPostalAddress value) {
        this.organisationalPostalAddress = value;
    }

    /**
     * Gets the value of the workplace property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeReponseEmployeeWorkplaceAddressWorkplace }
     *     
     */
    public EmployeeReponseEmployeeWorkplaceAddressWorkplace getWorkplace() {
        return workplace;
    }

    /**
     * Sets the value of the workplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeReponseEmployeeWorkplaceAddressWorkplace }
     *     
     */
    public void setWorkplace(EmployeeReponseEmployeeWorkplaceAddressWorkplace value) {
        this.workplace = value;
    }

    /**
     * Gets the value of the emailURI property.
     * 
     * @return
     *     possible object is
     *     {@link EmailURI }
     *     
     */
    public EmailURI getEmailURI() {
        return emailURI;
    }

    /**
     * Sets the value of the emailURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailURI }
     *     
     */
    public void setEmailURI(EmailURI value) {
        this.emailURI = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the formattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeReponseEmployeeFormattedAddress }
     *     
     */
    public EmployeeReponseEmployeeFormattedAddress getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Sets the value of the formattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeReponseEmployeeFormattedAddress }
     *     
     */
    public void setFormattedAddress(EmployeeReponseEmployeeFormattedAddress value) {
        this.formattedAddress = value;
    }

}
