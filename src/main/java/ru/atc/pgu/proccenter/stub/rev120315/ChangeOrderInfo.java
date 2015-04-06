
package ru.atc.pgu.proccenter.stub.rev120315;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 ���������� ��� ��������� ������� ������ � ��
 *             
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderId">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="pguId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="orgId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="statusCode">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="techCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderId",
    "statusCode",
    "comment",
    "cancelAllowed"
})
@XmlRootElement(name = "changeOrderInfo")
public class ChangeOrderInfo {

    @XmlElement(required = true)
    protected ChangeOrderInfo.OrderId orderId;
    @XmlElement(required = true)
    protected ChangeOrderInfo.StatusCode statusCode;
    protected String comment;
    protected Boolean cancelAllowed;

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeOrderInfo.OrderId }
     *     
     */
    public ChangeOrderInfo.OrderId getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeOrderInfo.OrderId }
     *     
     */
    public void setOrderId(ChangeOrderInfo.OrderId value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeOrderInfo.StatusCode }
     *     
     */
    public ChangeOrderInfo.StatusCode getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeOrderInfo.StatusCode }
     *     
     */
    public void setStatusCode(ChangeOrderInfo.StatusCode value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the cancelAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCancelAllowed() {
        return cancelAllowed;
    }

    /**
     * Sets the value of the cancelAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelAllowed(Boolean value) {
        this.cancelAllowed = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="pguId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="orgId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pguId",
        "orgId"
    })
    public static class OrderId {

        protected String pguId;
        protected String orgId;

        /**
         * Gets the value of the pguId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPguId() {
            return pguId;
        }

        /**
         * Sets the value of the pguId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPguId(String value) {
            this.pguId = value;
        }

        /**
         * Gets the value of the orgId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgId() {
            return orgId;
        }

        /**
         * Sets the value of the orgId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgId(String value) {
            this.orgId = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="techCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orgCode",
        "techCode"
    })
    public static class StatusCode {

        protected String orgCode;
        protected String techCode;

        /**
         * Gets the value of the orgCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgCode() {
            return orgCode;
        }

        /**
         * Sets the value of the orgCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgCode(String value) {
            this.orgCode = value;
        }

        /**
         * Gets the value of the techCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechCode() {
            return techCode;
        }

        /**
         * Sets the value of the techCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTechCode(String value) {
            this.techCode = value;
        }

    }

}
