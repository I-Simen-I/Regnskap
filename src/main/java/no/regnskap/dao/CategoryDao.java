package no.regnskap.dao;

import no.regnskap.domain.Category;

import java.util.List;

public interface CategoryDao {

    void save(Category category);

    Category findById(long id);

    List<Category> findAll();
}
