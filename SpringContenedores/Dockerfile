FROM openjdk:21-ea-20-buster

#COPY --chown=185 target/quarkus-app/lib/ /deployments/lib/
#COPY --chown=185 target/quarkus-app/*.jar /deployments/
#COPY --chown=185 target/quarkus-app/app/ /deployments/app/
#COPY --chown=185 target/kuberntes-0.0.1-SNAPSHOT.jar /deployments/kuberntes-0.0.1-SNAPSHOT.jar

EXPOSE 8080
USER 185
#ENV JAVA_OPTS="-Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager"
ENV JAVA_APP_JAR="/deployments/quarkus-run.jar"

VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/deployments/app.jar"]

