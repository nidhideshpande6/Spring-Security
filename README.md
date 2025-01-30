# Security and Progress Tracking System

This project is a Spring Boot-based application that implements user authentication, progress tracking, and secure data management. It focuses on tracking user progress and ensuring secure login and user data storage.

## Features
- **User Authentication**: Secure login and registration using Spring Security.
- **User Progress Tracking**: Tracks user progress and updates dynamically.
- **Secure APIs**: All endpoints are protected using Spring Security to ensure proper authentication and authorization.
- **Admin Management**: Admins can manage user data and progress records.
- **Database Integration**: User data and progress are stored in a MySQL database.

## Tech Stack
- **Backend**: Java, Spring Boot, Spring Security, Spring Data JPA, MySQL
- **Frontend**: Thymeleaf, HTML, CSS, JavaScript (for user interface and progress tracking display)
- **Database**: MySQL
- **Tools**: Maven, Git

## Setup Instructions

### Prerequisites
- Java 11 or later
- Maven
- MySQL database

### Steps to Run the Application

1. **Clone the Repository**:
   
   ```bash
   git clone https://github.com/yourusername/security-progress-tracking.git
   ```
2. **Navigate to the Project Directory**:

```bash

cd security-progress-tracking
```

3. **Set up Your MySQL Database:**

4. **Create a new MySQL database and user.**

5. **Update the application.properties file with your database credentials.**

Example:

properties
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

6. **Run the Application:**

mvn spring-boot:run

7. **Access the Application:**

Visit http://localhost:8080 to see the application in action.

8. **Login or register as a user and start tracking progress.**

### User Endpoints
- POST /login: Authenticate and log in a user.
- POST /register: Register a new user (requires email and password).
- GET /user/progress: Retrieve the user's current progress data.

### Admin Endpoints
- POST /admin/user: Create a new user (Admin only).
- PUT /admin/user/{id}: Update user details (Admin only).
- DELETE /admin/user/{id}: Delete a user (Admin only).

### Security Features
- Spring Security: Protects all endpoints with authentication and authorization.
- JWT Authentication: JSON Web Token (JWT) is used for secure user sessions and API access.
- Password Encryption: User passwords are securely encrypted using BCrypt.

#### Contributing
Contributions are welcome! Feel free to fork this repository, create a branch, and submit a pull request. Please ensure that any changes you make adhere to the existing code style and include tests.

#### License
This project is licensed under the MIT License - see the LICENSE file for details.

#### Acknowledgements
Thanks to the Spring Boot, Spring Security, and MySQL communities for their open-source contributions.

