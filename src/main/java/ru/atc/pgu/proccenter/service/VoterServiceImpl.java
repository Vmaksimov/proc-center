package ru.atc.pgu.proccenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.atc.pgu.proccenter.DAO.VoterDAO;
import ru.atc.pgu.proccenter.domain.Voter;

import java.util.List;

public class VoterServiceImpl implements VoterService {

    @Autowired
    VoterDAO voterDAO;

    @Override
    public List<Voter> findAll() {
        return voterDAO.findAll();
    }

    @Override
    public Voter findById(String id) {
        return voterDAO.findById(id);
    }
}
