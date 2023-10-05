
package com.erpl.employee.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeDataResponseWorkplaceAddressInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeDataResponseWorkplaceAddressInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://sap.com/xi/A1S/Global}EmployeeDataQueryResponseWPAddress" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceAddressOrganisation" type="{http://sap.com/xi/A1S/Global}EmployeeQueryResponseWorkplaceOrganisationAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeDataResponseWorkplaceAddressInformation", propOrder = {
    "uuid",
    "address",
    "workplaceAddressOrganisation"
})
public class EmployeeDataResponseWorkplaceAddressInformation {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "Address")
    protected EmployeeDataQueryResponseWPAddress address;
    @XmlElement(name = "WorkplaceAddressOrganisation")
    protected EmployeeQueryResponseWorkplaceOrganisationAddress workplaceAddressOrganisation;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDataQueryResponseWPAddress }
     *     
     */
    public EmployeeDataQueryResponseWPAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDataQueryResponseWPAddress }
     *     
     */
    public void setAddress(EmployeeDataQueryResponseWPAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the workplaceAddressOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeQueryResponseWorkplaceOrganisationAddress }
     *     
     */
    public EmployeeQueryResponseWorkplaceOrganisationAddress getWorkplaceAddressOrganisation() {
        return workplaceAddressOrganisation;
    }

    /**
     * Sets the value of the workplaceAddressOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeQueryResponseWorkplaceOrganisationAddress }
     *     
     */
    public void setWorkplaceAddressOrganisation(EmployeeQueryResponseWorkplaceOrganisationAddress value) {
        this.workplaceAddressOrganisation = value;
    }

}
