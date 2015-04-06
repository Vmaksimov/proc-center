
package ru.atc.pgu.proccenter.stub.processingcenter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResponseAppDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResponseAppDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultParticipant" type="{http://pgu.gosuslugi.ru/ProcessingCenter}ResultParticipantType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DataVoter" type="{http://pgu.gosuslugi.ru/ProcessingCenter}DataVoterType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResponseAppDataType", propOrder = {
    "resultParticipant",
    "dataVoter"
})
public class SearchResponseAppDataType {

    @XmlElement(name = "ResultParticipant")
    protected List<ResultParticipantType> resultParticipant;
    @XmlElement(name = "DataVoter")
    protected List<DataVoterType> dataVoter;

    /**
     * Gets the value of the resultParticipant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultParticipant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultParticipantType }
     * 
     * 
     */
    public List<ResultParticipantType> getResultParticipant() {
        if (resultParticipant == null) {
            resultParticipant = new ArrayList<ResultParticipantType>();
        }
        return this.resultParticipant;
    }

    /**
     * Gets the value of the dataVoter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataVoter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataVoter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataVoterType }
     * 
     * 
     */
    public List<DataVoterType> getDataVoter() {
        if (dataVoter == null) {
            dataVoter = new ArrayList<DataVoterType>();
        }
        return this.dataVoter;
    }

}
