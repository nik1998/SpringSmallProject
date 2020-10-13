FROM java:8
EXPOSE 8080
ARG WAR_FILE=target/*.war
COPY ${WAR_FILE} app.war
ENTRYPOINT ["java","-war","/app.war"]