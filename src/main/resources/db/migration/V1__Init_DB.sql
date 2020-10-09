CREATE table group(
id int PRIMARY KEY,
name varchar(255)
);

CREATE table student(
id int PRIMARY KEY,
name varchar(255),
phone varchar(255),
groupid int REFERENCES group(id)
);