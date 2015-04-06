package ru.atc.pgu.proccenter.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * User: vmaksimov
 */
@Entity
public class Voter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fio;
    private String userId;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date date;
    @OneToOne
    @JoinColumn(name = "xmlId", referencedColumnName = "originIdRef")
    private XmlData xmlData;

    @ManyToOne
    @JoinColumn(name = "participantId", referencedColumnName = "id")
    private Participant participant;

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public XmlData getXmlData() {
        return xmlData;
    }

    public void setXmlData(XmlData xmlData) {
        this.xmlData = xmlData;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
