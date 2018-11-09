package no.regnskap.domain.builders;

import no.regnskap.domain.CategoryType;
import no.regnskap.domain.DummyTypeClass;
import no.regnskap.domain.Transaction;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static no.regnskap.domain.builders.CategoryBuilder.aCategory;
import static no.regnskap.domain.builders.TransactionBuilder.aTransaction;
import static no.regnskap.domain.builders.TypeBuilder.aBuilderOfType;
import static no.regnskap.domain.builders.UserBuilder.aUser;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DomainBuilderTest {

    @Test
    void buildAValidTransaction() {
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

        assertThat(transaction.getTransactionId()).isEqualTo(1L);
        assertThat(transaction.getDescription()).isEqualTo("Rema 1000");
        assertThat(transaction.getCategory().getName()).isEqualTo("Mat");
        assertThat(transaction.getCategory().getCategoryType().getCategoryType()).isEqualTo("EXPENSE");
        assertThat(transaction.getUser().getEmailAddress()).isEqualTo("s.soli@email.com");
    }

    @Test()
    void typeBuilderThrowsExceptionWhenTypeClassDoesNotHaveSupportedConstructor() {
        assertThrows(UnsupportedOperationException.class, () -> aBuilderOfType(DummyTypeClass.class).build());
    }
}