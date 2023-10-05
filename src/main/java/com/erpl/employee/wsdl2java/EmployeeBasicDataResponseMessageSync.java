
package com.erpl.employee.wsdl2java;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeBasicDataResponseMessage_sync complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeBasicDataResponseMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BasicData" type="{http://sap.com/xi/A1S/Global}EmployeeReponseBasicData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingConditions" type="{http://sap.com/xi/AP/Common/GDT}ResponseProcessingConditions" minOccurs="0"/&gt;
 *         &lt;element name="Log" type="{http://sap.com/xi/AP/Common/GDT}Log" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeBasicDataResponseMessage_sync", propOrder = {
    "basicData",
    "processingConditions",
    "log"
})
public class EmployeeBasicDataResponseMessageSync {

    @XmlElement(name = "BasicData")
    protected List<EmployeeReponseBasicData> basicData;
    @XmlElement(name = "ProcessingConditions")
    protected ResponseProcessingConditions processingConditions;
    @XmlElement(name = "Log")
    protected Log log;

    /**
     * Gets the value of the basicData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basicData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasicData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeReponseBasicData }
     * 
     * 
     */
    public List<EmployeeReponseBasicData> getBasicData() {
        if (basicData == null) {
            basicData = new ArrayList<EmployeeReponseBasicData>();
        }
        return this.basicData;
    }

    /**
     * Gets the value of the processingConditions property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseProcessingConditions }
     *     
     */
    public ResponseProcessingConditions getProcessingConditions() {
        return processingConditions;
    }

    /**
     * Sets the value of the processingConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseProcessingConditions }
     *     
     */
    public void setProcessingConditions(ResponseProcessingConditions value) {
        this.processingConditions = value;
    }

    /**
     * Gets the value of the log property.
     * 
     * @return
     *     possible object is
     *     {@link Log }
     *     
     */
    public Log getLog() {
        return log;
    }

    /**
     * Sets the value of the log property.
     * 
     * @param value
     *     allowed object is
     *     {@link Log }
     *     
     */
    public void setLog(Log value) {
        this.log = value;
    }

}
