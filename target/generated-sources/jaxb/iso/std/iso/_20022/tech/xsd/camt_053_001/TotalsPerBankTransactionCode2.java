//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.21 at 12:19:19 AM CEST 
//


package iso.std.iso._20022.tech.xsd.camt_053_001;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalsPerBankTransactionCode2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalsPerBankTransactionCode2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NbOfNtries" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}Max15NumericText" minOccurs="0"/>
 *         &lt;element name="Sum" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}DecimalNumber" minOccurs="0"/>
 *         &lt;element name="TtlNetNtryAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}DecimalNumber" minOccurs="0"/>
 *         &lt;element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}CreditDebitCode" minOccurs="0"/>
 *         &lt;element name="FcstInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         &lt;element name="BkTxCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}BankTransactionCodeStructure4"/>
 *         &lt;element name="Avlbty" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}CashBalanceAvailability2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalsPerBankTransactionCode2", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02", propOrder = {
    "nbOfNtries",
    "sum",
    "ttlNetNtryAmt",
    "cdtDbtInd",
    "fcstInd",
    "bkTxCd",
    "avlbties"
})
public class TotalsPerBankTransactionCode2
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "NbOfNtries", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02")
    protected String nbOfNtries;
    @XmlElement(name = "Sum", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02")
    protected BigDecimal sum;
    @XmlElement(name = "TtlNetNtryAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02")
    protected BigDecimal ttlNetNtryAmt;
    @XmlElement(name = "CdtDbtInd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "FcstInd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02")
    protected Boolean fcstInd;
    @XmlElement(name = "BkTxCd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02", required = true)
    protected BankTransactionCodeStructure4 bkTxCd;
    @XmlElement(name = "Avlbty", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02")
    protected List<CashBalanceAvailability2> avlbties;

    /**
     * Gets the value of the nbOfNtries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfNtries() {
        return nbOfNtries;
    }

    /**
     * Sets the value of the nbOfNtries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfNtries(String value) {
        this.nbOfNtries = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSum(BigDecimal value) {
        this.sum = value;
    }

    /**
     * Gets the value of the ttlNetNtryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNetNtryAmt() {
        return ttlNetNtryAmt;
    }

    /**
     * Sets the value of the ttlNetNtryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNetNtryAmt(BigDecimal value) {
        this.ttlNetNtryAmt = value;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
    }

    /**
     * Gets the value of the fcstInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFcstInd() {
        return fcstInd;
    }

    /**
     * Sets the value of the fcstInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFcstInd(Boolean value) {
        this.fcstInd = value;
    }

    /**
     * Gets the value of the bkTxCd property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public BankTransactionCodeStructure4 getBkTxCd() {
        return bkTxCd;
    }

    /**
     * Sets the value of the bkTxCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public void setBkTxCd(BankTransactionCodeStructure4 value) {
        this.bkTxCd = value;
    }

    /**
     * Gets the value of the avlbties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avlbties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvlbties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashBalanceAvailability2 }
     * 
     * 
     */
    public List<CashBalanceAvailability2> getAvlbties() {
        if (avlbties == null) {
            avlbties = new ArrayList<CashBalanceAvailability2>();
        }
        return this.avlbties;
    }

}
