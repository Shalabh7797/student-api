# Student API - tested with H2 and it's console 

##16/08/2025 -- working on junit testing 
update frontend till 25/08/2025

This is a complete Spring Boot backend for Student CRUD with DTOs, validation, CORS, Swagger, and Docker support.

## Quick start (local)
1. Ensure Java 17 and Maven are installed.
2. (a)directly from H2-console 
(b)Create MySQL database `studentdb` (or update application-dev.yml).
3. From project root:
   ```bash
   mvn clean package
   java -jar target/student-api-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev
   ```

## still not done working on it 
1. 
API base path: http://localhost:8080/api/students

