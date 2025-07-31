# Spring Boot Todo API

A RESTful Todo application backend built with Spring Boot. Features complete CRUD operations, task completion toggle, and CORS support for frontend integration.

## Features

- ✅ Create new todo items
- 📋 Retrieve all todo items
- 🔄 Toggle todo completion status
- 🗑️ Delete todo items
- 🌐 CORS enabled for frontend integration
- 🛡️ Error handling for non-existent todos

## Tech Stack

- **Java** - Programming language
- **Spring Boot** - Backend framework
- **Spring Data JPA** - Database abstraction
- **Spring Web** - REST API development
- **Maven** - Dependency management
- **Database** - H2/MySQL (configurable)

## Project Structure

```
src/main/java/com/adityagautam/todoapp/
├── controller/
│   └── TodoController.java    # REST API endpoints
├── service/
│   └── TodoService.java       # Business logic
├── model/
│   └── Todo.java             # Entity model
└── repo/
    └── TodoRepo.java         # Data repository
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/todos` | Get all todos |
| POST | `/api/todos` | Create a new todo |
| PUT | `/api/todos/{id}` | Toggle todo completion status |
| DELETE | `/api/todos/{id}` | Delete a todo |

## Prerequisites

- Java 11 or higher
- Maven 3.6+
- IDE (IntelliJ IDEA, Eclipse, VS Code)

## Getting Started

### 1. Clone the repository
```bash
git clone https://github.com/yourusername/spring-boot-todo-api.git
cd spring-boot-todo-api
```

### 2. Run the application
```bash
mvn spring-boot:run
```

Or using your IDE:
- Import the project as a Maven project
- Run the main class `TodoappApplication.java`

### 3. Test the API
The application will start on `http://localhost:8080`

#### Create a Todo
```bash
curl -X POST http://localhost:8080/api/todos \
  -H "Content-Type: application/json" \
  -d '{"title": "Learn Spring Boot", "completed": false}'
```

#### Get All Todos
```bash
curl http://localhost:8080/api/todos
```

#### Toggle Todo Completion
```bash
curl -X PUT http://localhost:8080/api/todos/1
```

#### Delete a Todo
```bash
curl -X DELETE http://localhost:8080/api/todos/1
```

## Configuration

### Database Configuration
By default, the application uses H2 in-memory database. To use MySQL, update `application.properties`:

```properties
# MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/todoapp
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
```

### CORS Configuration
Currently configured to allow requests from `http://localhost:5173` (Vite dev server). Update in `TodoController.java` if needed.

## Todo Model

```json
{
  "id": 1,
  "title": "Sample Todo",
  "completed": false
}
```

## Error Handling

The API includes basic error handling:
- Returns `RuntimeException` for non-existent todo operations
- Validates todo existence before update/delete operations

## Future Enhancements

- [ ] Add input validation
- [ ] Implement pagination
- [ ] Add user authentication
- [ ] Add todo categories/tags
- [ ] Add due dates
- [ ] Implement search functionality
- [ ] Add comprehensive error responses
- [ ] Add unit and integration tests

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Create a Pull Request

## License

This project is open source and available under the [MIT License](LICENSE).

## Contact

**Aditya Gautam**
- GitHub: [@Adityagautam50009](https://github.com/Adityagautam50009)
- Email: adityagautam@50009@gmail.com

---

⭐ If you found this project helpful, please give it a star!