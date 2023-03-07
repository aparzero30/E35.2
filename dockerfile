# FROM openjdk:17-jdk-alpine
# ARG JAR_FILE=target/*.jar
# EXPOSE  8080
# ADD target/task-docker.jar task-docker.jar
# CMD run-migration-script && java -jar /task-docker.jar
# ENTRYPOINT ["java","-jar","/task-docker.jar"]

FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
EXPOSE 8080
ADD target/task-docker.jar task-docker.jar
CMD ["java", "-jar", "/task-docker.jar"]


