CREATE TABLE   user
(
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(15) NOT NULL,
    email VARCHAR(50) NOT NULL ,
    password VARCHAR(50) NOT NULL

) AUTO_INCREMENT = 100;

INSERT INTO tea.user (username, email, password) VALUES (#{username},#{email},#{password}



