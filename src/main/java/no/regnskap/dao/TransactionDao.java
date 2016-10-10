package no.regnskap.dao;

import no.regnskap.domain.Transaction;

import java.util.List;

public interface TransactionDao {

    void save(Transaction transaction);

    Transaction findById(long id);

    List<Transaction> getAllTransactions();

    List<Transaction> getTransactionsByCategory(long id);

    List<Transaction> getTransactionsByUser(String user);

    List<Transaction> getTransactionsByUserAndCategory();

    List<Transaction> getTransactionsByDate();
}
