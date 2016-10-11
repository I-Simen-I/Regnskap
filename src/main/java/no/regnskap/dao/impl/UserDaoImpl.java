package no.regnskap.dao.impl;

import no.regnskap.dao.UserDao;
import no.regnskap.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component("userDao")
public class UserDaoImpl implements UserDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<User> getAllUsers() {
        return getSession().createQuery("from User").getResultList();
    }

    @Override
    public User getUserById(long id) {
        return getSession().get(User.class, id);
    }

    @Override
    public User getUserByEmailAddress(String emailAddress) {
        Query query = getSession().createQuery("from User u where u.emailAddress = :emailAddress");
        query.setParameter("emailAddress", emailAddress);

        return (User) query.uniqueResult();
    }

    @Override
    public List<User> getUserByLastName(String lastName) {
        Query query = getSession().createQuery("from User u where u.lastName = :lastName");
        query.setParameter("lastName", lastName);

        return query.list();
    }

    @Override
    public List<User> getUsersByCreatedDate(Date date) {
        Query query = getSession().createNamedQuery("findUserByCreatedDate");
        query.setParameter("date", date);

        return query.list();
    }

    @Override
    public boolean validateUser(String emailAddress, String password) {
        Query query = getSession().createQuery("from User u where u.emailAddress = :emailAddress and u.password = :password");
        query.setParameter("emailAddress", emailAddress);
        query.setParameter("password", password);

        User user = (User) query.uniqueResult();

        return user != null;
    }

    @Override
    public void updateUser(User user) {
        getSession().merge(user);
    }

    @Override
    public void saveUser(User user) {
        getSession().save(user);
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
