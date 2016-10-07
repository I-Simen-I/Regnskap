package no.regnskap.service.impl;

import no.regnskap.dao.CategoryDao;
import no.regnskap.domain.Category;
import no.regnskap.domain.CategoryType;
import no.regnskap.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService {

    private final CategoryDao categoryDao;

    @Autowired
    public CategoryServiceImpl(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public void save(Category category) {
        categoryDao.save(category);
    }

    @Override
    public Category findById(long id) {
        return categoryDao.findById(id);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryDao.getAllCategories();
    }

    @Override
    public List<CategoryType> getAllCategoryTypes() {
        return categoryDao.getAllCategoryTypes();
    }

    @Override
    public List<Category> findCategoriesByCategoryType(CategoryType categoryType) {
        return null;
    }

    @Override
    public List<Category> findCategoriesByUserId(long userId) {
        return null;
    }
}
