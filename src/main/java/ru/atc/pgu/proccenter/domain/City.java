package ru.atc.pgu.proccenter.domain;

import javax.persistence.*;
import java.util.List;

/**
 * User: vmaksimov
 */
@Entity
public class City {

    @Id
    private String code;
    private String name;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "CityParticipantId", referencedColumnName = "code")
    private List<Participant> participant;


    public List<Participant> getParticipant() {
        return participant;
    }

    public void setParticipant(List<Participant> participant) {
        this.participant = participant;
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
