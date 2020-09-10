FROM openjdk:8-jdk-alpine
MAINTAINER Otavio Rojas
VOLUME /tmp
COPY target/*.jar crud-anime-list-0.0.1.jar
ENTRYPOINT ["java","-jar","/crud-anime-list-0.0.1.jar"]
