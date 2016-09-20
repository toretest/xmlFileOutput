//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.21 at 12:19:19 AM CEST 
//


package iso.std.iso._20022.tech.xsd.camt_053_001;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for TransactionDates2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionDates2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccptncDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}ISODateTime" minOccurs="0"/>
 *         &lt;element name="TradActvtyCtrctlSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}ISODate" minOccurs="0"/>
 *         &lt;element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}ISODate" minOccurs="0"/>
 *         &lt;element name="IntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}ISODate" minOccurs="0"/>
 *         &lt;element name="StartDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}ISODate" minOccurs="0"/>
 *         &lt;element name="EndDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}ISODate" minOccurs="0"/>
 *         &lt;element name="TxDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}ISODateTime" minOccurs="0"/>
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}ProprietaryDate2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDates2", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02", propOrder = {
    "accptncDtTm",
    "tradActvtyCtrctlSttlmDt",
    "tradDt",
    "intrBkSttlmDt",
    "startDt",
    "endDt",
    "txDtTm",
    "prtries"
})
public class TransactionDates2
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AccptncDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Calendar accptncDtTm;
    @XmlElement(name = "TradActvtyCtrctlSttlmDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02")
    protected XMLGregorianCalendar tradActvtyCtrctlSttlmDt;
    @XmlElement(name = "TradDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "IntrBkSttlmDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02")
    protected XMLGregorianCalendar intrBkSttlmDt;
    @XmlElement(name = "StartDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "EndDt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02")
    protected XMLGregorianCalendar endDt;
    @XmlElement(name = "TxDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Calendar txDtTm;
    @XmlElement(name = "Prtry", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02")
    protected List<ProprietaryDate2> prtries;

    /**
     * Gets the value of the accptncDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getAccptncDtTm() {
        return accptncDtTm;
    }

    /**
     * Sets the value of the accptncDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccptncDtTm(Calendar value) {
        this.accptncDtTm = value;
    }

    /**
     * Gets the value of the tradActvtyCtrctlSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradActvtyCtrctlSttlmDt() {
        return tradActvtyCtrctlSttlmDt;
    }

    /**
     * Sets the value of the tradActvtyCtrctlSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradActvtyCtrctlSttlmDt(XMLGregorianCalendar value) {
        this.tradActvtyCtrctlSttlmDt = value;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the intrBkSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    /**
     * Sets the value of the intrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntrBkSttlmDt(XMLGregorianCalendar value) {
        this.intrBkSttlmDt = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDt(XMLGregorianCalendar value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the txDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTxDtTm() {
        return txDtTm;
    }

    /**
     * Sets the value of the txDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxDtTm(Calendar value) {
        this.txDtTm = value;
    }

    /**
     * Gets the value of the prtries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryDate2 }
     * 
     * 
     */
    public List<ProprietaryDate2> getPrtries() {
        if (prtries == null) {
            prtries = new ArrayList<ProprietaryDate2>();
        }
        return this.prtries;
    }

}
