
package ru.atc.pgu.proccenter.stub.processingcenter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegNumbersResponseAppDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegNumbersResponseAppDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Used" type="{http://pgu.gosuslugi.ru/ProcessingCenter}RegNumbersResponse" minOccurs="0"/>
 *         &lt;element name="NotUsed" type="{http://pgu.gosuslugi.ru/ProcessingCenter}RegNumbersResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegNumbersResponseAppDataType", propOrder = {
    "used",
    "notUsed"
})
public class RegNumbersResponseAppDataType {

    @XmlElement(name = "Used")
    protected RegNumbersResponse used;
    @XmlElement(name = "NotUsed")
    protected RegNumbersResponse notUsed;

    /**
     * Gets the value of the used property.
     * 
     * @return
     *     possible object is
     *     {@link RegNumbersResponse }
     *     
     */
    public RegNumbersResponse getUsed() {
        return used;
    }

    /**
     * Sets the value of the used property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegNumbersResponse }
     *     
     */
    public void setUsed(RegNumbersResponse value) {
        this.used = value;
    }

    /**
     * Gets the value of the notUsed property.
     * 
     * @return
     *     possible object is
     *     {@link RegNumbersResponse }
     *     
     */
    public RegNumbersResponse getNotUsed() {
        return notUsed;
    }

    /**
     * Sets the value of the notUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegNumbersResponse }
     *     
     */
    public void setNotUsed(RegNumbersResponse value) {
        this.notUsed = value;
    }

}
