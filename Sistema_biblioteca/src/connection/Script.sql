CREATE DATABASE db_biblioteca;

USE db_biblioteca;

CREATE TABLE tb_autores(
id_autor int not null auto_increment primary key,
nome_autor varchar (50) not null,
pais_autor varchar (40) not null,
livros_autor varchar (50) not null,
data_criacao date
);

CREATE TABLE tb_livros(
id_livro int not null auto_increment primary key,
isbn_livro int,
nome_livro varchar (60) not null,
autor_livro varchar (50) not null,
idioma_livro varchar (50) not null,
data_lancamento_livro date,
data_criacao_livro date 
);

CREATE TABLE tb_idiomas(
id_idioma int auto_increment primary key not null,
abreviacao_idioma varchar (50) not null
);

CREATE TABLE tb_idioma_livros(
id_livro int,
id_idioma int,
nome_livro varchar (60) not null,
abreviacao_idioma varchar(30) not null,
foreign key (id_idioma) references tb_idiomas (id_idioma)
);

CREATE TABLE tb_autor_livro(
id_autor int,
id_livro int,
nome_autor varchar (50) not null,
nome_livro varchar (60) not null,
foreign key (id_autor) references tb_autores (id_autor)
);
