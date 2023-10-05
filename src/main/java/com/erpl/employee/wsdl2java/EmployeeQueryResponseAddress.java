
package com.erpl.employee.wsdl2java;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeQueryResponseAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeQueryResponseAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PostalAddress" type="{http://sap.com/xi/A1S/Global}EmployeeQueryResponseAddressPostalAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" type="{http://sap.com/xi/A1S/Global}EmployeeQueryResponseAddressTelephone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://sap.com/xi/A1S/Global}EmployeeQueryResponseAddressEmail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Facsimile" type="{http://sap.com/xi/A1S/Global}EmployeeQueryAddressFascimile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Web" type="{http://sap.com/xi/A1S/Global}EmployeeQueryResponseAddressWeb" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeQueryResponseAddress", propOrder = {
    "postalAddress",
    "telephone",
    "email",
    "facsimile",
    "web"
})
public class EmployeeQueryResponseAddress {

    @XmlElement(name = "PostalAddress")
    protected List<EmployeeQueryResponseAddressPostalAddress> postalAddress;
    @XmlElement(name = "Telephone")
    protected List<EmployeeQueryResponseAddressTelephone> telephone;
    @XmlElement(name = "Email")
    protected List<EmployeeQueryResponseAddressEmail> email;
    @XmlElement(name = "Facsimile")
    protected List<EmployeeQueryAddressFascimile> facsimile;
    @XmlElement(name = "Web")
    protected List<EmployeeQueryResponseAddressWeb> web;

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
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeQueryResponseAddressEmail }
     * 
     * 
     */
    public List<EmployeeQueryResponseAddressEmail> getEmail() {
        if (email == null) {
            email = new ArrayList<EmployeeQueryResponseAddressEmail>();
        }
        return this.email;
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

}
