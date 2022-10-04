CREATE TABLE employeeDepartments(
id int PRIMARY KEY AUTO_INCREMENT,
employeeId int,
departmentsId int,
foreign key (employeeId) references employee(id),
foreign key (departmentsId) references departments(id)
);