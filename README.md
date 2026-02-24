# Java-Spring-Boot-RestAPI with Maven-MySQL
===========================================

## Overview

This project is a simple Java Spring Boot application that connects to a MySQL database using Maven for dependency
management. It demonstrates how to set up a basic Spring Boot application with MySQL integration.

### Prerequisites

- Java Development Kit (JDK) 25 or higher
- Maven 4.0 or higher
- Spring Boot 4.0 or higher
- spring-boot-starter-data-jpa
- MySQL Server
- An IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor
- Postman or any API testing tool (optional)
- Git (optional)

### Getting Started

1. **Clone the Repository**: If you have Git installed, you can clone the repository using the following command:
   ```bash
   git clone        
    ```
   Alternatively, you can download the project as a ZIP file and extract it.
2. **Navigate to the Project Directory**: Open a terminal and navigate to the project directory:
   ```bash
   cd Java-Spring-Boot-RestAPI
   ```
3. **Configure MySQL Database**: Ensure that you have MySQL installed and running. Create a new database for the
   application:
   ```sql
   CREATE DATABASE dbname;
   ```
   Update the `application.properties` file with your MySQL database credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/dbname
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```
4. **Build the Application**: Use Maven to build the application:
   ```bash
   mvn clean install
   ```
5. **Run the Application**: Start the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```
   The application will start on `http://localhost:8080`.
6. **Test the API**: You can use Postman or any API testing tool to test the REST endpoints. For example, to create
   a new user, send a POST request to `http://localhost:8080/api/users` with the following JSON body:
   ```json
   {
       "name": "John Doe",
       "email": "johndoe@mail.com"
   }
    ```
   To retrieve all users, send a GET request to `http://localhost:8080/api/users`.
7. **Stop the Application**: To stop the application, press `Ctrl + C` in the terminal where the application is running.
8. **Optional - Run Tests**: If you have tests set up, you can run them using Maven:
   ```bash
   mvn test
   ```
### Conclusion
This project serves as a basic template for building a RESTful API using Java Spring Boot with MySQL integration. You can expand upon this foundation by adding more features, such as authentication, additional endpoints, or integrating with other services. Happy coding!
