package no.regnskap.service.impl;

import no.regnskap.dao.TransactionDao;
import no.regnskap.domain.Transaction;
import no.regnskap.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("transactionService")
@Transactional
public class TransactionServiceImpl implements TransactionService {

    private final TransactionDao transactionDao;

    @Autowired
    public TransactionServiceImpl(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    @Override
    public void save(Transaction transaction) {
        transactionDao.save(transaction);
    }

    @Override
    public Transaction findById(long id) {
        return transactionDao.findById(id);
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionDao.getAllTransactions();
    }

    @Override
    public List<Transaction> getTransactionsByCategory(long id) {
        return transactionDao.getTransactionsByCategory(id);
    }

    @Override
    public List<Transaction> getTransactionsByUser(long id) {
        return transactionDao.getTransactionsByUser(id);
    }
}
