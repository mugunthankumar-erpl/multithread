
package com.erpl.employee.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeQueryResponseAddressTelephone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeQueryResponseAddressTelephone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TelephoneFormattedNumberDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="NormalisedNumberDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="UsageDeniedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="MobilePhoneNumberIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="DefaultIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="SMSEnabledIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeQueryResponseAddressTelephone", propOrder = {
    "telephoneFormattedNumberDescription",
    "normalisedNumberDescription",
    "usageDeniedIndicator",
    "validityPeriod",
    "mobilePhoneNumberIndicator",
    "defaultIndicator",
    "smsEnabledIndicator"
})
public class EmployeeQueryResponseAddressTelephone {

    @XmlElement(name = "TelephoneFormattedNumberDescription")
    protected String telephoneFormattedNumberDescription;
    @XmlElement(name = "NormalisedNumberDescription")
    protected String normalisedNumberDescription;
    @XmlElement(name = "UsageDeniedIndicator")
    protected Boolean usageDeniedIndicator;
    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "MobilePhoneNumberIndicator")
    protected Boolean mobilePhoneNumberIndicator;
    @XmlElement(name = "DefaultIndicator")
    protected Boolean defaultIndicator;
    @XmlElement(name = "SMSEnabledIndicator")
    protected Boolean smsEnabledIndicator;

    /**
     * Gets the value of the telephoneFormattedNumberDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneFormattedNumberDescription() {
        return telephoneFormattedNumberDescription;
    }

    /**
     * Sets the value of the telephoneFormattedNumberDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneFormattedNumberDescription(String value) {
        this.telephoneFormattedNumberDescription = value;
    }

    /**
     * Gets the value of the normalisedNumberDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalisedNumberDescription() {
        return normalisedNumberDescription;
    }

    /**
     * Sets the value of the normalisedNumberDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalisedNumberDescription(String value) {
        this.normalisedNumberDescription = value;
    }

    /**
     * Gets the value of the usageDeniedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsageDeniedIndicator() {
        return usageDeniedIndicator;
    }

    /**
     * Sets the value of the usageDeniedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsageDeniedIndicator(Boolean value) {
        this.usageDeniedIndicator = value;
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
     * Gets the value of the mobilePhoneNumberIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobilePhoneNumberIndicator() {
        return mobilePhoneNumberIndicator;
    }

    /**
     * Sets the value of the mobilePhoneNumberIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobilePhoneNumberIndicator(Boolean value) {
        this.mobilePhoneNumberIndicator = value;
    }

    /**
     * Gets the value of the defaultIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultIndicator() {
        return defaultIndicator;
    }

    /**
     * Sets the value of the defaultIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultIndicator(Boolean value) {
        this.defaultIndicator = value;
    }

    /**
     * Gets the value of the smsEnabledIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSMSEnabledIndicator() {
        return smsEnabledIndicator;
    }

    /**
     * Sets the value of the smsEnabledIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSMSEnabledIndicator(Boolean value) {
        this.smsEnabledIndicator = value;
    }

}
