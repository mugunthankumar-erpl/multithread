
package com.erpl.employee.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EmployeeDataReponseBiograhicalData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeDataReponseBiograhicalData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="FormOfAddressCode" type="{http://sap.com/xi/AP/Common/GDT}FormOfAddressCode" minOccurs="0"/&gt;
 *         &lt;element name="AcademicTitleCode" type="{http://sap.com/xi/AP/Common/GDT}AcademicTitleCode" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="FamilyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalFamilyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="NickName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="GenderCode" type="{http://sap.com/xi/AP/Common/GDT}GenderCode" minOccurs="0"/&gt;
 *         &lt;element name="BirthName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="BirthDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="BirthPlaceName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="MaritalStatusCode" type="{http://sap.com/xi/AP/Common/GDT}MaritalStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="NationalityCountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeDataReponseBiograhicalData", propOrder = {
    "validityPeriod",
    "formOfAddressCode",
    "academicTitleCode",
    "givenName",
    "familyName",
    "additionalFamilyName",
    "middleName",
    "nickName",
    "genderCode",
    "birthName",
    "birthDate",
    "birthPlaceName",
    "maritalStatusCode",
    "nationalityCountryCode"
})
public class EmployeeDataReponseBiograhicalData {

    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "FormOfAddressCode")
    protected FormOfAddressCode formOfAddressCode;
    @XmlElement(name = "AcademicTitleCode")
    protected AcademicTitleCode academicTitleCode;
    @XmlElement(name = "GivenName")
    protected String givenName;
    @XmlElement(name = "FamilyName")
    protected String familyName;
    @XmlElement(name = "AdditionalFamilyName")
    protected String additionalFamilyName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "NickName")
    protected String nickName;
    @XmlElement(name = "GenderCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String genderCode;
    @XmlElement(name = "BirthName")
    protected String birthName;
    @XmlElement(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "BirthPlaceName")
    protected String birthPlaceName;
    @XmlElement(name = "MaritalStatusCode")
    protected MaritalStatusCode maritalStatusCode;
    @XmlElement(name = "NationalityCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String nationalityCountryCode;

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
     * Gets the value of the formOfAddressCode property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfAddressCode }
     *     
     */
    public FormOfAddressCode getFormOfAddressCode() {
        return formOfAddressCode;
    }

    /**
     * Sets the value of the formOfAddressCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfAddressCode }
     *     
     */
    public void setFormOfAddressCode(FormOfAddressCode value) {
        this.formOfAddressCode = value;
    }

    /**
     * Gets the value of the academicTitleCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicTitleCode }
     *     
     */
    public AcademicTitleCode getAcademicTitleCode() {
        return academicTitleCode;
    }

    /**
     * Sets the value of the academicTitleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicTitleCode }
     *     
     */
    public void setAcademicTitleCode(AcademicTitleCode value) {
        this.academicTitleCode = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the additionalFamilyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalFamilyName() {
        return additionalFamilyName;
    }

    /**
     * Sets the value of the additionalFamilyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalFamilyName(String value) {
        this.additionalFamilyName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the genderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * Sets the value of the genderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderCode(String value) {
        this.genderCode = value;
    }

    /**
     * Gets the value of the birthName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthName() {
        return birthName;
    }

    /**
     * Sets the value of the birthName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthName(String value) {
        this.birthName = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the birthPlaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlaceName() {
        return birthPlaceName;
    }

    /**
     * Sets the value of the birthPlaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlaceName(String value) {
        this.birthPlaceName = value;
    }

    /**
     * Gets the value of the maritalStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalStatusCode }
     *     
     */
    public MaritalStatusCode getMaritalStatusCode() {
        return maritalStatusCode;
    }

    /**
     * Sets the value of the maritalStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalStatusCode }
     *     
     */
    public void setMaritalStatusCode(MaritalStatusCode value) {
        this.maritalStatusCode = value;
    }

    /**
     * Gets the value of the nationalityCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityCountryCode() {
        return nationalityCountryCode;
    }

    /**
     * Sets the value of the nationalityCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityCountryCode(String value) {
        this.nationalityCountryCode = value;
    }

}
