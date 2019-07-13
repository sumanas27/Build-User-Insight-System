# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="sumanas27@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8082 available to the world outside this container
EXPOSE 8082

# The application's jar file
ARG JAR_FILE=target/User-Insight-System-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} User-Insight-System-0.0.1-SNAPSHOT.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/User-Insight-System-0.0.1-SNAPSHOT.jar"]