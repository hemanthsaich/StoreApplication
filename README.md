# Store Application

## Overview
A Spring Boot based store application that provides functionality for users to register, login, and purchase products. The application includes both customer and admin functionalities with secure authentication and session management.

![image](https://github.com/user-attachments/assets/960ce053-496d-413d-b3ff-da3f521322f1)


## Features
- User Authentication (Login/Register)
- Role-based Access (Customer/Admin)
- Product Management
- Cart Functionality
- Order Processing
- Admin Dashboard
- Session Management

## Tech Stack
- **Backend**
  - Java
  - Spring Boot
  - Spring MVC
  - Spring Security
  - Hibernate/JPA

- **Frontend**
  - JSP
  - HTML
  - CSS
  - JavaScript

- **Database**
  - MySQL

## Project Structure
```
store-application/
├── src/main/
│   ├── java/com/project/
│   │   ├── controller/
│   │   │   ├── AdminController.java
│   │   │   ├── CustomerController.java
│   │   │   ├── LoginController.java
│   │   │   └── RegisterController.java
│   │   ├── dao/
│   │   │   ├── ProductRepo.java
│   │   │   └── UserRepo.java
│   │   ├── model/
│   │   │   ├── Product.java
│   │   │   └── User.java
│   │   └── StoreApplication.java
│   ├── resources/
│   │   └── application.properties
│   └── webapp/
│       └── views/
│           ├── admin/
│           ├── customer/
│           └── login/
└── pom.xml
```

## Key Components

### Controllers
- `LoginController`: Handles user authentication
- `RegisterController`: Manages new user registration
- `AdminController`: Admin functionalities for product management
- `CustomerController`: Customer operations like viewing products and cart management

### Models
- `User`: User entity with attributes like username, password, role
- `Product`: Product entity with details like name, price, description

### Repositories
- `UserRepo`: Data access for user operations
- `ProductRepo`: Data access for product management

## Setup Instructions

### Prerequisites
- JDK 11+
- Maven 3.6+
- MySQL 8.0+

### Database Configuration
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/store_db
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
```

### Running the Application
1. Clone the repository
```bash
git clone https://github.com/hemanthsaich/StoreApplication.git
```

2. Build the project
```bash
mvn clean install
```

3. Run the application
```bash
mvn spring-boot:run
```

4. Access the application at `http://localhost:8080`

## Application Flow

### User Authentication
- Users can register with username and password
- Role-based authentication (ADMIN/CUSTOMER)
- Session management for logged-in users

### Admin Features
- Add/Edit/Delete products
- View all products
- Manage inventory

### Customer Features
- Browse products
- Add to cart
- Place orders
- View order history

## Security
- Password encryption
- Session management
- Role-based access control
- Form validation

## Future Enhancements
1. Payment integration
2. Email notifications
3. Product categories
4. Order tracking
5. User profile management

## Contributing
1. Fork the repository
2. Create feature branch
3. Commit changes
4. Push to branch
5. Create Pull Request
