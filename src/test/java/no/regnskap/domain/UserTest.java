package no.regnskap.domain;


import org.junit.jupiter.api.Test;

import static no.regnskap.domain.builders.UserBuilder.aUser;
import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @Test
    void isEqualWhenUserHaveSameId() throws Exception {
        User u1 = aUser().with(1234L).build();

        User u2 = aUser().with(1234L).build();

        assertThat(u1).isEqualTo(u2);
    }

    @Test
    void isNotEqualWhenUserHaveSameId() throws Exception {
        User u1 = aUser().with(1234L).build();

        User u2 = aUser().with(1233L).build();

        assertThat(u1).isNotEqualTo(u2);
    }

    @Test
    void isNotEqualWhenUserIdIsNull() throws Exception {
        User u1 = aUser().with(1234L).build();

        User u2 = aUser().build();

        assertThat(u1).isNotEqualTo(u2);
    }

    @Test
    void isNotEqualWhenUserIsNull() throws Exception {
        User u1 = aUser().with(1234L).build();

        assertThat(u1).isNotEqualTo(null);
    }
}