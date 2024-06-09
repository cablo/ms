FROM openjdk:21-jdk
MAINTAINER cablo
COPY build/libs/ms-0.1-all.jar ms.jar
ENTRYPOINT ["java","-jar","/ms.jar"]