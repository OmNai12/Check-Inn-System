# Use Amazon Corretto 21 as the base image this will serve the jdk
FROM amazoncorretto:21

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file into the container
COPY target/Check-Inn-System.jar /app/Check-Inn-System.jar

# Expose the port if your application runs on a specific port (e.g., 8080)
# EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/Check-Inn-System.jar"]
