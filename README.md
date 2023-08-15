# POBackend

How to start the POBackend application locally
---
1. Test Env needs java (11 or later), JAVA_HOME and maven (3.9.2 or later) installed before building the app.
1. Use `mvn clean install` to build this application.
1. Start the application with command `java -jar target/PObackend-1.0-SNAPSHOT.jar server config.yml`
1. Use `http://localhost:8080` or  `http://localhost:8080/poitem/all` to check if the app is running correctly.
1. No need to worry about CORS issue, frontEnd app `PurchaseOrder` can handle it.
2. Any issue, question or comment please contact with lixiaoding07@gmail.com

---
Health Check
To see your applications health enter url `http://localhost:8081/healthcheck`
