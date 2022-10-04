CREATE TABLE routeCity(
id int PRIMARY KEY AUTO_INCREMENT,
routeId int,
cityId int,
foreign key (routeId) references route(id),
foreign key (cityId) references city(id)
);