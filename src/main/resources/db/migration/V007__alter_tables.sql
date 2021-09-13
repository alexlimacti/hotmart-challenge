alter table if exists sale add constraint purchaser foreign key (purchaser_id) references purchaser;
alter table if exists sale add constraint salesman foreign key (salesman_id) references salesman;
alter table if exists sale_product_list add constraint product foreign key (product_list_id) references product;
alter table if exists sale_product_list add constraint sale foreign key (sale_id) references sale;