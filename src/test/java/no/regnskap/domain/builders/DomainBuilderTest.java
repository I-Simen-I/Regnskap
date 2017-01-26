package no.regnskap.domain.builders;

import no.regnskap.domain.Transaction;
import org.junit.Test;

import java.util.Date;

import static no.regnskap.domain.builders.DomainBuilder.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DomainBuilderTest {

    @Test
    public void buildAValidTransaction() {
        Transaction transaction = aTransaction()
                .with(1L)
                .with(new Date())
                .with(200.5)
                .with("Rema 1000")
                .with(aCategory()
                        .with(1L)
                        .with("Mat")
                        .with(aCategoryType()
                                .withName("Utgift")
                                .withCategoryType("EXPENSE")
                        )
                        .with(new Date())
                )
                .with(aUser()
                        .with(1L)
                        .withFirstName("Simen")
                        .withLastName("Soli")
                        .withEmailAddress("s.soli@email.com")
                        .with(new Date())
                        .withPassword("password")
                )
                .build();

        assertThat(transaction.getTransactionId(), is(1L));
        assertThat(transaction.getDescription(), is("Rema 1000"));
        assertThat(transaction.getCategory().getName(), is("Mat"));
        assertThat(transaction.getCategory().getCategoryType().getCategoryType(), is("EXPENSE"));
        assertThat(transaction.getUser().getEmailAddress(), is("s.soli@email.com"));
    }

}