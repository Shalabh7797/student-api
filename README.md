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
my focus is on learning details not on project and how can i make other changes through using more interfaces and how can i buikd our own interfaces and what not  
4. Swagger UI: http://localhost:8080/swagger-ui/index.html
API base path: http://localhost:8080/api/students

## Quick start (Docker)
```bash
docker compose up --build
```

If you want me to push this to your GitHub or create a polished React frontend that connects to this API, tell me which and I will create the exact git commands or the React project next.
