# Use an official OpenJDK runtime as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/to-uppercase-1.0.0.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]