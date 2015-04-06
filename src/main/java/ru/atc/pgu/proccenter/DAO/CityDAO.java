package ru.atc.pgu.proccenter.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import ru.atc.pgu.proccenter.domain.City;

import java.util.List;

/**
 * User: vmaksimov
 */
public interface CityDAO extends PagingAndSortingRepository<City, String> {

    public List<City> findAll();
    public City findByCode(String code);
    @Query("SELECT p FROM City p WHERE  p.participant.size > 0")
    public List<City> findAllNotNullParticipant();
}
