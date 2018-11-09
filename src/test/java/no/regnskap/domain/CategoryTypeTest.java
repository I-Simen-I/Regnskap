package no.regnskap.domain;

import org.junit.jupiter.api.Test;

import static no.regnskap.domain.builders.TypeBuilder.aBuilderOfType;
import static org.assertj.core.api.Assertions.assertThat;

class CategoryTypeTest {

    @Test
    void isEqualWhenCategoryTypeHaveSameId() throws Exception {
        CategoryType c1 = aBuilderOfType(CategoryType.class).withTypeId("INCOME").build();

        CategoryType c2 = aBuilderOfType(CategoryType.class).withTypeId("INCOME").build();

        assertThat(c1).isEqualTo(c2);
    }

    @Test
    void isNotEqualWhenCategoryTypeHaveSameId() throws Exception {
        CategoryType c1 = aBuilderOfType(CategoryType.class).withTypeId("INCOME").build();

        CategoryType c2 = aBuilderOfType(CategoryType.class).withTypeId("SAVINGS").build();

        assertThat(c1).isNotEqualTo(c2);
    }

    @Test
    void isNotEqualWhenCategoryTypeIdIsNull() throws Exception {
        CategoryType c1 = aBuilderOfType(CategoryType.class).withTypeId("INCOME").build();

        CategoryType c2 = aBuilderOfType(CategoryType.class).build();

        assertThat(c1).isNotEqualTo(c2);
    }

    @Test
    void isNotEqualWhenCategoryTypeIsNull() throws Exception {
        CategoryType c1 = aBuilderOfType(CategoryType.class).withTypeId("INCOME").build();

        assertThat(c1).isNotEqualTo(null);
    }

}