FROM openjdk:17-jdk-slim

ENV JAVA_OPTS=""

WORKDIR /app

COPY target/awesome-app.jar app.jar

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]

EXPOSE 8081