package no.regnskap.dao;

import no.regnskap.domain.User;

import java.util.Date;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUserById(long id);

    User getUserByEmailAddress(String emailAddress);

    List<User> getUserByLastName(String lastName);

    List<User> getUsersByCreatedDate(Date date);
}
