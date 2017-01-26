package no.regnskap.domain.Builders;

import no.regnskap.domain.CategoryType;

public class CategoryTypeBuilder {
    private String categoryType;
    private String name;

    public CategoryTypeBuilder withCategoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }

    public CategoryTypeBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public CategoryType build() {
        return new CategoryType(categoryType, name);
    }
}
