package no.regnskap.domain;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CategoryTypeTest {

    @Test
    public void isEqualWhenCategoryTypeHaveSameId() throws Exception {
        CategoryType c1 = new CategoryType();
        c1.setCategoryType("INCOME");

        CategoryType c2 = new CategoryType();
        c2.setCategoryType("INCOME");

        assertTrue(c1.equals(c2));
    }

    @Test
    public void isNotEqualWhenCategoryTypeHaveSameId() throws Exception {
        CategoryType c1 = new CategoryType();
        c1.setCategoryType("INCOME");

        CategoryType c2 = new CategoryType();
        c2.setCategoryType("SAVINGS");

        assertFalse(c1.equals(c2));
    }

    @Test
    public void isNotEqualWhenCategoryTypeIdIsNull() throws Exception {
        CategoryType c1 = new CategoryType();
        c1.setCategoryType("INCOME");

        CategoryType c2 = new CategoryType();

        assertFalse(c1.equals(c2));
    }

    @Test
    public void isNotEqualWhenCategoryTypeIsNull() throws Exception {
        CategoryType c1 = new CategoryType();
        c1.setCategoryType("INCOME");

        assertFalse(c1.equals(null));
    }

}