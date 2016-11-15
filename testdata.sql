CREATE DATABASE test;

USE test;

CREATE TABLE user (
  id INT(8) NOT NULL AUTO_INCREMENT,
  name VARCHAR(25) NOT NULL,
  age INT(11) NOT NULL,
  isAdmin BIT(1) NOT NULL,
  createdDate TIMESTAMP NOT NULL,
  PRIMARY KEY (id));

INSERT INTO user (name, age, isAdmin) VALUES ('Hermes', '12', TRUE);
INSERT INTO user (name, age, isAdmin) VALUES ('Andy', '33', TRUE);
INSERT INTO user (name, age, isAdmin) VALUES ('Dima', '41', FALSE);
INSERT INTO user (name, age, isAdmin) VALUES ('Victor', '15', FALSE);
INSERT INTO user (name, age, isAdmin) VALUES ('Rima', '18', FALSE);
INSERT INTO user (name, age, isAdmin) VALUES ('Ilya', '28', FALSE);
INSERT INTO user (name, age, isAdmin) VALUES ('Andy', '16', FALSE);
INSERT INTO user (name, age, isAdmin) VALUES ('Amy', '19', FALSE);
INSERT INTO user (name, age, isAdmin) VALUES ('Olga', '22', FALSE);
INSERT INTO user (name, age, isAdmin) VALUES ('Leela', '20', TRUE);
INSERT INTO user (name, age, isAdmin) VALUES ('Oleg', '24', TRUE);
INSERT INTO user (name, age, isAdmin) VALUES ('Tina', '20', FALSE);
INSERT INTO user (name, age, isAdmin) VALUES ('Roma', '21', FALSE);
INSERT INTO user (name, age, isAdmin) VALUES ('Fry', '31', FALSE);
INSERT INTO user (name, age, isAdmin) VALUES ('Leela', '44', FALSE);
