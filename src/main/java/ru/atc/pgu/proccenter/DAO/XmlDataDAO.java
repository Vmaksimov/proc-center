package ru.atc.pgu.proccenter.DAO;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.atc.pgu.proccenter.domain.XmlData;

import java.util.List;

public interface XmlDataDAO extends PagingAndSortingRepository<XmlData, String> {

    public List<XmlData> findAll();
    public XmlData findByOriginIdRef(String originIdRef);
}
