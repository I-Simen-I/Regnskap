package no.regnskap.dao;

import no.regnskap.domain.Category;
import no.regnskap.domain.Expense;

import java.util.List;

public interface ExpenseDao {

    void save(Expense expense);

    Expense findById(long id);

    List findAll();

    List findExpensesByCategory(Category category);

    List findExpensesByUser(String user);

    List findExpensesByUserAndCategory();
}
