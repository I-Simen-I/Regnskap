package no.regnskap.domain.Buillders;


public class DomainBuilder {

    private DomainBuilder() {

    }

    public static CategoryTypeBuilder aCategoryType() {
        return new CategoryTypeBuilder();
    }
}
