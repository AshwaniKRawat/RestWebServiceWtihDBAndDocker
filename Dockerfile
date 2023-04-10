FROM openjdk:11

COPY target/rest-web-service-mssql-docker-0.0.1-REALEASE.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "rest-web-service-mssql-docker-0.0.1-REALEASE.jar"]
