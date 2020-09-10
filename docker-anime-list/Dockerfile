FROM openjdk:8-jdk-alpine
MAINTAINER Otavio Rojas
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
