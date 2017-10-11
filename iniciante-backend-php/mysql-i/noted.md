# MySQL I

[Link para o curso](https://cursos.alura.com.br/course/introducao-a-banco-de-dados-e-sql)

Curso iniciado em: 07/10/2017

Legenda: :white_check_mark: Concluídos | :arrow_right: Em andamento <br/><br/><br/>

:white_check_mark: 1. Consultado os dados
:white_check_mark: 2. Atualizando e excluindo dados
3. Alterando e restringindo o formato das nossas tabelas
4. Agrupando dados e fazendo consultas mais inteligentes
5. Juntando dados de várias tabelas

## 1. Consultado os dados
```sql
mysql -uroot -p

create database controle_compras;

use controle_comprar;

create table compras (id int auto_increment primary key, valor double, data date, recebido boolean, observacoes varchar(255));

desc compras;

insert into compras (valor, data, recebido, observacoes) values (1500.0, '2017-10-07', 1, 'Geladeira nova porque a velha quebrou');

select * from compras;

select data, valor from compras;

select data, valor from compras where valor > 1000;

select data, valor from compras where valor <> 500;

select data, valor from compras where observacoes like 'Geladeira%';

```

## 2. Atualizando e excluindo dados




## 3. Alterando e restringindo o formato das nossas tabelas
## 4. Agrupando dados e fazendo consultas mais inteligentes
## 5. Juntando dados de várias tabelas