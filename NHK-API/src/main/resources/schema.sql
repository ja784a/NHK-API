create database nhk_api;

use nhk_api;

create table areas (
id bigint not null auto_increment primary key, 
area_id bigint not null, 
area_name varchar(50) not null );

create table services (
id bigint not null auto_increment primary key, 
service_id varchar(50) not null, 
service_name varchar(50) not null );