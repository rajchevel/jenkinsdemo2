FROM openjdk:11
EXPOSE 8081
ADD target/spring-boot-aws.jar spring-boot-aws.jar
ENTRYPOINT ["java","-jar","/spring-boot-aws.jar"]