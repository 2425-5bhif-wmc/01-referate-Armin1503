FROM eclipse-temurin:21-jre
RUN mkdir -p /opt/application
COPY *-runner.jar /opt/application/config-demo.jar
COPY .env /opt/application/.env
WORKDIR /opt/application
CMD [ "java", "-jar", "config-demo.jar" ]