package ru.atc.pgu.proccenter.service;

import ru.atc.pgu.proccenter.domain.NumberParticipant;

import java.util.List;

public interface NumberParticipantService  {

    public List<NumberParticipant> findAll();
    public NumberParticipant findByRegNo(String regNo);
}
