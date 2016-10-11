##### DROP #####
DROP TABLE IF EXISTS TRANSACTION;
DROP TABLE IF EXISTS CATEGORY;
DROP TABLE IF EXISTS CATEGORY_TYPE;
DROP TABLE IF EXISTS USER;

##### CREATE #####
#KODEVERK
CREATE TABLE CATEGORY_TYPE (
  CATEGORY_TYPE VARCHAR(55)  NOT NULL,
  NAME          VARCHAR(255) NOT NULL,
  PRIMARY KEY (CATEGORY_TYPE)
) ENGINE = INNODB DEFAULT CHARSET = UTF8;

#DOMAIN
CREATE TABLE USER (
  USER_ID       INT(11)     NOT NULL AUTO_INCREMENT,
  FIRST_NAME    VARCHAR(30) NOT NULL,
  MIDDLE_NAME   VARCHAR(30),
  LAST_NAME     VARCHAR(30) NOT NULL,
  EMAIL_ADDRESS VARCHAR(80) NOT NULL UNIQUE,
  PASSWORD      CHAR(32)    NOT NULL,
  CREATED       DATETIME    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (USER_ID)
)
  ENGINE = INNODB
  DEFAULT CHARSET = UTF8;

CREATE UNIQUE INDEX USER_EMAIL_ADDRESS_uindex
  ON regnskap.USER (EMAIL_ADDRESS);

CREATE TABLE CATEGORY (
  CATEGORY_ID   INT(11)     NOT NULL AUTO_INCREMENT,
  USER_ID       INT(11)     NOT NULL,
  NAME          VARCHAR(55) NOT NULL UNIQUE,
  CATEGORY_TYPE VARCHAR(55) NOT NULL,
  CREATED       DATETIME    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (CATEGORY_ID),
  FOREIGN KEY (CATEGORY_TYPE) REFERENCES CATEGORY_TYPE (CATEGORY_TYPE),
  FOREIGN KEY (USER_ID) REFERENCES USER (USER_ID)
) ENGINE = INNODB DEFAULT CHARSET = UTF8;

CREATE TABLE TRANSACTION (
  TRANSACTION_ID INT(11)        NOT NULL AUTO_INCREMENT,
  CATEGORY_ID    INT(11)        NOT NULL,
  USER_ID        INT(11)        NOT NULL,
  DESCRIPTION    VARCHAR(1000),
  SUM            DECIMAL(10, 2) NOT NULL,
  CREATED        DATETIME       NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (TRANSACTION_ID),
  FOREIGN KEY (CATEGORY_ID) REFERENCES CATEGORY (CATEGORY_ID),
  FOREIGN KEY (USER_ID) REFERENCES USER (USER_ID)
) ENGINE = INNODB DEFAULT CHARSET = UTF8;

#POPULERING AV BASE
INSERT INTO CATEGORY_TYPE (CATEGORY_TYPE, NAME) VALUES ("EXPENSE", "Utgift");
INSERT INTO CATEGORY_TYPE (CATEGORY_TYPE, NAME) VALUES ("SAVINGS", "Sparing");
INSERT INTO CATEGORY_TYPE (CATEGORY_TYPE, NAME) VALUES ("INCOME", "Inntekt");

INSERT INTO USER (FIRST_NAME, LAST_NAME, EMAIL_ADDRESS, PASSWORD, CREATED)
VALUES ("Simen", "Soli", "s.soli@email.com", "5f4dcc3b5aa765d61d8327deb882cf99", "2016-01-01");
INSERT INTO USER (FIRST_NAME, LAST_NAME, EMAIL_ADDRESS, PASSWORD, CREATED)
VALUES ("Snorre", "Soli", "snorre.soli@email.com", "5f4dcc3b5aa765d61d8327deb882cf99", "2016-08-10");

INSERT INTO CATEGORY (NAME, USER_ID, CATEGORY_TYPE, CREATED) VALUES ("Mat", 1, "EXPENSE", "2016-08-01");
INSERT INTO CATEGORY (NAME, USER_ID, CATEGORY_TYPE, CREATED) VALUES ("Felleskostnader", 1, "EXPENSE", "2016-08-01");
INSERT INTO CATEGORY (NAME, USER_ID, CATEGORY_TYPE, CREATED) VALUES ("Huslån", 1, "EXPENSE", "2016-08-01");
INSERT INTO CATEGORY (NAME, USER_ID, CATEGORY_TYPE, CREATED) VALUES ("Lånekassen", 1, "EXPENSE", "2016-08-01");
INSERT INTO CATEGORY (NAME, USER_ID, CATEGORY_TYPE, CREATED) VALUES ("Ferie", 1, "EXPENSE", "2016-08-01");
INSERT INTO CATEGORY (NAME, USER_ID, CATEGORY_TYPE, CREATED) VALUES ("BSU", 1, "SAVINGS", "2016-08-01");
INSERT INTO CATEGORY (NAME, USER_ID, CATEGORY_TYPE, CREATED) VALUES ("Inntekt", 1, "INCOME", "2016-08-01");

INSERT INTO TRANSACTION (CATEGORY_ID, DESCRIPTION, SUM, USER_ID, CREATED)
VALUES (1, "Rema 1000", 147.23, 1, "2016-10-01");
INSERT INTO TRANSACTION (CATEGORY_ID, DESCRIPTION, SUM, USER_ID, CREATED) VALUES (1, "Spar", 167.63, 1, "2016-10-01");
INSERT INTO TRANSACTION (CATEGORY_ID, DESCRIPTION, SUM, USER_ID, CREATED) VALUES (1, "Meny", 544, 1, "2016-10-01");
INSERT INTO TRANSACTION (CATEGORY_ID, DESCRIPTION, SUM, USER_ID, CREATED) VALUES (1, "Spar", 105, 1, "2016-10-01");
INSERT INTO TRANSACTION (CATEGORY_ID, SUM, USER_ID, CREATED) VALUES (2, 3000, 1, "2016-10-02");
INSERT INTO TRANSACTION (CATEGORY_ID, SUM, USER_ID, CREATED) VALUES (3, 5000, 1, "2016-10-02");
