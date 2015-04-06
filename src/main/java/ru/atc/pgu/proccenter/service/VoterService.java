package ru.atc.pgu.proccenter.service;

import ru.atc.pgu.proccenter.domain.Voter;

import java.util.List;

public interface VoterService {

    public List<Voter> findAll();
    public Voter findById(String id);
}
