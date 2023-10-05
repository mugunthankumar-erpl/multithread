
package com.erpl.employee.wsdl2java;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AgreedWorkingHoursRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreedWorkingHoursRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DecimalValue" type="{http://sap.com/xi/AP/Common/GDT}SMALLNONNEGATIVE_DecimalValue"/&gt;
 *         &lt;element name="BaseMeasureUnitCode" type="{http://sap.com/xi/AP/Common/GDT}DAYWEEKMONTH_MeasureUnitCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreedWorkingHoursRate", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {
    "decimalValue",
    "baseMeasureUnitCode"
})
public class AgreedWorkingHoursRate {

    @XmlElement(name = "DecimalValue", required = true)
    protected BigDecimal decimalValue;
    @XmlElement(name = "BaseMeasureUnitCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baseMeasureUnitCode;

    /**
     * Gets the value of the decimalValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimalValue() {
        return decimalValue;
    }

    /**
     * Sets the value of the decimalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimalValue(BigDecimal value) {
        this.decimalValue = value;
    }

    /**
     * Gets the value of the baseMeasureUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseMeasureUnitCode() {
        return baseMeasureUnitCode;
    }

    /**
     * Sets the value of the baseMeasureUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseMeasureUnitCode(String value) {
        this.baseMeasureUnitCode = value;
    }

}
