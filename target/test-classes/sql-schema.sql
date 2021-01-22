drop database if exists ims_test;
create database if not exists ims_test;
create table ims_test.customers(id int primary key auto_increment, first_name varchar(40), surname varchar(40));
create table if not exists ims_test.items(id int primary key auto_increment, item_name varchar(100), price decimal(6,2));
create table if not exists ims_test.orders(id int primary key auto_increment, item_id int not null, shippingAddress varchar(100), customer_id int not null, foreign key (customer_id) references customers (id));
create table if not exists ims_test.orderline(id int primary key auto_increment, item_id int not null, customer_id int not null, order_id int not null, foreign key (item_id) references items (id), foreign key (order_id) references orders (id));
