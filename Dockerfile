FROM openjdk:11
EXPOSE 8082
ADD target/devops_project.jar devops_project.jar
ENTRYPOINT ["java" , "-jar" ,"/devops_project.jar"]
