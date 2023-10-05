
package com.erpl.employee.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormattedPostalAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormattedPostalAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FirstLineDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Description"/&gt;
 *         &lt;element name="SecondLineDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="ThirdLineDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormattedPostalAddress", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {
    "firstLineDescription",
    "secondLineDescription",
    "thirdLineDescription"
})
public class FormattedPostalAddress {

    @XmlElement(name = "FirstLineDescription", required = true)
    protected String firstLineDescription;
    @XmlElement(name = "SecondLineDescription")
    protected String secondLineDescription;
    @XmlElement(name = "ThirdLineDescription")
    protected String thirdLineDescription;

    /**
     * Gets the value of the firstLineDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstLineDescription() {
        return firstLineDescription;
    }

    /**
     * Sets the value of the firstLineDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstLineDescription(String value) {
        this.firstLineDescription = value;
    }

    /**
     * Gets the value of the secondLineDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondLineDescription() {
        return secondLineDescription;
    }

    /**
     * Sets the value of the secondLineDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondLineDescription(String value) {
        this.secondLineDescription = value;
    }

    /**
     * Gets the value of the thirdLineDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdLineDescription() {
        return thirdLineDescription;
    }

    /**
     * Sets the value of the thirdLineDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdLineDescription(String value) {
        this.thirdLineDescription = value;
    }

}
