package no.regnskap.dao;

import no.regnskap.domain.Category;
import no.regnskap.domain.Utgift;

import java.util.List;

public interface UtgiftDao {

    void save(Utgift utgift);

    Utgift findById(long id);

    List findAll();

    List findUtgifterByCategory(Category category);

    List findUtgifterByUser(String user);

    List findUtgifterByUserAndCategory();
}
