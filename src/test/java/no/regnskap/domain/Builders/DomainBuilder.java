package no.regnskap.domain.Builders;


public class DomainBuilder {

    private DomainBuilder() {

    }

    public static CategoryTypeBuilder aCategoryType() {
        return new CategoryTypeBuilder();
    }

    public static CategoryBuilder aCategory() {
        return new CategoryBuilder();
    }

    public static UserBuilder aUser() {
        return new UserBuilder();
    }

    public static TransactionBuilder aTransaction() {
        return new TransactionBuilder();
    }
}
