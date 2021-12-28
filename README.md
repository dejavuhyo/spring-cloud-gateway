# Spring Cloud Gateway

## 1. 설명
spring-cloud-gateway 설정

## 2. 개발환경

* OpenJDK 11

* Spring Cloud Gateway 3.1.0

* Spring Cloud Netflix Eureka Client 3.1.0

## 3. 실행 순서

* Eureka 실행

* Gateway 실행

* API Service 실행
  - [board-rest-api](https://github.com/dejavuhyo/board-rest-api)

## 4. 확인

### 1) Router

* <http://localhost:8080/actuator/gateway/routes>

### 2) API Service

* <http://localhost:8080/board>
