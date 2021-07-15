CREATE DATABASE annualleavemanagement;
USE annualleavemanagement;

insert into user(userId,email,password,starting_day,username,role_roleID) values
(1,"levinaperzhilla@gmail.com","levina2021","2020-10-25","levina",1),
(2,"razienauruci@gmail.com","raziena2021","2020-7-14","raziena",2),
(3,"denadarama@gmail.com","denada2021","2020-7-14","denada",3),
(4,"reiballa@gmail.com","rei2021","2021-4-14","rei",3);

insert into role (roleID,roleName) values
(1,"admin"),
(2,"supervisor"),
(3,"user");

insert into application(number,endDate,startDate,status,type,userID) values
(2,"2021-07-22","2021-07-21",1,3,4),
(3,"2021-08-02","2021-07-01",1,1,4),
(4,"2021-08-12","2021-08-10",1,2,3);