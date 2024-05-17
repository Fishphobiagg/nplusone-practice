## 프로젝트 개요
N+1 문제를 학습하고 해결하기 위한 예제 프로젝트입니다. 이 프로젝트는 Spring Boot를 기반으로 하며, JPA와 Querydsl을 사용하여 데이터베이스 쿼리를 최적화합니다. 또한, H2 데이터베이스를 사용하여 간단한 개발 환경을 제공합니다.

### 빌드 

`./gradlew build`

### 실행

`./gradlew bootRun`

```java -jar build/libs/NPlusOneSolver-0.0.1-SNAPSHOT.jar```

### 테스트

`./gradlew test`

### application.yml 구성

```yaml
spring:
  datasource:
    url: jdbc:h2:mem:{db명}
    driver-class-name: org.h2.Driver
    username: {유저명}
    password: {비밀번호}

  jpa:
    hibernate:
      ddl-auto: {}
    show-sql: true

  h2:
    console:
      enabled: true
      path: /h2-console


```

