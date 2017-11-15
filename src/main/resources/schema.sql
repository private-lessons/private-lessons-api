DROP TABLE IF EXISTS USERS;

CREATE TABLE users (
  id int NOT NULL AUTO_INCREMENT,
  user_name varchar NOT NULL,
  email varchar NOT NULL,
  PRIMARY KEY (id)
);