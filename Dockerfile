## Guide:
### https://spring.io/guides/gs/spring-boot-docker/
### https://www.adictosaltrabajo.com/2016/06/07/desarrollo-de-microservicios-con-spring-boot-y-docker/
### https://www.surevine.com/building-docker-images-with-maven/
### https://dzone.com/articles/microservice-architecture-with-spring-cloud-and-do

# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine3.8

# The application's jar file
ARG JAR_FILE

ENV _JAVA_OPTIONS "-Xms100m -Xmx200m -Djava.awt.headless=true"

# Add Maintainer Info
LABEL maintainer="neider.tapia@gmail.com"

# Add a volume pointing to /tmp
# Create a /tmp volume to speed up second launch times of the containers,
# as this is where the embedded application container stores its exploded contents to
VOLUME /tmp

# Make port 8585 available to the world outside this container
EXPOSE 8585

# Copy the application's jar to the container
COPY /target/pos.jar /app/app.jar

WORKDIR /app

# Lastly we tell Java to use /dev/urandom for its random number seed to improve boot times.
# Run the jar file
ENTRYPOINT ["java", "-jar", "-Djava.security.egd=file:/dev/./urandom", "/app/app.jar"]