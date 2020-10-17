FROM tomcat:8-jre8
EXPOSE 8080
RUN apt-get install maven
RUN mvn clean install war:exploded
COPY target/*.war /usr/local/tomcat/webapps/app.war