FROM openjdk:17-jdk-alpine
MAINTAINER miztli
COPY target/spring-application-0.0.1-SNAPSHOT.jar spring-application-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/spring-application-0.0.1-SNAPSHOT.jar"]