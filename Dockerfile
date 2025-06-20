FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .

RUN apt-get install maven -y
RUN mvn clean install

FROM openjdk:17-jdk-slim
EXPOSE 8081
COPY --from=build /target/api-users-1.jar api-users.jar

ENTRYPOINT ["java", "-jar", "api-users.jar"]