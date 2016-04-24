package no.regnskap.dao.impl;

import no.regnskap.dao.ExpenseDao;
import no.regnskap.domain.Category;
import no.regnskap.domain.Expense;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component("expenseDao")
@Transactional
public class ExpenseDaoImpl implements ExpenseDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Expense expense) {
        getSession().save(expense);
    }

    @Override
    public Expense findById(long id) {
        return getSession().get(Expense.class, id);
    }

    @Override
    public List<Expense> findAll() {
        return getSession().createCriteria(Expense.class).list();
    }

    @Override
    public List findExpensesByCategory(Category category) {
        return null;
    }

    @Override
    public List findExpensesByUser(String user) {
        return null;
    }

    @Override
    public List findExpensesByUserAndCategory() {
        return null;
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
