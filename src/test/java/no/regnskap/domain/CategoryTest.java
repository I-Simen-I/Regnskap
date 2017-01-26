package no.regnskap.domain;

import org.junit.Test;

import static no.regnskap.domain.builders.DomainBuilder.aCategory;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CategoryTest {

    @Test
    public void isEqualWhenCategoryHaveSameId() throws Exception {
        Category c1 = aCategory().with(1234L).build();

        Category c2 = aCategory().with(1234L).build();

        assertTrue(c1.equals(c2));
    }

    @Test
    public void isNotEqualWhenCategoryHaveSameId() throws Exception {
        Category c1 = aCategory().with(1234L).build();

        Category c2 = aCategory().with(1233L).build();

        assertFalse(c1.equals(c2));
    }

    @Test
    public void isNotEqualWhenCategoryIdIsNull() throws Exception {
        Category c1 = aCategory().with(1234L).build();

        Category c2 = aCategory().build();

        assertFalse(c1.equals(c2));
    }

    @Test
    public void isNotEqualWhenCategoryIsNull() throws Exception {
        Category c1 = aCategory().with(1234L).build();

        assertFalse(c1.equals(null));
    }
}