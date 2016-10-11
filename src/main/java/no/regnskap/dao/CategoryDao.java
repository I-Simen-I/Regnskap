package no.regnskap.dao;

import no.regnskap.domain.Category;
import no.regnskap.domain.CategoryType;

import java.util.List;

public interface CategoryDao {

    void save(Category category);

    Category findById(long id);

    List<Category> getAllCategories();

    CategoryType findCategoryTypeById(String id);

    List<CategoryType> getAllCategoryTypes();
}
