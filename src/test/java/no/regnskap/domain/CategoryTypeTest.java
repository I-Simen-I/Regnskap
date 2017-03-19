package no.regnskap.domain;

import org.junit.Test;

import static no.regnskap.domain.builders.TypeBuilder.aBuilderOfType;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CategoryTypeTest {

    @Test
    public void isEqualWhenCategoryTypeHaveSameId() throws Exception {
        CategoryType c1 = aBuilderOfType(CategoryType.class).withTypeId("INCOME").build();

        CategoryType c2 = aBuilderOfType(CategoryType.class).withTypeId("INCOME").build();

        assertTrue(c1.equals(c2));
    }

    @Test
    public void isNotEqualWhenCategoryTypeHaveSameId() throws Exception {
        CategoryType c1 = aBuilderOfType(CategoryType.class).withTypeId("INCOME").build();

        CategoryType c2 = aBuilderOfType(CategoryType.class).withTypeId("SAVINGS").build();

        assertFalse(c1.equals(c2));
    }

    @Test
    public void isNotEqualWhenCategoryTypeIdIsNull() throws Exception {
        CategoryType c1 = aBuilderOfType(CategoryType.class).withTypeId("INCOME").build();

        CategoryType c2 = aBuilderOfType(CategoryType.class).build();

        assertFalse(c1.equals(c2));
    }

    @Test
    public void isNotEqualWhenCategoryTypeIsNull() throws Exception {
        CategoryType c1 = aBuilderOfType(CategoryType.class).withTypeId("INCOME").build();

        assertFalse(c1.equals(null));
    }

}