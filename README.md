# POBackend

How to start the POBackend application locally
---
1. the machine needs java (11 or later), JAVA_HOME and maven (3.9.2 or later) installed before building the application
1. Run `mvn clean install` to build this application
1. Start application with `java -jar target/PObackend-1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`
1. To check that your application is running enter url `http://localhost:8080/poitem/all`
1. No need to worry about CORS issue, fronEnd app can handle it`

---
Health Check
To see your applications health enter url `http://localhost:8081/healthcheck`
