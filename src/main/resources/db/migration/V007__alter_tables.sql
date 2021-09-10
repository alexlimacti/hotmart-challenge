alter table if exists sale add constraint FK16io6gqolu1s20s0xl4si2pf8 foreign key (purchaser_id) references purchaser;
alter table if exists sale add constraint FKod3xo8m2oo0uelbi3rl55gkvj foreign key (salesman_id) references salesman;
alter table if exists sale_product_list add constraint FK2joh5ghkjqovof4lrfk7t614 foreign key (product_list_id) references product;
alter table if exists sale_product_list add constraint FK2wo3hotf4hpl17nspw54wl330 foreign key (sale_id) references sale;