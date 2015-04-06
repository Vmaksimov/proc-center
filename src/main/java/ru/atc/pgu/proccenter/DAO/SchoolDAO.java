package ru.atc.pgu.proccenter.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import ru.atc.pgu.proccenter.domain.City;
import ru.atc.pgu.proccenter.domain.School;

import java.util.List;

/**
 * User: vmaksimov
 */
public interface SchoolDAO extends PagingAndSortingRepository<School, String> {

    public List<School> findAll();
    public School findByCode(String code);
    @Query(value = "SELECT DISTINCT s.* FROM School s join SCHOOLCLASS sc on s.CODE=sc.SCHOOLCODE join PARTICIPANT p on p.SCHOOLCLASSCODE=sc.CODE where s.CODE = ?1 and s.CITYCODE = ?2", nativeQuery = true)
    public School findByCodeAndCityAndParticipantNotNull(String code, String cityCode);
    public List<School> findByCity(City city);
    @Query(value = "SELECT DISTINCT s.* FROM School s join SCHOOLCLASS sc on s.CODE=sc.SCHOOLCODE join PARTICIPANT p on p.SCHOOLCLASSCODE=sc.CODE where s.CITYCODE = ?1", nativeQuery = true)
    public List<School> findByCityAndParticipantNotNull(String cityCode);
}
