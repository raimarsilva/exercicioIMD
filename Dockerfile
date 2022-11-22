FROM gradle:7.5.1-jdk17-alpine as builder
WORKDIR /usr/app
COPY . ./
RUN gradle build -x test

FROM openjdk:17-alpine
WORKDIR /usr/app
COPY --from=builder /usr/app/build/libs/*jar ./app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=dev", "-jar", "app.jar"]