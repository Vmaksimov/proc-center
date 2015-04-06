package ru.atc.pgu.proccenter.service;

import ru.atc.pgu.proccenter.domain.Participant;

import java.util.List;

public interface ParticipantService {

    public List<Participant> findAll();
    public Participant findById(String id);
    public List<Participant> findByFio(String fio);

}
