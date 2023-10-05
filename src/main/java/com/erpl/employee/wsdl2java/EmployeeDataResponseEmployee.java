
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
 * <p>Java class for EmployeeDataResponseEmployee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeDataResponseEmployee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeStateID" type="{http://sap.com/xi/AP/Common/GDT}ChangeStateID" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeID" type="{http://sap.com/xi/AP/Common/GDT}EmployeeID" minOccurs="0"/&gt;
 *         &lt;element name="EmploymentData" type="{http://sap.com/xi/A1S/Global}EmployeeDataResponseEmployment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BiographicalData" type="{http://sap.com/xi/A1S/Global}EmployeeDataReponseBiograhicalData" maxOccurs="unbounded"/&gt;
 *         &lt;element name="AddressInformation" type="{http://sap.com/xi/A1S/Global}EmployeeDataResponseAddressInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceAddressInformation" type="{http://sap.com/xi/A1S/Global}EmployeeDataResponseWorkplaceAddressInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeDataResponseEmployee", propOrder = {
    "changeStateID",
    "uuid",
    "employeeID",
    "employmentData",
    "biographicalData",
    "addressInformation",
    "workplaceAddressInformation"
})
public class EmployeeDataResponseEmployee {

    @XmlElement(name = "ChangeStateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String changeStateID;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "EmployeeID")
    protected EmployeeID employeeID;
    @XmlElement(name = "EmploymentData")
    protected List<EmployeeDataResponseEmployment> employmentData;
    @XmlElement(name = "BiographicalData", required = true)
    protected List<EmployeeDataReponseBiograhicalData> biographicalData;
    @XmlElement(name = "AddressInformation")
    protected List<EmployeeDataResponseAddressInformation> addressInformation;
    @XmlElement(name = "WorkplaceAddressInformation")
    protected EmployeeDataResponseWorkplaceAddressInformation workplaceAddressInformation;

    /**
     * Gets the value of the changeStateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeStateID() {
        return changeStateID;
    }

    /**
     * Sets the value of the changeStateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeStateID(String value) {
        this.changeStateID = value;
    }

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
     * Gets the value of the employeeID property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeID }
     *     
     */
    public EmployeeID getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the value of the employeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeID }
     *     
     */
    public void setEmployeeID(EmployeeID value) {
        this.employeeID = value;
    }

    /**
     * Gets the value of the employmentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employmentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmploymentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeDataResponseEmployment }
     * 
     * 
     */
    public List<EmployeeDataResponseEmployment> getEmploymentData() {
        if (employmentData == null) {
            employmentData = new ArrayList<EmployeeDataResponseEmployment>();
        }
        return this.employmentData;
    }

    /**
     * Gets the value of the biographicalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the biographicalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBiographicalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeDataReponseBiograhicalData }
     * 
     * 
     */
    public List<EmployeeDataReponseBiograhicalData> getBiographicalData() {
        if (biographicalData == null) {
            biographicalData = new ArrayList<EmployeeDataReponseBiograhicalData>();
        }
        return this.biographicalData;
    }

    /**
     * Gets the value of the addressInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeDataResponseAddressInformation }
     * 
     * 
     */
    public List<EmployeeDataResponseAddressInformation> getAddressInformation() {
        if (addressInformation == null) {
            addressInformation = new ArrayList<EmployeeDataResponseAddressInformation>();
        }
        return this.addressInformation;
    }

    /**
     * Gets the value of the workplaceAddressInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDataResponseWorkplaceAddressInformation }
     *     
     */
    public EmployeeDataResponseWorkplaceAddressInformation getWorkplaceAddressInformation() {
        return workplaceAddressInformation;
    }

    /**
     * Sets the value of the workplaceAddressInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDataResponseWorkplaceAddressInformation }
     *     
     */
    public void setWorkplaceAddressInformation(EmployeeDataResponseWorkplaceAddressInformation value) {
        this.workplaceAddressInformation = value;
    }

}
