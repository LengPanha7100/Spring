create table product(
    id serial primary key ,
    proName varchar(20) not null,
    qty float
);
insert into product (proName, qty)
values ('beer',100);

SELECT * FROM product where id =1;

SELECT * FROM product;

UPDATE product set proName='koko',qty = 200 where id =1;
