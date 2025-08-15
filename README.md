# Student API - Deliverable (Interview-ready)

This is a complete Spring Boot backend for Student CRUD with DTOs, validation, CORS, Swagger, and Docker support.

## Quick start (local)
1. Ensure Java 17 and Maven are installed.
2. Create MySQL database `studentdb` (or update application-dev.yml).
3. From project root:
   ```bash
   mvn clean package
   java -jar target/student-api-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev
   ```
4. Swagger UI: http://localhost:8080/swagger-ui/index.html
API base path: http://localhost:8080/api/students

## Quick start (Docker)
```bash
docker compose up --build
```

If you want me to push this to your GitHub or create a polished React frontend that connects to this API, tell me which and I will create the exact git commands or the React project next.
