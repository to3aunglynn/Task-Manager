# Task Manager

A robust task management application built with Spring Boot and MySQL, featuring a RESTful API for task operations.

## 🚀 Tech Stack

### Backend
- **Java 17**
- **Spring Boot 3.5.0**
    - Spring Web (REST API)
    - Spring Data JPA
    - Spring Boot Test
    - Thymeleaf (Template Engine)
- **MySQL** - Database
- **Maven** - Dependency Management

### Development Tools
- **Git** - Version Control
- **IntelliJ IDEA** - IDE
- **Postman** - API Testing

## 📋 Features

- RESTful API endpoints for task management
- CRUD operations (Create, Read, Update, Delete)
- Database persistence with MySQL
- Cross-Origin Resource Sharing (CORS) enabled
- Server-side rendering with Thymeleaf

## 🛠️ API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | /api/tasks | Get all tasks |
| GET    | /api/tasks/{id} | Get a specific task |
| POST   | /api/tasks | Create a new task |
| PUT    | /api/tasks/{id} | Update an existing task |
| DELETE | /api/tasks/{id} | Delete a task |

## 📥 Prerequisites

Before running this application, make sure you have the following installed:
- Java Development Kit (JDK) 17
- MySQL 8.0 or higher
- Maven
- Your favorite IDE (IntelliJ IDEA recommended)

## ⚙️ Setup and Installation

1. **Clone the repository**
   ```bash
   git clone [your-repository-url]
   cd Task-Manager
   ```

2. **Configure MySQL**
    - Create a MySQL database
    - Execute the SQL script from `taskmanagerdb.sql`

3. **Configure application.properties**
    - Update database connection settings in `src/main/resources/application.properties`
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

4. **Build the project**
   ```bash
   mvn clean install
   ```

5. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

   The application will start running at `http://localhost:8080`

## 🧪 Testing

1. **Using Postman**
    - Import the provided Postman collection: `Task Manager API.postman_collection.json`
    - Test the API endpoints directly from Postman



## 📞 Contact

Toe Aung Linn - toeaunglynn@gmail.com]

Project Link: 