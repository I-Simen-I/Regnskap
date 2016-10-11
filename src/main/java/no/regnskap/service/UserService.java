package no.regnskap.service;

import no.regnskap.domain.User;

import java.util.Date;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(long id);

    User getUserByEmailAddress(String emailAddress);

    List<User> getUserByLastName(String lastName);

    List<User> getUsersByCreatedDate(Date date);

    void resetPassword(String emailAddress, String password, String newPassword);
}
