package no.regnskap.service.impl;

import no.regnskap.dao.UserDao;
import no.regnskap.domain.User;
import no.regnskap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    public User getUserByEmailAddress(String emailAddress) {
        return userDao.getUserByEmailAddress(emailAddress);
    }

    @Override
    public List<User> getUserByLastName(String lastName) {
        return userDao.getUserByLastName(lastName);
    }

    @Override
    public List<User> getUsersByCreatedDate(Date date) {
        return userDao.getUsersByCreatedDate(date);
    }
}
