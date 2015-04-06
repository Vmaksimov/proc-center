
package ru.atc.pgu.proccenter.stub.processingcenter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ����� �� ���
 * 
 * <p>Java class for SearchParticipantsByFIOType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchParticipantsByFIOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FIOParticipant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserIdInitiator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchParticipantsByFIOType", propOrder = {
    "fioParticipant",
    "userIdInitiator"
})
public class SearchParticipantsByFIOType {

    @XmlElement(name = "FIOParticipant", required = true)
    protected String fioParticipant;
    @XmlElement(name = "UserIdInitiator")
    protected String userIdInitiator;

    /**
     * Gets the value of the fioParticipant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOParticipant() {
        return fioParticipant;
    }

    /**
     * Sets the value of the fioParticipant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOParticipant(String value) {
        this.fioParticipant = value;
    }

    /**
     * Gets the value of the userIdInitiator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdInitiator() {
        return userIdInitiator;
    }

    /**
     * Sets the value of the userIdInitiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdInitiator(String value) {
        this.userIdInitiator = value;
    }

}
