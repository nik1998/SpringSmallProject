FROM maven:3.6.0-jdk-11-slim AS build
RUN mvn clean install


FROM tomcat:8-jre8
EXPOSE 8080
ARG WAR_FILE=target/*.war
COPY ${WAR_FILE} /usr/local/tomcat/webapps/app.war