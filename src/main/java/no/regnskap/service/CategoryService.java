package no.regnskap.service;

import no.regnskap.domain.Category;
import no.regnskap.domain.CategoryType;

import java.util.List;

public interface CategoryService {

    void save(Category category);

    Category findById(long id);

    List<Category> getAllCategories();

    List<CategoryType> getAllCategoryTypes();

    List<Category> findCategoriesByCategoryType(CategoryType categoryType);

    List<Category> findCategoriesByUserId(long userId);
}
