CREATE TABLE user
(
    id       INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(15)  NOT NULL,
    email    VARCHAR(50)  NOT NULL,
    password VARCHAR(50)  NOT NULL

) AUTO_INCREMENT = 100;


# INSERT INTO tea.user (username, email, password) VALUES (#{username},#{email},#{password});

CREATE TABLE relation
(
    host_id int,
    aim_id  int
);

CREATE TABLE posts
(
    aid     int,
    content VARCHAR(255)
);



# select distinct first.aim_id  from relation First ,relation SECOND WHERE First.aim_id = SECOND.host_id AND First.host_id = SECOND.aim_id AND First.host_id=113;
# get friends
select distinct first.aim_id
from relation First,
     relation SECOND
WHERE First.aim_id = SECOND.host_id
  AND First.host_id = SECOND.aim_id
  AND First.host_id = 113;


select distinct usr.username, usr.password, usr.email
from (
         select a.aim_id
         from (
               (select distinct first.aim_id
                from relation as First,
                     relation as SECOND
                WHERE First.aim_id = SECOND.host_id
                  AND First.host_id = SECOND.aim_id
                  AND First.host_id = 110) a,
               (select distinct First1.aim_id
                from relation as First1,
                     relation as SECOND1
                WHERE First1.aim_id = SECOND1.host_id
                  AND First1.host_id = SECOND1.aim_id
                  AND First1.host_id = 113) b)
         where a.aim_id = b.aim_id) as rel,
     tea.user as usr
where usr.id = rel.aim_id;



select distinct user.username, user.password, user.email
from tea.relation First,
     tea.relation SECOND,
     tea.user
WHERE First.aim_id = SECOND.host_id
  AND First.host_id = SECOND.aim_id
  AND First.host_id = 109
  AND First.aim_id = user.id;


(select distinct first.aim_id
 from relation First,
      relation SECOND
 WHERE First.aim_id = SECOND.host_id
   AND First.host_id = SECOND.aim_id
   AND First.host_id = 109);

select a.aim_id
from (
      (select distinct first.aim_id
       from relation as First,
            relation as SECOND
       WHERE First.aim_id = SECOND.host_id
         AND First.host_id = SECOND.aim_id
         AND First.host_id = 109) a,
      (select distinct First1.aim_id
       from relation as First1,
            relation as SECOND1
       WHERE First1.aim_id = SECOND1.host_id
         AND First1.host_id = SECOND1.aim_id
         AND First1.host_id = 113) b)
where a.aim_id = b.aim_id);








