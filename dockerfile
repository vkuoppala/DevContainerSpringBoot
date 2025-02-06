# Use OpenJDK as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the jar file from your local machine to the container
COPY target/devcontainerspringboot-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app will run on
EXPOSE 8080

# Define the command to run your Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]