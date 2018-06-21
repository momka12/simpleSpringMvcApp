DROP TABLE IF EXISTS users;

CREATE TABLE users
(
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(15) NOT NULL,
  lastName VARCHAR(25),
  birthday DATE,
  city VARCHAR(30)
);

INSERT INTO users VALUES(NULL, 'name1', 'lastName1', '2015-08-12', 'Dnipro');
INSERT INTO users VALUES(NULL, 'name2', 'lastName2', '1955-01-13', 'Lviv');