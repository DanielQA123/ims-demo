insert into ims.customers(first_name, surname) values('chris', 'perrins');
insert into ims.customers(first_name, surname) values('rhys', 'thompson');
insert into ims.customers(first_name, surname) values('nic', 'johnson');
insert into ims.customers(first_name, surname) values('jordon', 'harrison');

insert into ims.items(item_name, price) values('Toaster','24.00');
insert into ims.items(item_name, price) values('Kettle','27.00');
insert into ims.items(item_name, price) values('Laptop','444.00');
insert into ims.items(item_name, price) values('iPad','250.00');

insert into ims.orders(shippingAddress, item_id, customer_id) values('Help','1','1');
insert into ims.orders(shippingAddress, item_id, customer_id) values('Yo','2','2');
insert into ims.orders(shippingAddress, item_id, customer_id) values('Man','3','3');
