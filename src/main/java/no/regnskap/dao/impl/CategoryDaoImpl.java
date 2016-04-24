package no.regnskap.dao.impl;

import no.regnskap.dao.CategoryDao;
import no.regnskap.domain.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component("categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Category category) {
        getSession().save(category);
    }

    @Override
    public Category findById(long id) {
        return (Category) getSession().get(Category.class, id);
    }

    @Override
    public List<Category> findAll() {
        return (List<Category>) getSession().createCriteria(Category.class).list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
