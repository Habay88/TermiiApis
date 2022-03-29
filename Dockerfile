FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8080
EXPOSE 3306
ARG JAR_FILE=target/TermiiTask-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]