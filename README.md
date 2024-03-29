# oauth-sample
> Google, Naver, Kakao OAuth2 Sample.

<br>

## Development Environment
<div style="display: inline-block">
    <img src="https://img.shields.io/badge/IntelliJ%20IDEA-000000?style=flat&logo=IntelliJIDEA&logoColor=white" />
    <img src="https://img.shields.io/badge/HTML-E34F26?style=flat&logo=HTML5&logoColor=white" />
    <img src="https://img.shields.io/badge/CSS-1572B6?style=flat&logo=CSS3&logoColor=white" />
    <img src="https://img.shields.io/badge/Java-007396?style=flat&logo=coffeescript&logoColor=white" />
    <img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=flat&logo=SpringBoot&logoColor=white" />
    <img src="https://img.shields.io/badge/Gradle-02303A?style=flat&logo=Gradle&logoColor=white" />
    <img src="https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=MySQL&logoColor=white" />
</div>

<br>

- IDE : IntelliJ IDEA
- Language : HTML5, CSS3, JAVA 11 (JDK 11.0.18)
- Framework : Spring Boot 2.7.8
- Build Tool : Gradle 7.6
- DBMS : MySQL 8.0.31 for Linux

<br>

## Main Function
- 회원(User) - Google, Naver, Kakao OAuth2 로그인 연동

<br>

## Create MySQL Database
```SQL
create database oauth;
create hoong@localhost identified by '8888';
grant all privileges on oauth.* to hoong@localhost;
```

<br>

## MySQL Database Table
```SQL
drop table if exists oauth.user;

create table oauth.user (
    id       bigint primary key not null auto_increment,
    name     varchar(255) null,
    email    varchar(255) null,
    password varchar(255) null,
    role     varchar(255) null,
    provider varchar(255) null
);
```

<br>

## Swagger
```shell
http://localhost:8080/swagger-ui.html
```

<br>

## View
###### Index
<kbd><img src="image/page/img_page_index.png" /></kbd>

###### Google Login
<kbd><img src="image/page/img_page_login_google.png" /></kbd>

###### Naver Login
<kbd><img src="image/page/img_page_login_naver.png" /></kbd>

###### Kakao Login
<kbd><img src="image/page/img_page_login_kakao.png" /></kbd>
