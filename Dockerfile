FROM maven:3.5.2-jdk-8-alpine AS MAVEN_TOOL_CHAIN
RUN mvn clean install war:exploded

FROM tomcat:8-jre8
EXPOSE 8080
COPY --from=MAVEN_TOOL_CHAIN target/*.war /usr/local/tomcat/webapps/app.war