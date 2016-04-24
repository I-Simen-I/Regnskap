package no.regnskap.service.impl;

import no.regnskap.dao.CategoryDao;
import no.regnskap.domain.Category;
import no.regnskap.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public void save(Category category) {
        categoryDao.save(category);
    }

    @Override
    public Category findById(long id) {
        return categoryDao.findById(id);
    }

    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    public void setCategoryDao(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }
}
