FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
EXPOSE 8081
ADD target/service.person-1.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]