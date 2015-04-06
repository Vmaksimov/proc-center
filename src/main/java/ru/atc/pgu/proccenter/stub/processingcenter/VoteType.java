
package ru.atc.pgu.proccenter.stub.processingcenter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * �����������
 * 
 * <p>Java class for VoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FioVoter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FieldDropdownCodeCityg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FieldDropdownCodeSchoolg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FieldDropdownClassg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FieldDropdownChildreng" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteType", propOrder = {
    "fioVoter",
    "userId",
    "regNo",
    "fieldDropdownCodeCityg",
    "fieldDropdownCodeSchoolg",
    "fieldDropdownClassg",
    "fieldDropdownChildreng"
})
public class VoteType {

    @XmlElement(name = "FioVoter", required = true)
    protected String fioVoter;
    @XmlElement(name = "UserId", required = true)
    protected String userId;
    @XmlElement(name = "RegNo", required = true)
    protected String regNo;
    @XmlElement(name = "FieldDropdownCodeCityg", required = true)
    protected String fieldDropdownCodeCityg;
    @XmlElement(name = "FieldDropdownCodeSchoolg", required = true)
    protected String fieldDropdownCodeSchoolg;
    @XmlElement(name = "FieldDropdownClassg", required = true)
    protected String fieldDropdownClassg;
    @XmlElement(name = "FieldDropdownChildreng", required = true)
    protected String fieldDropdownChildreng;

    /**
     * Gets the value of the fioVoter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFioVoter() {
        return fioVoter;
    }

    /**
     * Sets the value of the fioVoter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFioVoter(String value) {
        this.fioVoter = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the regNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNo() {
        return regNo;
    }

    /**
     * Sets the value of the regNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNo(String value) {
        this.regNo = value;
    }

    /**
     * Gets the value of the fieldDropdownCodeCityg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldDropdownCodeCityg() {
        return fieldDropdownCodeCityg;
    }

    /**
     * Sets the value of the fieldDropdownCodeCityg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldDropdownCodeCityg(String value) {
        this.fieldDropdownCodeCityg = value;
    }

    /**
     * Gets the value of the fieldDropdownCodeSchoolg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldDropdownCodeSchoolg() {
        return fieldDropdownCodeSchoolg;
    }

    /**
     * Sets the value of the fieldDropdownCodeSchoolg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldDropdownCodeSchoolg(String value) {
        this.fieldDropdownCodeSchoolg = value;
    }

    /**
     * Gets the value of the fieldDropdownClassg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldDropdownClassg() {
        return fieldDropdownClassg;
    }

    /**
     * Sets the value of the fieldDropdownClassg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldDropdownClassg(String value) {
        this.fieldDropdownClassg = value;
    }

    /**
     * Gets the value of the fieldDropdownChildreng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldDropdownChildreng() {
        return fieldDropdownChildreng;
    }

    /**
     * Sets the value of the fieldDropdownChildreng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldDropdownChildreng(String value) {
        this.fieldDropdownChildreng = value;
    }

}
