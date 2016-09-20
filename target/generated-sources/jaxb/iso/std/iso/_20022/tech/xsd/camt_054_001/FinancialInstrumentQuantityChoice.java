//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.21 at 12:19:19 AM CEST 
//


package iso.std.iso._20022.tech.xsd.camt_054_001;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentQuantityChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstrumentQuantityChoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Unit" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}DecimalNumber"/>
 *           &lt;element name="FaceAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ImpliedCurrencyAndAmount"/>
 *           &lt;element name="AmtsdVal" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}ImpliedCurrencyAndAmount"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentQuantityChoice", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.02", propOrder = {
    "amtsdVal",
    "faceAmt",
    "unit"
})
public class FinancialInstrumentQuantityChoice
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AmtsdVal", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.02")
    protected BigDecimal amtsdVal;
    @XmlElement(name = "FaceAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.02")
    protected BigDecimal faceAmt;
    @XmlElement(name = "Unit", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.02")
    protected BigDecimal unit;

    /**
     * Gets the value of the amtsdVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtsdVal() {
        return amtsdVal;
    }

    /**
     * Sets the value of the amtsdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtsdVal(BigDecimal value) {
        this.amtsdVal = value;
    }

    /**
     * Gets the value of the faceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFaceAmt() {
        return faceAmt;
    }

    /**
     * Sets the value of the faceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFaceAmt(BigDecimal value) {
        this.faceAmt = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnit(BigDecimal value) {
        this.unit = value;
    }

}