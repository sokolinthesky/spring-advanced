insert into user(id,name,email,roles,password)
values(1,'Bob','bob@bob.com','ROLE_REGISTERED_USER','b7bca65c727a4bb12656545278b2510d'); --bobpsw
insert into user(id,name,email,roles,password)
values(2,'Jon','fhjghfjbob@bob.com','ROLE_REGISTERED_USER','0eaa8627e7711d2967db8b61e415bda7'); --jonpsw
insert into user(id,name,email,roles,password)
values(3,'lol','lolbob@bob.com','ROLE_REGISTERED_USER,ROLE_BOOKING_MANAGER','f73fc6939d0ff3ce0e36b28e3644bb6e'); --lol

insert into ticket(id,title,user_id,event_id,booked)
values(1,'Ticket1',1,1,true);
insert into ticket(id,title,user_id,event_id,booked)
values(2,'Ticket2',2,2,true);
insert into ticket(id,title,user_id,event_id,booked)
values(3,'Ticket3',3,3,true);

insert into ticket(id,title,booked)
values(4,'Ticket4',false);
insert into ticket(id,title,booked)
values(5,'Ticket5',false);
insert into ticket(id,title,booked)
values(6,'Ticket6',false);
