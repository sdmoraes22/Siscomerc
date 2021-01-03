/*
*
*	Script responsável pela criação e configuração do sistema para uso em produção;
*
*/

/* 
*	criação do banco de dados do siscomerc
*/
create database SISCOMERC;

/* 
*	Tabelas do sistema
*/
create table TIPO(
	id integer not null auto_increment,
    descricao varchar(45),
    constraint primary key(id)
);

create table USUARIO(
	id integer not null auto_increment,
    fk_tipo integer not null,
    ativo tinyint(1),
    nome varchar(80) not null,
    login varchar(20) not null unique,
    senha varchar(20) not null,
    email varchar(80),
    primary key(id),
    foreign key (fk_tipo) references TIPO(id)    
);


/*
*	Scripts para setup do sistema no primeiro uso
*/

/*Inserts Obrigatórios de tipos de usuário e criação do administrador */
insert into TIPO(descricao) values('ADMINISTRADOR');
insert into TIPO(descricao) values('GERENTE');
insert into TIPO(descricao) values('ESTOQUISTA');
insert into TIPO(descricao) values('CAIXA');

insert into USUARIO(fk_tipo, ativo, nome, login, senha, email) 
values(1, 1, 'administrador', 'siscomercadmin', 'siscomercadmin', 'siscomercadmin@siscomerc.com.br');


