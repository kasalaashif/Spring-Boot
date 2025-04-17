# Spring Boot REST API - Employee Management System

A simple yet robust RESTful API built using Spring Boot for managing employee records. This project demonstrates the implementation of CRUD (Create, Read, Update, Delete) operations using Spring Boot, Spring Data JPA, and H2 Database.

## Features

- RESTful API endpoints for employee management
- In-memory H2 database
- Standard CRUD operations
- Clean architecture with Controller-Service-Repository pattern
- Exception handling with appropriate HTTP status codes

## Technology Stack

- Java 17
- Spring Boot 3.4.4
- Spring Data JPA
- H2 Database
- Maven

## Project Structure

```
src/main/java/com/SpringBoot/REST/
├── RestApplication.java
├── controller
│   └── EmployeeController.java
├── service
│   └── EmployeeService.java
├── repository
│   └── EmployeeRepository.java
└── entity
    └── Employee.java
```

## API Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| POST   | /api/employees | Create a new employee |
| GET    | /api/employees | Retrieve all employees |
| GET    | /api/employees/{id} | Retrieve a specific employee by ID |
| PUT    | /api/employees/{id} | Update an employee |
| DELETE | /api/employees/{id} | Delete an employee |

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

### Running the Application

1. Clone the repository:
```bash
git clone <repository-url>
```

2. Navigate to the project directory:
```bash
cd REST
```

3. Run the application using Maven:
```bash
./mvnw spring-boot:run
```

The application will start running at `http://localhost:8080`

## API Usage Examples

### Create Employee
```bash
curl -X POST http://localhost:8080/api/employees \
-H "Content-Type: application/json" \
-d '{"firstName":"John","lastName":"Doe","email":"john@example.com"}'
```

### Get All Employees
```bash
curl http://localhost:8080/api/employees
```

### Get Employee by ID
```bash
curl http://localhost:8080/api/employees/1
```

### Update Employee
```bash
curl -X PUT http://localhost:8080/api/employees/1 \
-H "Content-Type: application/json" \
-d '{"firstName":"John","lastName":"Smith","email":"john.smith@example.com"}'
```

### Delete Employee
```bash
curl -X DELETE http://localhost:8080/api/employees/1
```

## Database

The application uses H2 in-memory database. You can access the H2 console at:
- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (leave empty)

## Entity Structure

The Employee entity contains the following fields:
- `id` (Long): Auto-generated unique identifier
- `firstName` (String): Employee's first name
- `lastName` (String): Employee's last name
- `email` (String): Employee's email address

## Contributing

Feel free to fork this repository and submit pull requests. Any contributions to improve the project are welcome.

## License

This project is open-source and available under the MIT License. 