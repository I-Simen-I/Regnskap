package no.regnskap.domain;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TransactionTest {

    @Test
    public void isEqualWhenTransactionHaveSameId() throws Exception {
        Transaction t1 = new Transaction();
        t1.setTransactionId(1234L);

        Transaction t2 = new Transaction();
        t2.setTransactionId(1234L);

        assertTrue(t1.equals(t2));
    }

    @Test
    public void isNotEqualWhenTransactionHaveSameId() throws Exception {
        Transaction t1 = new Transaction();
        t1.setTransactionId(1234L);

        Transaction t2 = new Transaction();
        t2.setTransactionId(1233L);

        assertFalse(t1.equals(t2));
    }

    @Test
    public void isNotEqualWhenTransactionIdIsNull() throws Exception {
        Transaction t1 = new Transaction();
        t1.setTransactionId(1234L);

        Transaction t2 = new Transaction();

        assertFalse(t1.equals(t2));
    }

    @Test
    public void isNotEqualWhenTransactionIsNull() throws Exception {
        Transaction t1 = new Transaction();
        t1.setTransactionId(1234L);

        assertFalse(t1.equals(null));
    }
}