
package com.erpl.employee.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EmployeeQueryResponseAddressWorkplace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeQueryResponseAddressWorkplace"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScriptCode" type="{http://sap.com/xi/AP/Common/GDT}AddressRepresentationCode" minOccurs="0"/&gt;
 *         &lt;element name="FunctionalTitleName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="DepartmentName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="BuildingID" type="{http://sap.com/xi/AP/Common/GDT}BuildingID" minOccurs="0"/&gt;
 *         &lt;element name="FloorID" type="{http://sap.com/xi/AP/Common/GDT}FloorID" minOccurs="0"/&gt;
 *         &lt;element name="RoomID" type="{http://sap.com/xi/AP/Common/GDT}RoomID" minOccurs="0"/&gt;
 *         &lt;element name="InhouseMailID" type="{http://sap.com/xi/AP/Common/GDT}InhouseMailID" minOccurs="0"/&gt;
 *         &lt;element name="CorrespondenceShortName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Name" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeQueryResponseAddressWorkplace", propOrder = {
    "scriptCode",
    "functionalTitleName",
    "departmentName",
    "buildingID",
    "floorID",
    "roomID",
    "inhouseMailID",
    "correspondenceShortName"
})
public class EmployeeQueryResponseAddressWorkplace {

    @XmlElement(name = "ScriptCode")
    protected AddressRepresentationCode scriptCode;
    @XmlElement(name = "FunctionalTitleName")
    protected String functionalTitleName;
    @XmlElement(name = "DepartmentName")
    protected String departmentName;
    @XmlElement(name = "BuildingID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String buildingID;
    @XmlElement(name = "FloorID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String floorID;
    @XmlElement(name = "RoomID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String roomID;
    @XmlElement(name = "InhouseMailID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String inhouseMailID;
    @XmlElement(name = "CorrespondenceShortName")
    protected String correspondenceShortName;

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
     * Gets the value of the functionalTitleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionalTitleName() {
        return functionalTitleName;
    }

    /**
     * Sets the value of the functionalTitleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionalTitleName(String value) {
        this.functionalTitleName = value;
    }

    /**
     * Gets the value of the departmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets the value of the departmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

    /**
     * Gets the value of the buildingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingID() {
        return buildingID;
    }

    /**
     * Sets the value of the buildingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingID(String value) {
        this.buildingID = value;
    }

    /**
     * Gets the value of the floorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorID() {
        return floorID;
    }

    /**
     * Sets the value of the floorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorID(String value) {
        this.floorID = value;
    }

    /**
     * Gets the value of the roomID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomID() {
        return roomID;
    }

    /**
     * Sets the value of the roomID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomID(String value) {
        this.roomID = value;
    }

    /**
     * Gets the value of the inhouseMailID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInhouseMailID() {
        return inhouseMailID;
    }

    /**
     * Sets the value of the inhouseMailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInhouseMailID(String value) {
        this.inhouseMailID = value;
    }

    /**
     * Gets the value of the correspondenceShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceShortName() {
        return correspondenceShortName;
    }

    /**
     * Sets the value of the correspondenceShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceShortName(String value) {
        this.correspondenceShortName = value;
    }

}
