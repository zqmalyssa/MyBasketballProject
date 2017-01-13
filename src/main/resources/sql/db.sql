create table user(
id INTEGER auto_increment primary key ,    
username varchar(30) not null,
password varchar(30) not null, 
nickname varchar(30) not null, 
birthday date not null,
email varchar(30) not null, 
telphone varchar(20) not null, 
team_position varchar(10) not null, 
height varchar(20), 
weight varchar(20), 
ranking varchar(20) not null,
icon_url varchar(60)
);


create table matchs(
id INTEGER auto_increment primary key,
match_type varchar(10) not null,
match_date datetime not null,
match_location varchar(30) not null,
isBooked char(2) not null
);
create table booking_match(
id INTEGER auto_increment primary key,
user_id int not null,
match_id int not null
);