create database cadastro;

use cadastro;

create table funcionario (

id int primary key auto_increment,
nome varchar(50),
cpf varchar(50),
rg varchar(50),
dataNascimento varchar(50),
endereco varchar(50),
bairro varchar(50),
cidade varchar(50),
estado varchar(50),
cep varchar(50),
telefone varchar(50),
email varchar(50),
dataAdmissao varchar(50),
cargo varchar(50),
salario double,
comentario varchar(150)

);

insert into funcionario (nome, cpf, rg, dataNascimento, endereco, bairro, cidade, estado, cep, telefone, email, dataAdmissao, cargo, salario, comentario) 
values ('Osmair Zamana Junior', '380.114.018-07', '46.301.024-3', '15/03/1990', 'Rua Monteiro Lobato, 39', 'Jardim Cristino', 'Jandira', 'SP','06606-170', '4619-5373', 'ozamana@inmetrics.com.br', '10/08/2015', 
'Assistente de Atomação', 5000.00, 'Teste');

insert into funcionario (nome, cpf, rg, dataNascimento, endereco, bairro, cidade, estado, cep, telefone, email, dataAdmissao, cargo, salario, comentario) 
values ('Ricardinho delator', '111.111.111-01', '11.111.111-1', '11/11/1111', 'Rua x, xx', 'Jardim xxxx', 'xxxxx', 'xx','11111-111', '1111-1111', 'ricardinho_delator@inmetrics.com.br', '11/11/1111', 
'Delator da Inmetrics', 5000.00, 'Delação');