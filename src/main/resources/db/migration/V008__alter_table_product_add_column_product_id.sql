alter table if exists sale add column product_id int8;
alter table if exists sale add constraint product foreign key (product_id) references product;