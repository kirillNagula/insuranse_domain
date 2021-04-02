FROM adoptopenjdk:11-jre-hotspot
COPY target/*.jar insuranse_domain-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "insuranse_domain-0.0.1-SNAPSHOT.jar"]