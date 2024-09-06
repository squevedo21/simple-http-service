# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the Maven build into the container
COPY target/*.jar app.jar

# Specify the command to run the JAR file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]