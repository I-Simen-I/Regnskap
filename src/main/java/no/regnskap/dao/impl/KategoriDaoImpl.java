package no.regnskap.dao.impl;

import no.regnskap.dao.KategoriDao;
import no.regnskap.domain.kodeverk.Kategori;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component("kategoriDao")
@Transactional
public class KategoriDaoImpl implements KategoriDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Kategori kategori) {
        Session session = sessionFactory.getCurrentSession();
        session.save(kategori);
    }


    @Override
    public Kategori findById(long id) {
        Session session = sessionFactory.getCurrentSession();
        return (Kategori) session.get(Kategori.class, id);
    }

    @Override
    public List<Kategori> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return (List<Kategori>) session.createCriteria(Kategori.class).list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
