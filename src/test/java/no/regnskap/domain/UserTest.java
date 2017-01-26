package no.regnskap.domain;

import org.junit.Test;

import static no.regnskap.domain.builders.DomainBuilder.aUser;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserTest {

    @Test
    public void isEqualWhenUserHaveSameId() throws Exception {
        User u1 = aUser().with(1234L).build();

        User u2 = aUser().with(1234L).build();

        assertTrue(u1.equals(u2));
    }

    @Test
    public void isNotEqualWhenUserHaveSameId() throws Exception {
        User u1 = aUser().with(1234L).build();

        User u2 = aUser().with(1233L).build();

        assertFalse(u1.equals(u2));
    }

    @Test
    public void isNotEqualWhenUserIdIsNull() throws Exception {
        User u1 = aUser().with(1234L).build();

        User u2 = aUser().build();

        assertFalse(u1.equals(u2));
    }

    @Test
    public void isNotEqualWhenUserIsNull() throws Exception {
        User u1 = aUser().with(1234L).build();

        assertFalse(u1.equals(null));
    }

}