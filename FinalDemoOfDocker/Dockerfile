FROM openjdk:8-jdk-alpine 
run apt-get install maven
COPY pom.xml pom.xml
COPY TextFile.txt TextFile.txt
ADD target/FinalDemoOfDocker-0.0.1-SNAPSHOT-jar-with-dependencies.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
