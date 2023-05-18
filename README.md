# POBackend

How to start the POBackend application locally
---
1. the machine needs java (11 or later), JAVA_HOME and maven (3.9.2 or later) installed before building application
1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/PObackend-1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`
1. To check that your application is running enter url `http://localhost:8080/poitem/all`

---
Health Check
To see your applications health enter url `http://localhost:8081/healthcheck`
