select * from CClients;

insert into cClients(cId,CUSERNAME,cPassword) values (cClients_seq.nextval,'123','123');
insert into cClients(cId,CUSERNAME,cPassword) values (cClients_seq.nextval,'abc','123');
insert into cClients(cId,CUSERNAME,cPassword) values (cClients_seq.nextval,'asdd','123');
insert into cClients(cId,CUSERNAME,cPassword) values (cClients_seq.nextval,'agg','123');
insert into cClients(cId,CUSERNAME,cPassword) values (cClients_seq.nextval,'bbdd','123');
insert into cClients(cId,CUSERNAME,cPassword) values (cClients_seq.nextval,'bbeee','123');
insert into cClients(cId,CUSERNAME,cPassword) values (cClients_seq.nextval,'bddf','123');

create table cCart(cId number(6),dishes varchar2(200));
select * from CCART;
drop table CCart;