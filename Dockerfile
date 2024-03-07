FROM maven:latest

WORKDIR /App

COPY pom.xml /App
COPY . /App

RUN mvn package

ENTRYPOINT ["java", "-jar", "target/calculator.jar"]