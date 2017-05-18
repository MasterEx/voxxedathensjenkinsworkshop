FROM frolvlad/alpine-oraclejdk8:slim
ADD target/demo-0.0.1-SNAPSHOT.jar a.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
