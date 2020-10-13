drop database Theater;
create database Theater;
use Theater;

create table Staff
(
	staff_id varchar (10) not null primary key ,
    Name varchar(30) not null,
    Age int not null,
    MobilePhone int not null,
    Address nvarchar(100) not null
);
create table seat
 (
	order_id int not null auto_increment,
    seat_number int not null primary key
 );
create table auditorium
(
	order_id int not null auto_increment,
	auditorium_id int not null primary key,
    seat_number
    foreign key 
create table booking
(
	order_id int not null primary key auto_increment,
    staff_id varchar (10) not null,
	foreign key (staff_id) references staff(staff_id),
    seat_number int not null,
    foreign key (seat_number) references seat(seat_number)
);
create table resevered_seat
(
	order_id int not null primary key auto_increment,
    auditorium_id int not null,
    foreign key (auditorium_id ) references seat(auditorium_id)
);
create table Movie
(
	order_id int not null primary key auto_increment,
    movie_name varchar (25) not null,
    duration_min int not null
);
create table Cụm_Rạp
(
	theater_id varchar (10) not null primary key,
    seats_num int not null,
    movie_name varchar (25) not null,
    duration_min int not null,
	foreign key (movie_name) references Movie(movie_name),
    foreign key (duration_min) references Movie (duration_min)
);



create table Employee_Account
(
	foreign key (staff_id) references Staff(staff_id),
	username varchar (20) not null, 
    password varchar (15) not null
);



