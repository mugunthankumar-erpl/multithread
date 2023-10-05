
package com.erpl.employee.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeReponseEmployeeFormattedAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeReponseEmployeeFormattedAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormattedAddressDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="FormattedPostalAddressDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="FormattedAddress" type="{http://sap.com/xi/AP/Common/GDT}FormattedAddress" minOccurs="0"/&gt;
 *         &lt;element name="FormattedPostalAddress" type="{http://sap.com/xi/AP/Common/GDT}FormattedPostalAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeReponseEmployeeFormattedAddress", propOrder = {
    "formattedAddressDescription",
    "formattedPostalAddressDescription",
    "formattedAddress",
    "formattedPostalAddress"
})
public class EmployeeReponseEmployeeFormattedAddress {

    @XmlElement(name = "FormattedAddressDescription")
    protected String formattedAddressDescription;
    @XmlElement(name = "FormattedPostalAddressDescription")
    protected String formattedPostalAddressDescription;
    @XmlElement(name = "FormattedAddress")
    protected FormattedAddress formattedAddress;
    @XmlElement(name = "FormattedPostalAddress")
    protected FormattedPostalAddress formattedPostalAddress;

    /**
     * Gets the value of the formattedAddressDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedAddressDescription() {
        return formattedAddressDescription;
    }

    /**
     * Sets the value of the formattedAddressDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedAddressDescription(String value) {
        this.formattedAddressDescription = value;
    }

    /**
     * Gets the value of the formattedPostalAddressDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedPostalAddressDescription() {
        return formattedPostalAddressDescription;
    }

    /**
     * Sets the value of the formattedPostalAddressDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedPostalAddressDescription(String value) {
        this.formattedPostalAddressDescription = value;
    }

    /**
     * Gets the value of the formattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedAddress }
     *     
     */
    public FormattedAddress getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Sets the value of the formattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedAddress }
     *     
     */
    public void setFormattedAddress(FormattedAddress value) {
        this.formattedAddress = value;
    }

    /**
     * Gets the value of the formattedPostalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedPostalAddress }
     *     
     */
    public FormattedPostalAddress getFormattedPostalAddress() {
        return formattedPostalAddress;
    }

    /**
     * Sets the value of the formattedPostalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedPostalAddress }
     *     
     */
    public void setFormattedPostalAddress(FormattedPostalAddress value) {
        this.formattedPostalAddress = value;
    }

}
