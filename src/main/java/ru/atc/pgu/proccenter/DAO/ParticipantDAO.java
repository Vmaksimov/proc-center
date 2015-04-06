package ru.atc.pgu.proccenter.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import ru.atc.pgu.proccenter.domain.NumberParticipant;
import ru.atc.pgu.proccenter.domain.Participant;
import ru.atc.pgu.proccenter.domain.SchoolClass;

import java.util.List;

public interface ParticipantDAO extends PagingAndSortingRepository<Participant, Long> {

    public List<Participant> findAll();
    public Participant findById(String id);

    @Query(value = "select * from (select * from (SELECT * FROM PARTICIPANT ORDER BY COUNTVOTER DESC) where ROWNUM() <= ?1 ORDER BY DATELASTVOTER ASC NULLS LAST) ORDER BY COUNTVOTER DESC", nativeQuery = true)
    public List<Participant> findTopOrderByCountVoter(Integer countVoter);

    @Query(value = "select * from (select * from (SELECT * FROM PARTICIPANT where CITYPARTICIPANTID=?1 ORDER BY COUNTVOTER DESC) where ROWNUM() <= ?2 ORDER BY DATELASTVOTER ASC NULLS LAST) ORDER BY COUNTVOTER DESC", nativeQuery = true)
    public List<Participant> findTopByCityOrderByCountVoter(String cityCode, Integer countVoter);

    public Participant findByNumberParticipant(NumberParticipant numberParticipant);
    @Query("SELECT p FROM Participant p WHERE LOWER(p.fio) = LOWER(:fio)")
    public List<Participant> findByFio(@Param("fio") String fio);

    public List<Participant> findByUserIdInitiator(String userIdInitiator);

    @Query("SELECT p FROM Participant p WHERE p.schoolClass = :schoolClass")
    public List<Participant> findBySchoolClass(@Param("schoolClass") SchoolClass schoolClass);
//    public List<Participant> findByCity(City city);
}
