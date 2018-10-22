//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Reference to a Feature
 * 
 * <p>Java class for FeatureRefStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureRefStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeatureIdRef" type="{http://www.ifopt.org.uk/ifopt}FeatureIdRefStructure"/>
 *         &lt;element name="FeatureType" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureRefStructure", propOrder = {
    "featureIdRef",
    "featureType"
})
public class FeatureRefStructure {

    @XmlElement(name = "FeatureIdRef", required = true)
    protected FeatureIdRefStructure featureIdRef;
    @XmlElement(name = "FeatureType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String featureType;

    /**
     * Gets the value of the featureIdRef property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureIdRefStructure }
     *     
     */
    public FeatureIdRefStructure getFeatureIdRef() {
        return featureIdRef;
    }

    /**
     * Sets the value of the featureIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureIdRefStructure }
     *     
     */
    public void setFeatureIdRef(FeatureIdRefStructure value) {
        this.featureIdRef = value;
    }

    /**
     * Gets the value of the featureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureType() {
        return featureType;
    }

    /**
     * Sets the value of the featureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureType(String value) {
        this.featureType = value;
    }

}
