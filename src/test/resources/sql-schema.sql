create database if not exists ims;
drop table if exists ims.customers;
create table ims.customers(id int primary key auto_increment, first_name varchar(40), surname varchar(40));
create table if not exists ims.items(id int primary key auto_increment, item_name varchar(100), price decimal(6,2));

create database if not exists ims_test;
drop table if exists ims_test.customers;
create table ims_test.customers(id int primary key auto_increment, first_name varchar(40), surname varchar(40));