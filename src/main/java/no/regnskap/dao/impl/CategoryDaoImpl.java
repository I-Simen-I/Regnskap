package no.regnskap.dao.impl;

import no.regnskap.dao.CategoryDao;
import no.regnskap.domain.Category;
import no.regnskap.domain.CategoryType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("categoryDao")
public class CategoryDaoImpl implements CategoryDao {
    private final SessionFactory sessionFactory;

    @Autowired
    public CategoryDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Category category) {
        getSession().save(category);
    }

    @Override
    public Category findById(long id) {
        return getSession().get(Category.class, id);
    }

    @Override
    public List<Category> getAllCategories() {
        return (List<Category>) getSession().createCriteria(Category.class).list();
    }

    @Override
    public List<CategoryType> getAllCategoryTypes() {
        return (List<CategoryType>) getSession().createCriteria(CategoryType.class).list();
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
