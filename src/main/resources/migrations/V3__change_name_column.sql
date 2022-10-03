alter table users drop column role;

alter table users add column roleId int after password;

alter table users add FOREIGN KEY (roleId) REFERENCES roles(id);