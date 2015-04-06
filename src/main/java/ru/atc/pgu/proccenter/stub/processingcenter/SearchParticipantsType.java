
package ru.atc.pgu.proccenter.stub.processingcenter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * �����
 * 
 * <p>Java class for SearchParticipantsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchParticipantsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SearchParticipantsByFIO" type="{http://pgu.gosuslugi.ru/ProcessingCenter}SearchParticipantsByFIOType"/>
 *         &lt;element name="SearchParticipantsByInitiator" type="{http://pgu.gosuslugi.ru/ProcessingCenter}SearchParticipantsByFIOType"/>
 *         &lt;element name="SearchParticipantsByField" type="{http://pgu.gosuslugi.ru/ProcessingCenter}SearchParticipantsByFieldType"/>
 *         &lt;element name="SearchTOP" type="{http://pgu.gosuslugi.ru/ProcessingCenter}SearchTOPType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchParticipantsType", propOrder = {
    "searchParticipantsByFIO",
    "searchParticipantsByInitiator",
    "searchParticipantsByField",
    "searchTOP"
})
public class SearchParticipantsType {

    @XmlElement(name = "SearchParticipantsByFIO")
    protected SearchParticipantsByFIOType searchParticipantsByFIO;
    @XmlElement(name = "SearchParticipantsByInitiator")
    protected SearchParticipantsByFIOType searchParticipantsByInitiator;
    @XmlElement(name = "SearchParticipantsByField")
    protected SearchParticipantsByFieldType searchParticipantsByField;
    @XmlElement(name = "SearchTOP")
    protected SearchTOPType searchTOP;

    /**
     * Gets the value of the searchParticipantsByFIO property.
     * 
     * @return
     *     possible object is
     *     {@link SearchParticipantsByFIOType }
     *     
     */
    public SearchParticipantsByFIOType getSearchParticipantsByFIO() {
        return searchParticipantsByFIO;
    }

    /**
     * Sets the value of the searchParticipantsByFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchParticipantsByFIOType }
     *     
     */
    public void setSearchParticipantsByFIO(SearchParticipantsByFIOType value) {
        this.searchParticipantsByFIO = value;
    }

    /**
     * Gets the value of the searchParticipantsByInitiator property.
     * 
     * @return
     *     possible object is
     *     {@link SearchParticipantsByFIOType }
     *     
     */
    public SearchParticipantsByFIOType getSearchParticipantsByInitiator() {
        return searchParticipantsByInitiator;
    }

    /**
     * Sets the value of the searchParticipantsByInitiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchParticipantsByFIOType }
     *     
     */
    public void setSearchParticipantsByInitiator(SearchParticipantsByFIOType value) {
        this.searchParticipantsByInitiator = value;
    }

    /**
     * Gets the value of the searchParticipantsByField property.
     * 
     * @return
     *     possible object is
     *     {@link SearchParticipantsByFieldType }
     *     
     */
    public SearchParticipantsByFieldType getSearchParticipantsByField() {
        return searchParticipantsByField;
    }

    /**
     * Sets the value of the searchParticipantsByField property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchParticipantsByFieldType }
     *     
     */
    public void setSearchParticipantsByField(SearchParticipantsByFieldType value) {
        this.searchParticipantsByField = value;
    }

    /**
     * Gets the value of the searchTOP property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTOPType }
     *     
     */
    public SearchTOPType getSearchTOP() {
        return searchTOP;
    }

    /**
     * Sets the value of the searchTOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTOPType }
     *     
     */
    public void setSearchTOP(SearchTOPType value) {
        this.searchTOP = value;
    }

}
