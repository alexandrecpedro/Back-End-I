FROM openjdk:18
# Creating an Argument (ARG)
ARG JAR_FILE=target/*.jar
# COPY from JAR_FILE (Easier for Docker to find) = app.jar
COPY ${JAR_FILE} app.jar
# ENTRYPOINT [archive_type, extension, archive_executed]
ENTRYPOINT ["java", "-jar", "/app.jar"]