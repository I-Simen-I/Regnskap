package no.regnskap.dao.impl;

import no.regnskap.dao.TransactionDao;
import no.regnskap.domain.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("transactionDao")
public class TransactionDaoImpl implements TransactionDao {
    private final SessionFactory sessionFactory;

    @Autowired
    public TransactionDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Transaction transaction) {
        getSession().save(transaction);
    }

    @Override
    public Transaction findById(long id) {
        return getSession().get(Transaction.class, id);
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return getSession().createQuery("from Transaction").getResultList();
    }

    @Override
    public List<Transaction> getTransactionsByCategory(long id) {
        return getSession().createQuery("from Transaction t where t.category.id = " + id).getResultList();
    }

    @Override
    public List<Transaction> getTransactionsByUser(String user) {
        return null;
    }

    @Override
    public List<Transaction> getTransactionsByUserAndCategory() {
        return null;
    }

    @Override
    public List<Transaction> getTransactionsByDate() {
        return null;
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
