package no.regnskap.domain.builders;


import no.regnskap.domain.User;

import java.util.Date;

public class UserBuilder {

    private long userId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String emailAddress;
    private String password;
    private Date created;


    public UserBuilder with(long userId) {
        this.userId = userId;
        return this;
    }

    public UserBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public UserBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public UserBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder with(Date created) {
        this.created = created;
        return this;
    }

    public User build() {
        return new User(userId, firstName, middleName, lastName, emailAddress, password, created);
    }
}
