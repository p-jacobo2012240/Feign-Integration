create table adress(
    adress_id serial primary key not null,
    country varchar(20),
    city varchar(20)
)

create table client_type(
    client_type_id serial primary key not null,
    client_type_name varchar(10)
)

create table client(
    client_id serial primary key not null,
    client_name varchar(100),
    client_lastname varchar(100),
    email varchar(100),
    age integer,
    status boolean,
    adress_id integer,
    client_type_id integer
)


alter table  client
add constraint  fk_address
foreign key (adress_id)
references adress(adress_id)

alter table  client
add constraint  fk_client_type
foreign key (client_type_id)
references client_type(client_type_id)