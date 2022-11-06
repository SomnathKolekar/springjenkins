FROM openjdk:8
EXPOSE 8080
ADD target/springjenkins-docker-integration-sample.jar springjenkins-docker-integration-sample.jar
ENTRYPOINT ["java", "-jar", "/springjenkins-docker-integration-sample.jar"]