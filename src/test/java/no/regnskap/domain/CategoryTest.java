package no.regnskap.domain;


import org.junit.jupiter.api.Test;

import static no.regnskap.domain.builders.CategoryBuilder.aCategory;
import static org.assertj.core.api.Assertions.assertThat;

class CategoryTest {

    @Test
    void isEqualWhenCategoryHaveSameId() throws Exception {
        Category c1 = aCategory().with(1234L).build();

        Category c2 = aCategory().with(1234L).build();

        assertThat(c1).isEqualTo(c2);
    }

    @Test
    void isNotEqualWhenCategoryHaveSameId() throws Exception {
        Category c1 = aCategory().with(1234L).build();

        Category c2 = aCategory().with(1233L).build();

        assertThat(c1).isNotEqualTo(c2);
    }

    @Test
    void isNotEqualWhenCategoryIdIsNull() throws Exception {
        Category c1 = aCategory().with(1234L).build();

        Category c2 = aCategory().build();

        assertThat(c1).isNotEqualTo(c2);
    }

    @Test
    void isNotEqualWhenCategoryIsNull() throws Exception {
        Category c1 = aCategory().with(1234L).build();

        assertThat(c1).isNotEqualTo(null);
    }
}