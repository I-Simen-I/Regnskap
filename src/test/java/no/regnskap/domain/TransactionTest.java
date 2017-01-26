package no.regnskap.domain;

import org.junit.Test;

import static no.regnskap.domain.Builders.DomainBuilder.aTransaction;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TransactionTest {

    @Test
    public void isEqualWhenTransactionHaveSameId() throws Exception {
        Transaction t1 = aTransaction().with(1234L).build();

        Transaction t2 = aTransaction().with(1234L).build();

        assertTrue(t1.equals(t2));
    }

    @Test
    public void isNotEqualWhenTransactionHaveSameId() throws Exception {
        Transaction t1 = aTransaction().with(1234L).build();

        Transaction t2 = aTransaction().with(1233L).build();

        assertFalse(t1.equals(t2));
    }

    @Test
    public void isNotEqualWhenTransactionIdIsNull() throws Exception {
        Transaction t1 = aTransaction().with(1234L).build();

        Transaction t2 = aTransaction().build();

        assertFalse(t1.equals(t2));
    }

    @Test
    public void isNotEqualWhenTransactionIsNull() throws Exception {
        Transaction t1 = aTransaction().build();

        assertFalse(t1.equals(null));
    }
}