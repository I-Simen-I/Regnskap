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
        return getSession().createQuery("from Category").getResultList();
    }

    @Override
    public List<CategoryType> getAllCategoryTypes() {
        return getSession().createQuery("from CategoryType").getResultList();
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
