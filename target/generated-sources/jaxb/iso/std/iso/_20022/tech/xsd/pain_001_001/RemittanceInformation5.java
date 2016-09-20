//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.21 at 12:19:19 AM CEST 
//


package iso.std.iso._20022.tech.xsd.pain_001_001;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemittanceInformation5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemittanceInformation5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ustrd" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max140Text" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Strd" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}StructuredRemittanceInformation7" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceInformation5", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03", propOrder = {
    "ustrds",
    "strds"
})
public class RemittanceInformation5
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Ustrd", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    protected List<String> ustrds;
    @XmlElement(name = "Strd", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.03")
    protected List<StructuredRemittanceInformation7> strds;

    /**
     * Gets the value of the ustrds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ustrds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUstrds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUstrds() {
        if (ustrds == null) {
            ustrds = new ArrayList<String>();
        }
        return this.ustrds;
    }

    /**
     * Gets the value of the strds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredRemittanceInformation7 }
     * 
     * 
     */
    public List<StructuredRemittanceInformation7> getStrds() {
        if (strds == null) {
            strds = new ArrayList<StructuredRemittanceInformation7>();
        }
        return this.strds;
    }

}
