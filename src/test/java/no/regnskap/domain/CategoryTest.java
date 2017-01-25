package no.regnskap.domain;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CategoryTest {

    @Test
    public void isEqualWhenCategoryHaveSameId() throws Exception {
        Category c1 = new Category();
        c1.setCategoryId(1234L);

        Category c2 = new Category();
        c2.setCategoryId(1234L);

        assertTrue(c1.equals(c2));
    }

    @Test
    public void isNotEqualWhenCategoryHaveSameId() throws Exception {
        Category c1 = new Category();
        c1.setCategoryId(1234L);

        Category c2 = new Category();
        c2.setCategoryId(1233L);

        assertFalse(c1.equals(c2));
    }

    @Test
    public void isNotEqualWhenCategoryIdIsNull() throws Exception {
        Category c1 = new Category();
        c1.setCategoryId(1234L);

        Category c2 = new Category();

        assertFalse(c1.equals(c2));
    }

    @Test
    public void isNotEqualWhenCategoryIsNull() throws Exception {
        Category c1 = new Category();
        c1.setCategoryId(1234L);

        assertFalse(c1.equals(null));
    }
}