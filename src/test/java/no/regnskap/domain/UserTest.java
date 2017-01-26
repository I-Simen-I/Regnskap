package no.regnskap.domain;

import no.regnskap.domain.builders.DomainBuilder;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserTest {

    @Test
    public void isEqualWhenUserHaveSameId() throws Exception {
        User u1 = DomainBuilder.aUser().with(1234L).build();

        User u2 = DomainBuilder.aUser().with(1234L).build();

        assertTrue(u1.equals(u2));
    }

    @Test
    public void isNotEqualWhenUserHaveSameId() throws Exception {
        User u1 = DomainBuilder.aUser().with(1234L).build();

        User u2 = DomainBuilder.aUser().with(1233L).build();

        assertFalse(u1.equals(u2));
    }

    @Test
    public void isNotEqualWhenUserIdIsNull() throws Exception {
        User u1 = DomainBuilder.aUser().with(1234L).build();

        User u2 = DomainBuilder.aUser().build();

        assertFalse(u1.equals(u2));
    }

    @Test
    public void isNotEqualWhenUserIsNull() throws Exception {
        User u1 = DomainBuilder.aUser().with(1234L).build();

        assertFalse(u1.equals(null));
    }

}