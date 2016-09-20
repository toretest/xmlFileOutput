//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.21 at 12:19:19 AM CEST 
//


package iso.std.iso._20022.tech.xsd.camt_029_001;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StructuredRemittanceInformation7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredRemittanceInformation7">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RfrdDocInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}ReferredDocumentInformation3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RfrdDocAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}RemittanceAmount1" minOccurs="0"/>
 *         &lt;element name="CdtrRefInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}CreditorReferenceInformation2" minOccurs="0"/>
 *         &lt;element name="Invcr" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}PartyIdentification32" minOccurs="0"/>
 *         &lt;element name="Invcee" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}PartyIdentification32" minOccurs="0"/>
 *         &lt;element name="AddtlRmtInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.03}Max140Text" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRemittanceInformation7", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03", propOrder = {
    "rfrdDocInves",
    "rfrdDocAmt",
    "cdtrRefInf",
    "invcr",
    "invcee",
    "addtlRmtInves"
})
public class StructuredRemittanceInformation7
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "RfrdDocInf", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected List<ReferredDocumentInformation3> rfrdDocInves;
    @XmlElement(name = "RfrdDocAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected RemittanceAmount1 rfrdDocAmt;
    @XmlElement(name = "CdtrRefInf", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected CreditorReferenceInformation2 cdtrRefInf;
    @XmlElement(name = "Invcr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected PartyIdentification32 invcr;
    @XmlElement(name = "Invcee", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected PartyIdentification32 invcee;
    @XmlElement(name = "AddtlRmtInf", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.03")
    protected List<String> addtlRmtInves;

    /**
     * Gets the value of the rfrdDocInves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rfrdDocInves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRfrdDocInves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferredDocumentInformation3 }
     * 
     * 
     */
    public List<ReferredDocumentInformation3> getRfrdDocInves() {
        if (rfrdDocInves == null) {
            rfrdDocInves = new ArrayList<ReferredDocumentInformation3>();
        }
        return this.rfrdDocInves;
    }

    /**
     * Gets the value of the rfrdDocAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceAmount1 }
     *     
     */
    public RemittanceAmount1 getRfrdDocAmt() {
        return rfrdDocAmt;
    }

    /**
     * Sets the value of the rfrdDocAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceAmount1 }
     *     
     */
    public void setRfrdDocAmt(RemittanceAmount1 value) {
        this.rfrdDocAmt = value;
    }

    /**
     * Gets the value of the cdtrRefInf property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorReferenceInformation2 }
     *     
     */
    public CreditorReferenceInformation2 getCdtrRefInf() {
        return cdtrRefInf;
    }

    /**
     * Sets the value of the cdtrRefInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorReferenceInformation2 }
     *     
     */
    public void setCdtrRefInf(CreditorReferenceInformation2 value) {
        this.cdtrRefInf = value;
    }

    /**
     * Gets the value of the invcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification32 }
     *     
     */
    public PartyIdentification32 getInvcr() {
        return invcr;
    }

    /**
     * Sets the value of the invcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification32 }
     *     
     */
    public void setInvcr(PartyIdentification32 value) {
        this.invcr = value;
    }

    /**
     * Gets the value of the invcee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification32 }
     *     
     */
    public PartyIdentification32 getInvcee() {
        return invcee;
    }

    /**
     * Sets the value of the invcee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification32 }
     *     
     */
    public void setInvcee(PartyIdentification32 value) {
        this.invcee = value;
    }

    /**
     * Gets the value of the addtlRmtInves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlRmtInves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRmtInves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlRmtInves() {
        if (addtlRmtInves == null) {
            addtlRmtInves = new ArrayList<String>();
        }
        return this.addtlRmtInves;
    }

}
