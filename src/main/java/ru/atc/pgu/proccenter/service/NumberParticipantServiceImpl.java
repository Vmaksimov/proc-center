package ru.atc.pgu.proccenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.atc.pgu.proccenter.DAO.NumberParticipantDAO;
import ru.atc.pgu.proccenter.DAO.SchoolDAO;
import ru.atc.pgu.proccenter.domain.NumberParticipant;
import ru.atc.pgu.proccenter.domain.School;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class NumberParticipantServiceImpl implements NumberParticipantService{

    @Autowired
    NumberParticipantDAO numberParticipantDAO;

    @Autowired
    SchoolDAO schoolDAO;



    @Override
    public List<NumberParticipant> findAll() {
        return numberParticipantDAO.findAll();
    }

    @Override
    public NumberParticipant findByRegNo(String regNo) {
        return numberParticipantDAO.findByRegNo(regNo);
    }
}
