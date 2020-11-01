FROM openjdk:8-jre-alpine

ENV PROPERTIES_PATH src/main/resources/application.properties

COPY build/libs/docker-test-0.0.1-SNAPSHOT.jar /var/app.jar
COPY $PROPERTIES_PATH /var/application.properties

EXPOSE 9999

ENV PARAMETER1 'Parameter1 Dockerfile'
ENV PARAMETER2 'Parameter2 Dockerfile'
ENV PARAMETER3 'Parameter3 Dockerfile'

ADD run.sh run.sh
RUN chmod 700 run.sh
CMD ["./run.sh"]

