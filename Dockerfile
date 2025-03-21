# Use an official OpenJDK 17 image as the base image
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the host to the container
COPY target/graphql-project-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8009

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
