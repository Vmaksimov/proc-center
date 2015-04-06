package ru.atc.pgu.proccenter.DAO;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.atc.pgu.proccenter.domain.NumberParticipant;
import ru.atc.pgu.proccenter.domain.School;

import java.util.List;

public interface NumberParticipantDAO extends PagingAndSortingRepository<NumberParticipant, String> {

    public List<NumberParticipant> findAll();
    public NumberParticipant findByRegNo(String regNo);
    public List<NumberParticipant> findBySchool(School school);
    public List<NumberParticipant> findBySchoolAndIsUsed(School school, boolean isUsed);
    public List<NumberParticipant> findByIsUsed(boolean isUsed);
}
