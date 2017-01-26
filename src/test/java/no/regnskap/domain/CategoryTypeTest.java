package no.regnskap.domain;

import org.junit.Test;

import static no.regnskap.domain.Builders.DomainBuilder.aCategoryType;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CategoryTypeTest {

    @Test
    public void isEqualWhenCategoryTypeHaveSameId() throws Exception {
        CategoryType c1 = aCategoryType().withCategoryType("INCOME").build();

        CategoryType c2 = aCategoryType().withCategoryType("INCOME").build();

        assertTrue(c1.equals(c2));
    }

    @Test
    public void isNotEqualWhenCategoryTypeHaveSameId() throws Exception {
        CategoryType c1 = aCategoryType().withCategoryType("INCOME").build();

        CategoryType c2 = aCategoryType().withCategoryType("SAVINGS").build();

        assertFalse(c1.equals(c2));
    }

    @Test
    public void isNotEqualWhenCategoryTypeIdIsNull() throws Exception {
        CategoryType c1 = aCategoryType().withCategoryType("INCOME").build();

        CategoryType c2 = aCategoryType().build();

        assertFalse(c1.equals(c2));
    }

    @Test
    public void isNotEqualWhenCategoryTypeIsNull() throws Exception {
        CategoryType c1 = aCategoryType().withCategoryType("INCOME").build();

        assertFalse(c1.equals(null));
    }

}