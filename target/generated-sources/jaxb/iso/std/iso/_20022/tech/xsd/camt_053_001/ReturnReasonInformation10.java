//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.21 at 12:19:19 AM CEST 
//


package iso.std.iso._20022.tech.xsd.camt_053_001;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnReasonInformation10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnReasonInformation10">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrgnlBkTxCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}BankTransactionCodeStructure4" minOccurs="0"/>
 *         &lt;element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}PartyIdentification32" minOccurs="0"/>
 *         &lt;element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}ReturnReason5Choice" minOccurs="0"/>
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}Max105Text" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnReasonInformation10", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02", propOrder = {
    "orgnlBkTxCd",
    "orgtr",
    "rsn",
    "addtlInves"
})
public class ReturnReasonInformation10
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "OrgnlBkTxCd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02")
    protected BankTransactionCodeStructure4 orgnlBkTxCd;
    @XmlElement(name = "Orgtr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02")
    protected PartyIdentification32 orgtr;
    @XmlElement(name = "Rsn", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02")
    protected ReturnReason5Choice rsn;
    @XmlElement(name = "AddtlInf", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02")
    protected List<String> addtlInves;

    /**
     * Gets the value of the orgnlBkTxCd property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public BankTransactionCodeStructure4 getOrgnlBkTxCd() {
        return orgnlBkTxCd;
    }

    /**
     * Sets the value of the orgnlBkTxCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public void setOrgnlBkTxCd(BankTransactionCodeStructure4 value) {
        this.orgnlBkTxCd = value;
    }

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification32 }
     *     
     */
    public PartyIdentification32 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification32 }
     *     
     */
    public void setOrgtr(PartyIdentification32 value) {
        this.orgtr = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnReason5Choice }
     *     
     */
    public ReturnReason5Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnReason5Choice }
     *     
     */
    public void setRsn(ReturnReason5Choice value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the addtlInves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlInves() {
        if (addtlInves == null) {
            addtlInves = new ArrayList<String>();
        }
        return this.addtlInves;
    }

}