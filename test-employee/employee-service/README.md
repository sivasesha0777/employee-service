# Employee Service - SonarQube Test

Requirements:
- Java 17
- Maven 3.9+
- SonarQube running at http://localhost:9000

Run tests/build:
mvn clean package

Run application:
mvn spring-boot:run

Test:
http://localhost:8080/employees

Run SonarQube analysis:
mvn clean verify sonar:sonar -Dsonar.host.url=http://localhost:9000

If authentication is enabled:
mvn clean verify sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.token=YOUR_TOKEN
