CREATE TABLE aircompany(
id int PRIMARY KEY AUTO_INCREMENT,
aircompanyName varchar(255) not null
);

CREATE TABLE airplane(
id int PRIMARY KEY AUTO_INCREMENT,
planeName varchar(255) not null,
planeNumber varchar(255) not null UNIQUE,
aircompanyId int,
foreign key (aircompanyId) references aircompany(id)
);

CREATE TABLE route(
id int PRIMARY KEY AUTO_INCREMENT,
arrivalTime DATETIME not null,
departureTime DATETIME not null
);

CREATE TABLE country(
id int PRIMARY KEY AUTO_INCREMENT,
nameCountry varchar(255) not null
);

CREATE TABLE city(
id int PRIMARY KEY AUTO_INCREMENT,
nameCity varchar(255) not null,
countryId int,
foreign key (countryId) references country(id)
);

CREATE TABLE users(
id int PRIMARY KEY AUTO_INCREMENT,
login varchar(255) not null UNIQUE,
password varchar(255) not null,
role varchar(40)
);


CREATE TABLE passportData(
id int PRIMARY KEY AUTO_INCREMENT,
name varchar(255) not null,
surname varchar(255) not null,
number varchar(255) not null UNIQUE,
usersId int,
foreign key (usersId) references users(id)
);


CREATE TABLE employee(
id int PRIMARY KEY AUTO_INCREMENT,
post varchar(255) not null,
salary int(255) not null default (0),
passportId int,
foreign key (passportId) references passportData(id)
);

CREATE TABLE departments(
id int PRIMARY KEY AUTO_INCREMENT,
nameDepartment varchar(255) not null,
aircompanyId int,
employeeId int,
foreign key (employeeId) references employee(id),
foreign key (aircompanyId) references aircompany(id)
);


















