package ru.atc.pgu.proccenter.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import ru.atc.pgu.proccenter.domain.School;
import ru.atc.pgu.proccenter.domain.SchoolClass;

import java.util.List;

/**
 * User: vmaksimov
 */
public interface SchoolClassDAO extends PagingAndSortingRepository<SchoolClass, String> {

    public List<SchoolClass> findAll();
    public SchoolClass findByCode(String code);
    public SchoolClass findByName(String name);
    public List<SchoolClass> findBySchool(School school);
//    @Query("SELECT DISTINCT  p FROM SchoolClass p WHERE  p.school = :school and p.participant.size > 0 ")
    @Query(value = "SELECT DISTINCT sc.* FROM School s join SCHOOLCLASS sc on s.CODE=sc.SCHOOLCODE join PARTICIPANT p on p.SCHOOLCLASSCODE=sc.CODE where s.CODE = ?1", nativeQuery = true)
    public List<SchoolClass> findBySchoolAndParticipantNotNull(String schoolCode);
//    @Query("SELECT DISTINCT p FROM SchoolClass p WHERE  p.school = :school and p.name = :name and p.participant.size > 0 ")
    @Query(value = "SELECT DISTINCT sc.* FROM School s join SCHOOLCLASS sc on s.CODE=sc.SCHOOLCODE join PARTICIPANT p on p.SCHOOLCLASSCODE=sc.CODE where sc.NAME = ?1 and s.CODE = ?2", nativeQuery = true)
    public SchoolClass findByNameAndSchoolAndParticipantNotNull(String name, String schoolCode);
    public SchoolClass findByNameAndSchool(String name,School school);
}
