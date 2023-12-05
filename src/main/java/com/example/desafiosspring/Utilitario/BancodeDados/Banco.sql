create database aplication;
use aplication;

create table controller(
                           id bigint auto_increment primary key,
                           email varchar (150),
                           senha int (90) not null,
                           telefone int (100) not null
);

select * from controller;