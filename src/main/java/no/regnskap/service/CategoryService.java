package no.regnskap.service;

import no.regnskap.domain.Category;

import java.util.List;

public interface CategoryService {

    void save(Category category);

    Category findById(long id);

    List<Category> findAll();
}
