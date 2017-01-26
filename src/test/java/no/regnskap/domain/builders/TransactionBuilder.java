package no.regnskap.domain.builders;

import no.regnskap.domain.Transaction;

import java.util.Date;

public class TransactionBuilder {

    private long transactionId;
    private CategoryBuilder category;
    private String description;
    private double sum;
    private Date created;
    private UserBuilder user;

    public TransactionBuilder with(long transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public TransactionBuilder with(CategoryBuilder category) {
        this.category = category;
        return this;
    }

    public TransactionBuilder with(String description) {
        this.description = description;
        return this;
    }

    public TransactionBuilder with(double sum) {
        this.sum = sum;
        return this;
    }

    public TransactionBuilder with(Date created) {
        this.created = created;
        return this;
    }

    public TransactionBuilder with(UserBuilder user) {
        this.user = user;
        return this;
    }

    public Transaction build() {
        return new Transaction(
                transactionId,
                category != null ? category.build() : null,
                description,
                sum,
                created,
                user != null ? user.build() : null
        );
    }
}
