create database if not exists ims;
create table if not exists ims.customers(id int primary key auto_increment, first_name varchar(40), surname varchar(40));
create table if not exists ims.items(id int primary key auto_increment, item_name varchar(100), itemQuantity varchar(30), price decimal(6,2));
create table if not exists ims.orders(id int primary key auto_increment, shippingAddress varchar(100), customer_id int not null, foreign key (customer_id) references customers (id));
