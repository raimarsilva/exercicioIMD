FROM openjdk:17-alpine

COPY . .

RUN chmod +x /build/libs/exercicio-0.0.1-SNAPSHOT.jar

WORKDIR /build/libs

#RUN javac Main.java

EXPOSE 8080

ENTRYPOINT ["java", "-Dspring.profiles.active=dev", "-jar", "exercicio-0.0.1-SNAPSHOT.jar"]