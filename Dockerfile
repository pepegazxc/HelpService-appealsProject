FROM eclipse-temurin:21-jdk

WORKDIR help-service.jar

COPY target/help-service help-service.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "help-service.jar"]