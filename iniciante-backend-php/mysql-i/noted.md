# MySQL I

[Link para o curso](https://cursos.alura.com.br/course/introducao-a-banco-de-dados-e-sql)

Curso iniciado em: 07/10/2017

Legenda: :white_check_mark: Concluídos | :arrow_right: Em andamento <br/><br/>

:white_check_mark: 1. Consultado os dados

:white_check_mark: 2. Atualizando e excluindo dados

:white_check_mark: 3. Alterando e restringindo o formato das nossas tabelas

:white_check_mark: 4. Agrupando dados e fazendo consultas mais inteligentes

5. Juntando dados de várias tabelas

</br></br>

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
```SQL

DELETE FROM COMPRAS WHERE ...
UPDATE COMPRAS SET VAL = TXT, VAL1 = TXT1;

```
## 3. Alterando e restringindo o formato das nossas tabelas
```SQL

... WHERE IS NULL;
... WHERE IS NOT NULL;

ALTER TABLE COMPRAS MODIFY COLUMN OBSERVACOES TEXT NOT NULL;
ALTER TABLE COMPRAS MODIFY RECEBIDO BOOLEAN DEFAULT '0';
ALTER TABLE COMPRAS ADD COLUMN FORMA_PAGT ENUM('CARTAO', 'BOLETO', 'DINHEIRO');
ALTER TABLE COMPRAS CHANGE FORMA_PAGT FORMA_PAGT ENUM('CARTAO', 'BOLETO', 'DINHEIRO');

/* CHANGE: ele recebe a coluna que quer ser alterada, e a versão nova dessa coluna. */

```



## 4. Agrupando dados e fazendo consultas mais inteligentes
- Funções de month(data) e year(data) para manipulação de datas)

```sql

select sum(valor) as total 
from compras 
where data > '2010-01-01';

select count(valor) as quantidade 
from compras 
where data > '2010-01-01';

select month(data), year(data), sum(valor) 
from compras 
group by month(data), year(data);

select month(data), year(data), sum(valor) 
from compras 
group by month(data), year(data) 
order by year(data), month(data);

```

## 5. Juntando dados de várias tabelas