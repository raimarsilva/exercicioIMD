FROM openjdk:8-alpine

COPY . .

RUN chmod +x /build/libs/Exercicio-0.0.1-SNAPSHOT.jar

WORKDIR /build/libs

CMD ["java", "-Dspring.profiles.active=dev", "-jar", "Exercicio-0.0.1-SNAPSHOT.jar"]