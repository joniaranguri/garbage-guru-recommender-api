# Use a base image with JDK 11
FROM eclipse-temurin:11-jdk-alpine

# Install CA certificates (necessary for Alpine-based images)
RUN apk update && apk add --no-cache ca-certificates

# Set environment variables
ENV APP_HOME=/app
ENV JAVA_OPTS="-Dhttps.protocols=TLSv1.2"

# Set the working directory
WORKDIR $APP_HOME

# Copy the Maven wrapper and pom.xml
COPY .mvn/ .mvn
COPY mvnw .
COPY pom.xml .

# Download dependencies (use insecure flags if SSL/TLS handshake error persists)
RUN ./mvnw dependency:go-offline -B \
    -Dmaven.wagon.http.ssl.insecure=true \
    -Dmaven.wagon.http.ssl.allowall=true

# Copy the source code
COPY src ./src

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose the port your application runs on
EXPOSE 8080

# Specify the entry point
CMD ["java", "-jar", "target/garbage-guru-recommender-api-1.0.0-SNAPSHOT-shaded.jar"]
