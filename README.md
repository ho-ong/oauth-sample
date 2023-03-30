# oauth-sample
> Google, Naver, Kakao OAuth2 Sample.

<br>

## 개발 환경(Development Environment)
- IDE : IntelliJ IDEA
- Language : JAVA 11 (JDK 11.0.18)
- Framework : Spring Boot 2.7.8
- Build Tool : Gradle 7.6
- DBMS : MySQL 8.0.31 for Linux

<br>

## 주요 기능(Main Function)
- 회원(User)
    - 로그인
    - 로그아웃
    - 회원가입
    - 회원탈퇴

<br>

## MySQL Database 계정 생성 및 권한 부여
```SQL
create database oauth;
create hoong@localhost identified by '8888';
grant all privileges on oauth.* to hoong@localhost;
```

<br>

## MySQL Database 테이블
```SQL
create table user (
    id       bigint not null primary key auto_increment,
    email    varchar(255) null,
    name     varchar(255) null,
    password varchar(255) null,
    provider varchar(255) null,
    role     varchar(255) null
);
```

<br>

## Swagger 실행 방법
```shell
http://localhost:8080/swagger-ui.html
```
