package no.regnskap.domain.builders;

import no.regnskap.domain.Category;
import no.regnskap.domain.CategoryType;

import java.util.Date;

public class CategoryBuilder {
    private long categoryId;
    private String name;
    private TypeBuilder<CategoryType> categoryType;
    private Date created;
    private UserBuilder user;

    private CategoryBuilder() {
    }

    public static CategoryBuilder aCategory() {
        return new CategoryBuilder();
    }

    public CategoryBuilder with(long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public CategoryBuilder with(String name) {
        this.name = name;
        return this;
    }

    public CategoryBuilder with(Date created) {
        this.created = created;
        return this;
    }

    public CategoryBuilder with(TypeBuilder<CategoryType> categoryType) {
        this.categoryType = categoryType;
        return this;
    }

    public CategoryBuilder with(UserBuilder user) {
        this.user = user;
        return this;
    }

    public Category build() {
        return new Category(
                categoryId,
                name,
                categoryType != null ? categoryType.build() : null,
                created,
                user != null ? user.build() : null
        );
    }
}
