# Product Inventory API

A simple Product Inventory Management API built with Spring Boot 4, H2 in-memory database, and manual DTO mapping.
This project demonstrates best practices for a layered architecture: Controller → Service → Repository and includes global exception handling.

# Tech Stack
Java 24
Spring Boot 4
Spring Data JPA
H2 Database
Lombok
Springdoc OpenAPI (Swagger UI)

# Get Started
git clone <repository-url>
cd product-inventory

# Run the application
mvn clean spring-boot:run

Access the API
Swagger UI: http://localhost:8080/swagger-ui.html
H2 Console: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:inventorydb
User: sa
Password: (leave blank)

| Method | Endpoint             | Description            | Body (JSON)                                                                            |
| ------ | -------------------- | ---------------------- | -------------------------------------------------------------------------------------- |
| POST   | `/api/products`      | Create a new product   | `{ "name": "Laptop", "description": "Gaming Laptop", "price": 85000, "quantity": 10 }` |
| GET    | `/api/products`      | Get all products       | -                                                                                      |
| GET    | `/api/products/{id}` | Get a product by ID    | -                                                                                      |
| PUT    | `/api/products/{id}` | Update a product by ID | `{ "name": "Laptop Pro", "description": "Updated", "price": 95000, "quantity": 5 }`    |
| DELETE | `/api/products/{id}` | Delete a product by ID | -                                                                                      |

# H2 Database Console

URL: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:inventorydb
Username: sa
Password: (leave blank)


