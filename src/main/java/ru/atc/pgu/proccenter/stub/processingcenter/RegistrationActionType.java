
package ru.atc.pgu.proccenter.stub.processingcenter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ����������� � �����
 * 
 * <p>Java class for RegistrationActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldDropdownCodeCityr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FieldDropdownNameCityr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FieldDropdownCodeSchoolr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FieldDropdownNameSchoolr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FieldDropdownClassr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Schoolmanr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserIdInitiator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationActionType", propOrder = {
    "fieldDropdownCodeCityr",
    "fieldDropdownNameCityr",
    "fieldDropdownCodeSchoolr",
    "fieldDropdownNameSchoolr",
    "fieldDropdownClassr",
    "schoolmanr",
    "userIdInitiator",
    "regNo"
})
public class RegistrationActionType {

    @XmlElement(name = "FieldDropdownCodeCityr", required = true)
    protected String fieldDropdownCodeCityr;
    @XmlElement(name = "FieldDropdownNameCityr", required = true)
    protected String fieldDropdownNameCityr;
    @XmlElement(name = "FieldDropdownCodeSchoolr", required = true)
    protected String fieldDropdownCodeSchoolr;
    @XmlElement(name = "FieldDropdownNameSchoolr", required = true)
    protected String fieldDropdownNameSchoolr;
    @XmlElement(name = "FieldDropdownClassr", required = true)
    protected String fieldDropdownClassr;
    @XmlElement(name = "Schoolmanr", required = true)
    protected String schoolmanr;
    @XmlElement(name = "UserIdInitiator", required = true)
    protected String userIdInitiator;
    @XmlElement(name = "RegNo", required = true)
    protected String regNo;

    /**
     * Gets the value of the fieldDropdownCodeCityr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldDropdownCodeCityr() {
        return fieldDropdownCodeCityr;
    }

    /**
     * Sets the value of the fieldDropdownCodeCityr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldDropdownCodeCityr(String value) {
        this.fieldDropdownCodeCityr = value;
    }

    /**
     * Gets the value of the fieldDropdownNameCityr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldDropdownNameCityr() {
        return fieldDropdownNameCityr;
    }

    /**
     * Sets the value of the fieldDropdownNameCityr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldDropdownNameCityr(String value) {
        this.fieldDropdownNameCityr = value;
    }

    /**
     * Gets the value of the fieldDropdownCodeSchoolr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldDropdownCodeSchoolr() {
        return fieldDropdownCodeSchoolr;
    }

    /**
     * Sets the value of the fieldDropdownCodeSchoolr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldDropdownCodeSchoolr(String value) {
        this.fieldDropdownCodeSchoolr = value;
    }

    /**
     * Gets the value of the fieldDropdownNameSchoolr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldDropdownNameSchoolr() {
        return fieldDropdownNameSchoolr;
    }

    /**
     * Sets the value of the fieldDropdownNameSchoolr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldDropdownNameSchoolr(String value) {
        this.fieldDropdownNameSchoolr = value;
    }

    /**
     * Gets the value of the fieldDropdownClassr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldDropdownClassr() {
        return fieldDropdownClassr;
    }

    /**
     * Sets the value of the fieldDropdownClassr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldDropdownClassr(String value) {
        this.fieldDropdownClassr = value;
    }

    /**
     * Gets the value of the schoolmanr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolmanr() {
        return schoolmanr;
    }

    /**
     * Sets the value of the schoolmanr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolmanr(String value) {
        this.schoolmanr = value;
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

}
