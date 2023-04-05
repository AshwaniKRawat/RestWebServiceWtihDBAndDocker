FROM openjdk:8

COPY target/rest-web-service-docker-0.0.1-REALEASE.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "rest-web-service-docker-0.0.1-REALEASE.jar"]
