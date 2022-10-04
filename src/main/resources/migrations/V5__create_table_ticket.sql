CREATE TABLE ticket(
id int PRIMARY KEY AUTO_INCREMENT,
passportId int,
cityArrivalId int,
cityDepartureId int,
routeId int,
airplaneId int,
cost int not null,
foreign key (routeId) references route(id),
foreign key (cityArrivalId) references city(id),
foreign key (cityDepartureId) references city(id),
foreign key (airplaneId) references airplane(id),
foreign key (passportId) references passportData(id)
);
