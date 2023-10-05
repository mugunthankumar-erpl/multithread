
package com.erpl.employee.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EmployeeQueryResponseAddressPostalAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeQueryResponseAddressPostalAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScriptCode" type="{http://sap.com/xi/AP/Common/GDT}AddressRepresentationCode" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="CountyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="StreetPostalCode" type="{http://sap.com/xi/AP/Common/GDT}PostalCode" minOccurs="0"/&gt;
 *         &lt;element name="POBoxPostalCode" type="{http://sap.com/xi/AP/Common/GDT}PostalCode" minOccurs="0"/&gt;
 *         &lt;element name="CompanyPostalCode" type="{http://sap.com/xi/AP/Common/GDT}PostalCode" minOccurs="0"/&gt;
 *         &lt;element name="StreetPrefixName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalStreetPrefixName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="StreetName" type="{http://sap.com/xi/AP/Common/GDT}StreetName" minOccurs="0"/&gt;
 *         &lt;element name="StreetSuffixName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalStreetSuffixName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="HouseID" type="{http://sap.com/xi/AP/Common/GDT}HouseID" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddressMailNonDeliveryReasonCode" type="{http://sap.com/xi/AP/Common/GDT}MailNonDeliveryReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="RegionalStructureElementGroupCode" type="{http://sap.com/xi/AP/Common/GDT}RegionalStructureElementGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeviatingCountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeviatingRegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeviatingCityName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="POBoxID" type="{http://sap.com/xi/AP/Common/GDT}POBoxID" minOccurs="0"/&gt;
 *         &lt;element name="POBoxIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="POBoxAddressMailNonDeliveryReasonCode" type="{http://sap.com/xi/AP/Common/GDT}MailNonDeliveryReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxJurisdictionCode" type="{http://sap.com/xi/AP/Common/GDT}TaxJurisdictionCode" minOccurs="0"/&gt;
 *         &lt;element name="TimeZoneCode" type="{http://sap.com/xi/AP/Common/GDT}TimeZoneCode" minOccurs="0"/&gt;
 *         &lt;element name="RegionalStructureAddressConsistencyStatusCode" type="{http://sap.com/xi/AP/Common/GDT}ConsistencyStatusCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeQueryResponseAddressPostalAddress", propOrder = {
    "scriptCode",
    "countryCode",
    "regionCode",
    "countyName",
    "cityName",
    "streetPostalCode",
    "poBoxPostalCode",
    "companyPostalCode",
    "streetPrefixName",
    "additionalStreetPrefixName",
    "streetName",
    "streetSuffixName",
    "additionalStreetSuffixName",
    "houseID",
    "streetAddressMailNonDeliveryReasonCode",
    "regionalStructureElementGroupCode",
    "poBoxDeviatingCountryCode",
    "poBoxDeviatingRegionCode",
    "poBoxDeviatingCityName",
    "poBoxID",
    "poBoxIndicator",
    "poBoxAddressMailNonDeliveryReasonCode",
    "taxJurisdictionCode",
    "timeZoneCode",
    "regionalStructureAddressConsistencyStatusCode"
})
public class EmployeeQueryResponseAddressPostalAddress {

    @XmlElement(name = "ScriptCode")
    protected AddressRepresentationCode scriptCode;
    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "RegionCode")
    protected RegionCode regionCode;
    @XmlElement(name = "CountyName")
    protected String countyName;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "StreetPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String streetPostalCode;
    @XmlElement(name = "POBoxPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxPostalCode;
    @XmlElement(name = "CompanyPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyPostalCode;
    @XmlElement(name = "StreetPrefixName")
    protected String streetPrefixName;
    @XmlElement(name = "AdditionalStreetPrefixName")
    protected String additionalStreetPrefixName;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "StreetSuffixName")
    protected String streetSuffixName;
    @XmlElement(name = "AdditionalStreetSuffixName")
    protected String additionalStreetSuffixName;
    @XmlElement(name = "HouseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String houseID;
    @XmlElement(name = "StreetAddressMailNonDeliveryReasonCode")
    protected MailNonDeliveryReasonCode streetAddressMailNonDeliveryReasonCode;
    @XmlElement(name = "RegionalStructureElementGroupCode")
    protected RegionalStructureElementGroupCode regionalStructureElementGroupCode;
    @XmlElement(name = "POBoxDeviatingCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxDeviatingCountryCode;
    @XmlElement(name = "POBoxDeviatingRegionCode")
    protected RegionCode poBoxDeviatingRegionCode;
    @XmlElement(name = "POBoxDeviatingCityName")
    protected String poBoxDeviatingCityName;
    @XmlElement(name = "POBoxID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxID;
    @XmlElement(name = "POBoxIndicator")
    protected Boolean poBoxIndicator;
    @XmlElement(name = "POBoxAddressMailNonDeliveryReasonCode")
    protected MailNonDeliveryReasonCode poBoxAddressMailNonDeliveryReasonCode;
    @XmlElement(name = "TaxJurisdictionCode")
    protected TaxJurisdictionCode taxJurisdictionCode;
    @XmlElement(name = "TimeZoneCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timeZoneCode;
    @XmlElement(name = "RegionalStructureAddressConsistencyStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String regionalStructureAddressConsistencyStatusCode;

    /**
     * Gets the value of the scriptCode property.
     * 
     * @return
     *     possible object is
     *     {@link AddressRepresentationCode }
     *     
     */
    public AddressRepresentationCode getScriptCode() {
        return scriptCode;
    }

    /**
     * Sets the value of the scriptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRepresentationCode }
     *     
     */
    public void setScriptCode(AddressRepresentationCode value) {
        this.scriptCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegionCode }
     *     
     */
    public RegionCode getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCode }
     *     
     */
    public void setRegionCode(RegionCode value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the countyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * Sets the value of the countyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyName(String value) {
        this.countyName = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the streetPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetPostalCode() {
        return streetPostalCode;
    }

    /**
     * Sets the value of the streetPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetPostalCode(String value) {
        this.streetPostalCode = value;
    }

    /**
     * Gets the value of the poBoxPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxPostalCode() {
        return poBoxPostalCode;
    }

    /**
     * Sets the value of the poBoxPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxPostalCode(String value) {
        this.poBoxPostalCode = value;
    }

    /**
     * Gets the value of the companyPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPostalCode() {
        return companyPostalCode;
    }

    /**
     * Sets the value of the companyPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPostalCode(String value) {
        this.companyPostalCode = value;
    }

    /**
     * Gets the value of the streetPrefixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetPrefixName() {
        return streetPrefixName;
    }

    /**
     * Sets the value of the streetPrefixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetPrefixName(String value) {
        this.streetPrefixName = value;
    }

    /**
     * Gets the value of the additionalStreetPrefixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalStreetPrefixName() {
        return additionalStreetPrefixName;
    }

    /**
     * Sets the value of the additionalStreetPrefixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalStreetPrefixName(String value) {
        this.additionalStreetPrefixName = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetSuffixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetSuffixName() {
        return streetSuffixName;
    }

    /**
     * Sets the value of the streetSuffixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetSuffixName(String value) {
        this.streetSuffixName = value;
    }

    /**
     * Gets the value of the additionalStreetSuffixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalStreetSuffixName() {
        return additionalStreetSuffixName;
    }

    /**
     * Sets the value of the additionalStreetSuffixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalStreetSuffixName(String value) {
        this.additionalStreetSuffixName = value;
    }

    /**
     * Gets the value of the houseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseID() {
        return houseID;
    }

    /**
     * Sets the value of the houseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseID(String value) {
        this.houseID = value;
    }

    /**
     * Gets the value of the streetAddressMailNonDeliveryReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link MailNonDeliveryReasonCode }
     *     
     */
    public MailNonDeliveryReasonCode getStreetAddressMailNonDeliveryReasonCode() {
        return streetAddressMailNonDeliveryReasonCode;
    }

    /**
     * Sets the value of the streetAddressMailNonDeliveryReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailNonDeliveryReasonCode }
     *     
     */
    public void setStreetAddressMailNonDeliveryReasonCode(MailNonDeliveryReasonCode value) {
        this.streetAddressMailNonDeliveryReasonCode = value;
    }

    /**
     * Gets the value of the regionalStructureElementGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegionalStructureElementGroupCode }
     *     
     */
    public RegionalStructureElementGroupCode getRegionalStructureElementGroupCode() {
        return regionalStructureElementGroupCode;
    }

    /**
     * Sets the value of the regionalStructureElementGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalStructureElementGroupCode }
     *     
     */
    public void setRegionalStructureElementGroupCode(RegionalStructureElementGroupCode value) {
        this.regionalStructureElementGroupCode = value;
    }

    /**
     * Gets the value of the poBoxDeviatingCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxDeviatingCountryCode() {
        return poBoxDeviatingCountryCode;
    }

    /**
     * Sets the value of the poBoxDeviatingCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxDeviatingCountryCode(String value) {
        this.poBoxDeviatingCountryCode = value;
    }

    /**
     * Gets the value of the poBoxDeviatingRegionCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegionCode }
     *     
     */
    public RegionCode getPOBoxDeviatingRegionCode() {
        return poBoxDeviatingRegionCode;
    }

    /**
     * Sets the value of the poBoxDeviatingRegionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCode }
     *     
     */
    public void setPOBoxDeviatingRegionCode(RegionCode value) {
        this.poBoxDeviatingRegionCode = value;
    }

    /**
     * Gets the value of the poBoxDeviatingCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxDeviatingCityName() {
        return poBoxDeviatingCityName;
    }

    /**
     * Sets the value of the poBoxDeviatingCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxDeviatingCityName(String value) {
        this.poBoxDeviatingCityName = value;
    }

    /**
     * Gets the value of the poBoxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxID() {
        return poBoxID;
    }

    /**
     * Sets the value of the poBoxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxID(String value) {
        this.poBoxID = value;
    }

    /**
     * Gets the value of the poBoxIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPOBoxIndicator() {
        return poBoxIndicator;
    }

    /**
     * Sets the value of the poBoxIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPOBoxIndicator(Boolean value) {
        this.poBoxIndicator = value;
    }

    /**
     * Gets the value of the poBoxAddressMailNonDeliveryReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link MailNonDeliveryReasonCode }
     *     
     */
    public MailNonDeliveryReasonCode getPOBoxAddressMailNonDeliveryReasonCode() {
        return poBoxAddressMailNonDeliveryReasonCode;
    }

    /**
     * Sets the value of the poBoxAddressMailNonDeliveryReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailNonDeliveryReasonCode }
     *     
     */
    public void setPOBoxAddressMailNonDeliveryReasonCode(MailNonDeliveryReasonCode value) {
        this.poBoxAddressMailNonDeliveryReasonCode = value;
    }

    /**
     * Gets the value of the taxJurisdictionCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxJurisdictionCode }
     *     
     */
    public TaxJurisdictionCode getTaxJurisdictionCode() {
        return taxJurisdictionCode;
    }

    /**
     * Sets the value of the taxJurisdictionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxJurisdictionCode }
     *     
     */
    public void setTaxJurisdictionCode(TaxJurisdictionCode value) {
        this.taxJurisdictionCode = value;
    }

    /**
     * Gets the value of the timeZoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneCode() {
        return timeZoneCode;
    }

    /**
     * Sets the value of the timeZoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneCode(String value) {
        this.timeZoneCode = value;
    }

    /**
     * Gets the value of the regionalStructureAddressConsistencyStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionalStructureAddressConsistencyStatusCode() {
        return regionalStructureAddressConsistencyStatusCode;
    }

    /**
     * Sets the value of the regionalStructureAddressConsistencyStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionalStructureAddressConsistencyStatusCode(String value) {
        this.regionalStructureAddressConsistencyStatusCode = value;
    }

}
