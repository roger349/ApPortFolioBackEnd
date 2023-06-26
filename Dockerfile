FROM amazoncorretto:17-alpine-jdk

MAINTAINER roger esteban roldan

COPY target/rer-0.0.1-SNAPSHOT.jar  AppRer.jar

ENTRYPOINT ["java","-jar","/AppRer.jar"]
