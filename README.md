Food Ordering Application (Full-Stack)
Overview

This is a full-stack Food Ordering Web Application built using Spring Boot for the backend and React.js for the frontend. The system provides a complete solution for browsing food items, managing a shopping cart, placing orders, processing secure payments, and handling user authentication with role-based access control.

The backend follows a modular, feature-based architecture with RESTful API design, JWT-based security, and integration with external services such as Stripe for payments, SMTP for email notifications, and AWS S3 for file storage.

Key Features
User Features
User registration and login with JWT authentication
Browse food menu items
Add/remove items from cart
Place orders
Secure payment using Stripe
View order history
Write and view product reviews
Admin Features
Manage menu items (CRUD operations)
Manage categories
View all orders
View payment records
Role management
Basic analytics (unique customers, order tracking)
System Architecture

Frontend (React.js) → REST API (Spring Boot Backend) → MySQL Database

Frontend communicates via Axios
Backend exposes RESTful APIs
Security handled using Spring Security + JWT
External integrations: Stripe, AWS S3, SMTP Email
Technology Stack
Backend
Java 21
Spring Boot
Spring Security
Spring Data JPA (Hibernate)
MySQL
JWT Authentication (jjwt)
Lombok
ModelMapper
Stripe Java SDK
AWS SDK (S3)
SMTP Email Service
Frontend
React.js
React Router DOM
Axios
Stripe React SDK
Chart.js
FontAwesome
Project Structure

food-ordering-app/
│
├── food-backend/
│ ├── src/main/java/
│ │ ├── auth_users/
│ │ ├── cart/
│ │ ├── category/
│ │ ├── config/
│ │ ├── email_notification/
│ │ ├── enums/
│ │ ├── exceptions/
│ │ ├── menu/
│ │ ├── order/
│ │ ├── payment/
│ │ ├── review/
│ │ ├── role/
│ │ ├── security/
│ │ ├── response/
│ │
│ ├── src/main/resources/
│ └── pom.xml
│
├── food-react/
│ ├── src/
│ │ ├── components/
│ │ ├── services/
│ │ ├── pages/
│ ├── public/
│ └── package.json

Backend API Design
Auth Module

POST /auth/register
POST /auth/login

User Module

GET /api/users/all
GET /api/users/account
PUT /api/users/update (multipart/form-data)
DELETE /api/users/deactivate

Cart Module

POST /api/cart/items
PUT /api/cart/items/increment/{menuId}
PUT /api/cart/items/decrement/{menuId}
GET /api/cart
DELETE /api/cart

Category Module

POST /api/categories
PUT /api/categories
GET /api/categories/{id}
GET /api/categories/all
DELETE /api/categories/{id}

Menu Module

POST /api/menu (multipart/form-data)
PUT /api/menu (multipart/form-data)
GET /api/menu/{id}
DELETE /api/menu/{id}

Order Module

POST /api/orders/checkout
GET /api/orders/me
GET /api/orders/order-item/{orderItemId}
GET /api/orders/all
PUT /api/orders/update
GET /api/orders/unique-customers

Payment Module

POST /api/payments/pay
PUT /api/payments/update
GET /api/payments/all
GET /api/payments/{paymentId}

Review Module

POST /api/reviews
GET /api/reviews/menu-item/{menuId}
GET /api/reviews/menu-item/average/{menuId}

Role Module

POST /api/roles
PUT /api/roles
GET /api/roles
DELETE /api/roles/{id}

Security
JWT-based authentication
Role-based authorization (ADMIN, CUSTOMER)
Custom security filter chain
Custom UserDetailsService
JWT utility class for token generation and validation
Custom handlers:
AuthenticationEntryPoint
AccessDeniedHandler

All protected endpoints require a valid JWT token in the Authorization header.

Exception Handling

Global exception handling is implemented using:

GlobalExceptionHandler
Custom exceptions:
BadRequestException
NotFoundException
UnauthorizedAccessException
PaymentProcessingException
Additional Features
SMTP email notification service
Stripe payment integration
AWS S3 file storage integration
Pagination support for large datasets
ModelMapper for DTO mapping
Installation and Setup
Backend Setup

cd food-backend
mvnw spring-boot:run

Configure:

MySQL database
JWT secret key
SMTP email credentials
Stripe API keys
AWS credentials
Frontend Setup

cd food-react
npm install
npm start

Frontend runs at:
http://localhost:3000

Future Improvements
Search and filtering system
Order tracking system
Review and rating improvements
Redis caching for performance optimization
Docker containerization
CI/CD pipeline integration
Microservices architecture migration
Author

Md Easin Khandokar
Backend Developer (Spring Boot, REST APIs, Security, Microservices Learning)

License

This project is developed for educational and portfolio purposes.
