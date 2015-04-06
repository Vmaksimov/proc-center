
package ru.atc.pgu.proccenter.stub.processingcenter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultParticipantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultParticipantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Participant" type="{http://pgu.gosuslugi.ru/ProcessingCenter}RegistrationActionType" minOccurs="0"/>
 *         &lt;element name="CountVotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultParticipantType", propOrder = {
    "participant",
    "countVotes"
})
public class ResultParticipantType {

    @XmlElement(name = "Participant")
    protected RegistrationActionType participant;
    @XmlElement(name = "CountVotes")
    protected String countVotes;

    /**
     * Gets the value of the participant property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationActionType }
     *     
     */
    public RegistrationActionType getParticipant() {
        return participant;
    }

    /**
     * Sets the value of the participant property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationActionType }
     *     
     */
    public void setParticipant(RegistrationActionType value) {
        this.participant = value;
    }

    /**
     * Gets the value of the countVotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountVotes() {
        return countVotes;
    }

    /**
     * Sets the value of the countVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountVotes(String value) {
        this.countVotes = value;
    }

}
