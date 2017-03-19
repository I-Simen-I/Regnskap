package no.regnskap.domain.builders;

import no.regnskap.domain.CategoryType;
import no.regnskap.domain.DummyTypeClass;
import no.regnskap.domain.Transaction;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Date;

import static no.regnskap.domain.builders.CategoryBuilder.aCategory;
import static no.regnskap.domain.builders.TransactionBuilder.aTransaction;
import static no.regnskap.domain.builders.TypeBuilder.aBuilderOfType;
import static no.regnskap.domain.builders.UserBuilder.aUser;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DomainBuilderTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

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
                        .with(aBuilderOfType(CategoryType.class)
                                .withName("Utgift")
                                .withTypeId("EXPENSE")
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

    @Test
    public void typeBuilderThrowsExceptionWhenTypeClassDoesNotHaveSupportedConstructor() {
        expectedException.expect(UnsupportedOperationException.class);
        expectedException.expectMessage("The typeclass DummyTypeClass needs a constructor with parameter typeId and name");

        aBuilderOfType(DummyTypeClass.class).build();
    }
}