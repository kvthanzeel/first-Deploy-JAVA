# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Copy the fat JAR file to the container
COPY target/simple-java-mongodb-1.0-SNAPSHOT.jar /app/app.jar

# Set the environment variable for port
ENV APP_PORT 8080

# Run the application
CMD ["java", "-jar", "/app/app.jar"]
