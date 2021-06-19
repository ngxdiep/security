CREATE DATABASE IF NOT EXISTS travel_list;
USE travel_list;
CREATE TABLE USER(
	id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(20),
    email VARCHAR(50),
    password VARCHAR(120)
);

CREATE TABLE PLACES(
	id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20),
    visited INT(10)
);

CREATE TABLE ROLES(
	id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20)
);

CREATE TABLE USER_ROLES(
	user_id INT(11) NOT NULL,
    role_id INT(11) NOT NULL,
    primary key (user_id, role_id),
    foreign key (user_id) references user(id),
	foreign key (role_id) references roles(id)
);

INSERT INTO PLACES(name, visited) VALUES ('Tokyo', 0);
INSERT INTO PLACES(name, visited) VALUES ('Sai Gon', 1);
INSERT INTO PLACES(name, visited) VALUES ('Ha Noi', 0);

INSERT INTO ROLES(name) VALUES ('ROLE_USER');
INSERT INTO ROLES(name) VALUES ('ROLE_MODERATOR');
INSERT INTO ROLES(name) VALUES ('ROLE_ADMIN');