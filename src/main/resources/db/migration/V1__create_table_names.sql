
create table NAMES (
    id bigint not null auto_increment,
    name varchar(50) not null,
    primary key(id)
);

insert into NAMES values(1,'Programacao');
insert into NAMES values(2, 'Front-end');