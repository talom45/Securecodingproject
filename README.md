# Securecodingproject
A repository for mini project
# Spring Boot H2 User Registration and Login

## Overview

This project is a simple Spring Boot application that provides user registration and login functionality using H2 as an in-memory database. It demonstrates key concepts in Spring Boot, including Spring Security, JPA, and Thymeleaf for rendering views.

## Features

- User registration with email and password
- Password hashing for secure storage
- Login functionality
- H2 in-memory database for quick setup
- Access to H2 console for database management

## Technologies Used

- Spring Boot
- Spring Data JPA
- Spring Security
- H2 Database
- Thymeleaf
- Maven

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Maven

### Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/yourusername/your-repo-name.git
   cd your-repo-name
   Accessing the Application
Open your web browser and navigate to:
Registration: http://localhost:8080/register
Login: http://localhost:8080/login
Accessing the H2 Console
To access the H2 database console:

Navigate to: http://localhost:8080/h2-console.
Enter the following credentials:
JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password: (leave this blank)
Click "Connect".
Database Schema
The project uses a simple User entity with the following fields:

id: Long (Primary Key)
email: String (Unique, Not Null)
password: String (Not Null, Hashed)
How It Works
Users can register by providing their email and password.
Passwords are hashed using BCryptPasswordEncoder before being stored in the database.
Users can log in using their registered credentials.
Future Improvements
Implement validation and error handling for user inputs.
Add user roles and permissions for more robust access control.
Enhance the UI with CSS frameworks like Bootstrap.
License
This project is licensed under the MIT License - see the LICENSE file for details.

Acknowledgments
Spring Boot Documentation
H2 Database Documentation
Thymeleaf Documentation

### Conclusion

Feel free to modify any sections to better fit your project's details, such as the repository link or any additional features you might want to include. If you have any specific changes or additions in mind, just let me know!
