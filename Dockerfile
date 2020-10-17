FROM maven:3.5.2-jdk-8-alpine AS MAVEN_TOOL_CHAIN
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean install war:exploded

FROM tomcat:8-jre8
EXPOSE 8080
RUN rm -r /usr/local/tomcat/webapps/ROOT
COPY --from=MAVEN_TOOL_CHAIN /usr/src/app/target/*.war /usr/local/tomcat/webapps/ROOT.war
