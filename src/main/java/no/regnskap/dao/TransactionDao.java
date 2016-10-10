package no.regnskap.dao;

import no.regnskap.domain.Category;
import no.regnskap.domain.Transaction;

import java.util.List;

public interface TransactionDao {

    void save(Transaction transaction);

    Transaction findById(long id);

    List<Transaction> getAllTransactions();

    List<Transaction> findTransactionByCategory(Category category);

    List<Transaction> findTransactionByUser(String user);

    List<Transaction> findTransactionByUserAndCategory();
}
