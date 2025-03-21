# Stage 1: Build the application
FROM eclipse-temurin:17-jdk-alpine AS builder

# Set the working directory inside the container
WORKDIR /app

# Copy Maven wrapper and pom.xml
COPY mvnw pom.xml ./
COPY .mvn .mvn

# Copy source files
COPY src src

# Build the application
RUN ./mvnw clean package -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=builder /app/target/graphql-project-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8009

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
