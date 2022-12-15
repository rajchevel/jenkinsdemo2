FROM openjdk:11
EXPOSE 8081
ADD target/spring-boot-k8s-demo.jar spring-boot-k8s-demo.jar
ENTRYPOINT ["java","-jar","/spring-boot-k8s-demo.jar"]