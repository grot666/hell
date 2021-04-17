CREATE TABLE   user
(
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(15) NOT NULL,
    email VARCHAR(50) NOT NULL ,
    password VARCHAR(50) NOT NULL

) AUTO_INCREMENT = 100;


# INSERT INTO tea.user (username, email, password) VALUES (#{username},#{email},#{password});

CREATE TABLE relation(
                         host_id int,
                         aim_id int
);


# select distinct first.aim_id  from relation First ,relation SECOND WHERE First.aim_id = SECOND.host_id AND First.host_id = SECOND.aim_id AND First.host_id=113;
# get friends







