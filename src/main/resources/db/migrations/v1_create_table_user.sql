create table user(
    id varchar(255) primary key auto_increment,
    nome varchar(60) not null,
    senha varchar(60) not null,
    email varchar(60) not null
)