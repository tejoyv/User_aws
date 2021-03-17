FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /target/User-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8300
ENV JAVA_OPTS=""
RUN sh -c "touch User-0.0.1-SNAPSHOT.jar"
ENTRYPOINT [ "java", "-jar", "User-0.0.1-SNAPSHOT.jar" ]
