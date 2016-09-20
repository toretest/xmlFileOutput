//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.21 at 12:19:19 AM CEST 
//


package iso.std.iso._20022.tech.xsd.camt_055_001;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemittanceAmount1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemittanceAmount1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DuePyblAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="DscntApldAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="CdtNoteAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="TaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="AdjstmntAmtAndRsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}DocumentAdjustment1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RmtdAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceAmount1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.055.001.01", propOrder = {
    "duePyblAmt",
    "dscntApldAmt",
    "cdtNoteAmt",
    "taxAmt",
    "adjstmntAmtAndRsns",
    "rmtdAmt"
})
public class RemittanceAmount1
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "DuePyblAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.055.001.01")
    protected ActiveOrHistoricCurrencyAndAmount duePyblAmt;
    @XmlElement(name = "DscntApldAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.055.001.01")
    protected ActiveOrHistoricCurrencyAndAmount dscntApldAmt;
    @XmlElement(name = "CdtNoteAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.055.001.01")
    protected ActiveOrHistoricCurrencyAndAmount cdtNoteAmt;
    @XmlElement(name = "TaxAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.055.001.01")
    protected ActiveOrHistoricCurrencyAndAmount taxAmt;
    @XmlElement(name = "AdjstmntAmtAndRsn", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.055.001.01")
    protected List<DocumentAdjustment1> adjstmntAmtAndRsns;
    @XmlElement(name = "RmtdAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.055.001.01")
    protected ActiveOrHistoricCurrencyAndAmount rmtdAmt;

    /**
     * Gets the value of the duePyblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getDuePyblAmt() {
        return duePyblAmt;
    }

    /**
     * Sets the value of the duePyblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setDuePyblAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.duePyblAmt = value;
    }

    /**
     * Gets the value of the dscntApldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getDscntApldAmt() {
        return dscntApldAmt;
    }

    /**
     * Sets the value of the dscntApldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setDscntApldAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.dscntApldAmt = value;
    }

    /**
     * Gets the value of the cdtNoteAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getCdtNoteAmt() {
        return cdtNoteAmt;
    }

    /**
     * Sets the value of the cdtNoteAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setCdtNoteAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.cdtNoteAmt = value;
    }

    /**
     * Gets the value of the taxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTaxAmt() {
        return taxAmt;
    }

    /**
     * Sets the value of the taxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTaxAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.taxAmt = value;
    }

    /**
     * Gets the value of the adjstmntAmtAndRsns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjstmntAmtAndRsns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjstmntAmtAndRsns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentAdjustment1 }
     * 
     * 
     */
    public List<DocumentAdjustment1> getAdjstmntAmtAndRsns() {
        if (adjstmntAmtAndRsns == null) {
            adjstmntAmtAndRsns = new ArrayList<DocumentAdjustment1>();
        }
        return this.adjstmntAmtAndRsns;
    }

    /**
     * Gets the value of the rmtdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getRmtdAmt() {
        return rmtdAmt;
    }

    /**
     * Sets the value of the rmtdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setRmtdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.rmtdAmt = value;
    }

}
