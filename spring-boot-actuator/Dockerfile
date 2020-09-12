FROM java:8-jdk-alpine

COPY ./target/spring-boot-actuator-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

EXPOSE 8081

RUN sh -c 'touch spring-boot-actuator-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","spring-boot-actuator-0.0.1-SNAPSHOT.jar"]

