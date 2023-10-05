
package com.erpl.employee.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeQueryResponseAddressOrganisationName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeQueryResponseAddressOrganisationName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScriptCode" type="{http://sap.com/xi/AP/Common/GDT}AddressRepresentationCode" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://sap.com/xi/AP/Common/GDT}OrganisationName"/&gt;
 *         &lt;element name="KeyWordsText" type="{http://sap.com/xi/AP/Common/GDT}KeyWordsText" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalKeyWordsText" type="{http://sap.com/xi/AP/Common/GDT}KeyWordsText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeQueryResponseAddressOrganisationName", propOrder = {
    "scriptCode",
    "name",
    "keyWordsText",
    "additionalKeyWordsText"
})
public class EmployeeQueryResponseAddressOrganisationName {

    @XmlElement(name = "ScriptCode")
    protected AddressRepresentationCode scriptCode;
    @XmlElement(name = "Name", required = true)
    protected OrganisationName name;
    @XmlElement(name = "KeyWordsText")
    protected String keyWordsText;
    @XmlElement(name = "AdditionalKeyWordsText")
    protected String additionalKeyWordsText;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationName }
     *     
     */
    public OrganisationName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationName }
     *     
     */
    public void setName(OrganisationName value) {
        this.name = value;
    }

    /**
     * Gets the value of the keyWordsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyWordsText() {
        return keyWordsText;
    }

    /**
     * Sets the value of the keyWordsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyWordsText(String value) {
        this.keyWordsText = value;
    }

    /**
     * Gets the value of the additionalKeyWordsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalKeyWordsText() {
        return additionalKeyWordsText;
    }

    /**
     * Sets the value of the additionalKeyWordsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalKeyWordsText(String value) {
        this.additionalKeyWordsText = value;
    }

}
