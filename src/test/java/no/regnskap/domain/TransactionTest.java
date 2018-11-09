package no.regnskap.domain;

import org.junit.jupiter.api.Test;

import static no.regnskap.domain.builders.TransactionBuilder.aTransaction;
import static org.assertj.core.api.Assertions.assertThat;

class TransactionTest {

    @Test
    void isEqualWhenTransactionHaveSameId() throws Exception {
        Transaction t1 = aTransaction().with(1234L).build();

        Transaction t2 = aTransaction().with(1234L).build();

        assertThat(t1).isEqualTo(t2);
    }

    @Test
    void isNotEqualWhenTransactionHaveSameId() throws Exception {
        Transaction t1 = aTransaction().with(1234L).build();

        Transaction t2 = aTransaction().with(1233L).build();

        assertThat(t1).isNotEqualTo(t2);
    }

    @Test
    void isNotEqualWhenTransactionIdIsNull() throws Exception {
        Transaction t1 = aTransaction().with(1234L).build();

        Transaction t2 = aTransaction().build();

        assertThat(t1).isNotEqualTo(t2);
    }

    @Test
    void isNotEqualWhenTransactionIsNull() throws Exception {
        Transaction t1 = aTransaction().build();

        assertThat(t1).isNotEqualTo(null);
    }
}