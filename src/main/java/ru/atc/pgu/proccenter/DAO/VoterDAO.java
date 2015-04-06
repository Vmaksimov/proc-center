package ru.atc.pgu.proccenter.DAO;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.atc.pgu.proccenter.domain.Participant;
import ru.atc.pgu.proccenter.domain.Voter;

import java.util.List;

public interface VoterDAO extends PagingAndSortingRepository<Voter, Long> {

    public List<Voter> findAll();
    public Voter findById(String id);
    public Voter findByUserId(String id);
    public List<Voter> findByParticipant(Participant participant);
}
