insert into user(id,name,email,roles,password)
values(1,'Bob','bob@bob.com','REGISTERED_USER','bobpsw');
insert into user(id,name,email,roles,password)
values(2,'Jon','fhjghfjbob@bob.com','REGISTERED_USER','jonpsw');
insert into user(id,name,email,roles,password)
values(3,'lol','lolbob@bob.com','REGISTERED_USER,BOOKING_MANAGER','lol');

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
