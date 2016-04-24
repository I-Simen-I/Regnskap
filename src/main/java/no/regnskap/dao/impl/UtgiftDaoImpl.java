package no.regnskap.dao.impl;

import no.regnskap.dao.UtgiftDao;
import no.regnskap.domain.Category;
import no.regnskap.domain.Utgift;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component("utgiftDao")
@Transactional
public class UtgiftDaoImpl implements UtgiftDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Utgift utgift) {
        getSession().save(utgift);
    }

    @Override
    public Utgift findById(long id) {
        return getSession().get(Utgift.class, id);
    }

    @Override
    public List<Utgift> findAll() {
        return getSession().createCriteria(Utgift.class).list();
    }

    @Override
    public List findUtgifterByCategory(Category category) {
        return null;
    }

    @Override
    public List findUtgifterByUser(String user) {
        return null;
    }

    @Override
    public List findUtgifterByUserAndCategory() {
        return null;
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
