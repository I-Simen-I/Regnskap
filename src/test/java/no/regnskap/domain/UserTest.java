package no.regnskap.domain;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserTest {

    @Test
    public void isEqualWhenUserHaveSameId() throws Exception {
        User u1 = new User();
        u1.setUserId(1234L);

        User u2 = new User();
        u2.setUserId(1234L);

        assertTrue(u1.equals(u2));
    }

    @Test
    public void isNotEqualWhenUserHaveSameId() throws Exception {
        User u1 = new User();
        u1.setUserId(1234L);

        User u2 = new User();
        u2.setUserId(1233L);

        assertFalse(u1.equals(u2));
    }

    @Test
    public void isNotEqualWhenUserIdIsNull() throws Exception {
        User u1 = new User();
        u1.setUserId(1234L);

        User u2 = new User();

        assertFalse(u1.equals(u2));
    }

    @Test
    public void isNotEqualWhenUserIsNull() throws Exception {
        User u1 = new User();
        u1.setUserId(1234L);

        assertFalse(u1.equals(null));
    }

}