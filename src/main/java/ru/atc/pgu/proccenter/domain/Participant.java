package ru.atc.pgu.proccenter.domain;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fio;
    @ManyToOne
    @JoinColumn(name = "schoolClassCode", referencedColumnName = "code")
    private SchoolClass schoolClass;
    private String userIdInitiator;
    @Column(columnDefinition = "int default 0")
    private int countVoter;

    @OneToOne
    @JoinColumn(name = "regNo", referencedColumnName = "regNo")
    private NumberParticipant numberParticipant;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "xmlId", referencedColumnName = "originIdRef")
    private XmlData xmlData;

    private Date dateLastVoter;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "voterId", referencedColumnName = "id")
    private List<Voter> voter;

    public List<Voter> getVoter() {
        return voter;
    }

    public void setVoter(List<Voter> voter) {
        this.voter = voter;
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

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    public String getUserIdInitiator() {
        return userIdInitiator;
    }

    public void setUserIdInitiator(String userIdInitiator) {
        this.userIdInitiator = userIdInitiator;
    }

    public NumberParticipant getNumberParticipant() {
        return numberParticipant;
    }

    public void setNumberParticipant(NumberParticipant numberParticipant) {
        this.numberParticipant = numberParticipant;
    }

    public int getCountVoter() {
        return countVoter;
    }

    public void setCountVoter(int countVoter) {
        this.countVoter = countVoter;
    }

    public Date getDateLastVoter() {
        return dateLastVoter;
    }

    public void setDateLastVoter(Date dateLastVoter) {
        this.dateLastVoter = dateLastVoter;
    }
}
