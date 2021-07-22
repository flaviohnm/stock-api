# Projeto Santander Week | Phase: Back-End

## API-Rest Stock

## 🚀💻 Technologies & Tools

![JavaScript](https://img.shields.io/badge/-JavaScript-black?style=flat-square&logo=javascript) ![Angular](https://img.shields.io/badge/-Angular-red?style=flat-square&logo=angular) ![HTML5](https://img.shields.io/badge/-HTML5-E34F26?style=flat-square&logo=html5&logoColor=white)  ![CSS3](https://img.shields.io/badge/-CSS3-1572B6?style=flat-square&logo=css3)  ![Git](https://img.shields.io/badge/-Git-black?style=flat-square&logo=git)  ![GitHub](https://img.shields.io/badge/-GitHub-181717?style=flat-square&logo=github)
![Heroku](https://img.shields.io/badge/-Heroku-430098?style=flat-square&logo=heroku) ![Docker](https://img.shields.io/badge/-Docker-black?style=flat-square&logo=docker) ![PostgreSQL](https://img.shields.io/badge/-PostgreSQL-gold?style=flat-square&logo=postgresql) ![TypeScript](https://img.shields.io/badge/-TypeScript-black?style=flat-square&logo=typescript) ![Java](https://img.shields.io/badge/-Java-red?style=flat-square&logo=java)

## :pencil: Configurando Ambiente - Back-End

| Tool                  | Link                                                         |
| --------------------- | :----------------------------------------------------------- |
| Java                  | [https://www.java.com/pt-BR/](https://www.java.com/pt-BR/)   |
| InteliJ Community     | [https://www.jetbrains.com/pt-br/idea/](https://www.jetbrains.com/pt-br/idea/) |
| Spring                | [https://spring.io/](https://spring.io/)                     |
| PostgreSql Versão 9.4 | [https://www.postgresql.org/](https://www.postgresql.org/)   |
| PGAdmin               | [https://www.pgadmin.org/](https://www.pgadmin.org/)         |
| Heroku                | [https://dashboard.heroku.com/](https://dashboard.heroku.com/) |

### 💻PostgreSQL
```sql
    /* CRIAR TABELA STOCK  */
    create table public.tb_stock (
    id numeric (9) not null,
    "date" date not null,
    "name" varchar (100) not null,
    price numeric(8,2) not null,
    variation numeric (5,2) not null,
    constraint tb_stock_pkkey primary key (id)
    );
```
```sql
/* HABILITANDO O ÍNDICE INCREMENTAL PARA AS STOCK */
create sequence hibernate_sequence start 1;
```
### :coffee:Confira o projeto publicado

| Fase      | Plataforma | Repo   | Link |
| --------- | ---------- | ---------- | ---------- |
| Back-End  | Heroku     | [Git](https://github.com/flaviohnm/stock-api) | [Api Rest - Stock](https://stock-santander-dio.herokuapp.com/bootcamp/swagger-ui.html) |
| Front-End | GitPages   | [Git](https://github.com/flaviohnm/homebroker) |  [Dashbord - Stock](https://flaviohnm.github.io/homebroker/) |

## :pencil:Comentários sobre o projeto

Esse projeto faz parte da Santander Week pelo [Banco Santander](https://www.santander.com.br/) e em conjunto com plataforma de ensino [Digital Innovation One Inc](https://digitalinnovation.one/) e teve como objetivo uma API-Rest para integrar com a interface do Dashboard de Apresentação de Ações Diário no Mercado Financeiro.

## :man:About me  :coffee: :airplane: :ticket: 

[![Linkedin Badge](https://img.shields.io/badge/-flaviohnm-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/flaviohnm/)](https://www.linkedin.com/in/flaviohnm/)   [![Gmail Badge](https://img.shields.io/badge/-flaviohnm@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:flaviohnm@gmail.com)](mailto:flaviohnm@gmail.com)