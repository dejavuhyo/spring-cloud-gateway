# Spring Cloud Gateway

## 1. 설명
Eureka Server에 Gateway는 Spring Cloud Gateway를 사용하여 Board Service를 실행한다.

## 2. 개발환경

* OpenJDK 11

* Spring Cloud Gateway 3.1.0

* Spring Cloud Netflix Eureka Client 3.1.0

## 3. 실행 순서
IntelliJ에서 [Eureka](https://github.com/dejavuhyo/eureka-server), [Gateway](https://github.com/dejavuhyo/spring-cloud-gateway), [Board](https://github.com/dejavuhyo/board-rest-api) 모듈을 import 하여 실행한다.

* Eureka 실행
  - Port: 8761

* Gateway 실행
  - Port: 8080

* Board Service 실행
  - Port: 8081

## 4. 확인

### 1) Router

* <http://localhost:8080/actuator/gateway/routes>

### 2) API Service

* <http://localhost:8080/board>
