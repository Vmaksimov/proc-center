package ru.atc.pgu.proccenter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User: vmaksimov
 */
@Entity
public class XmlData {

    @Id
    private String originIdRef;
    @Column(length=102400)
    private String requestXml;
    @Column(length=102400)
    private String responseXml;

    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getOriginIdRef() {
        return originIdRef;
    }

    public void setOriginIdRef(String originIdRef) {
        this.originIdRef = originIdRef;
    }

    public String getRequestXml() {
        return requestXml;
    }

    public void setRequestXml(String requestXml) {
        this.requestXml = requestXml;
    }

    public String getResponseXml() {
        return responseXml;
    }

    public void setResponseXml(String responseXml) {
        this.responseXml = responseXml;
    }
}
