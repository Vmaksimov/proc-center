package ru.atc.pgu.proccenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.atc.pgu.proccenter.DAO.ParticipantDAO;
import ru.atc.pgu.proccenter.domain.Participant;

import java.util.List;

@Repository
public class ParticipantServiceImpl implements ParticipantService {

    @Autowired
    ParticipantDAO participantDAO;

    @Override
    public List<Participant> findAll() {
        return participantDAO.findAll();
    }

    @Override
    public Participant findById(String id) {
        return participantDAO.findById(id);
    }

    @Override
    public List<Participant> findByFio(String fio) {
        return participantDAO.findByFio(fio);
    }
}
