package ru.atc.pgu.proccenter.domain;

import javax.persistence.*;
import java.util.List;

/**
 * User: vmaksimov
 */
@Entity
public class School {

    @Id
    private String code;
    private String name;
    @ManyToOne
    @JoinColumn(name = "cityCode", referencedColumnName = "code")
    private City city;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "schoolParticipantId", referencedColumnName = "code")
    private List<Participant> participant;

    /*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "schoolNumberParticipantsId", referencedColumnName = "regNo")
    private List<NumberParticipant> numberParticipants;

    public List<NumberParticipant> getNumberParticipants() {
        return numberParticipants;
    }

    public void setNumberParticipants(List<NumberParticipant> numberParticipants) {
        this.numberParticipants = numberParticipants;
    }*/

    public List<Participant> getParticipant() {
        return participant;
    }
    public void setParticipant(List<Participant> participant) {
        this.participant = participant;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
