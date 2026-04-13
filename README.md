# Food Ordering Application (Full-Stack)

## Overview

This is a full-stack Food Ordering Web Application built using Spring Boot for the backend and React.js for the frontend. The system provides a complete solution for browsing food items, managing a shopping cart, placing orders, processing secure payments, and handling user authentication with role-based access control.

The backend follows a modular, feature-based architecture with RESTful API design and integrates external services such as Stripe for payments, SMTP for email notifications, and AWS S3 for file storage.

---

## Key Features

### User Features
- User registration and login using JWT authentication
- Browse food menu
- Add/remove items from cart
- Place orders
- Secure payment processing
- View order history
- Submit and view reviews

### Admin Features
- Manage menu items (CRUD)
- Manage categories
- View and manage orders
- View payments
- Role management
- Customer analytics

---

## System Architecture

```
Frontend (React.js)
        ↓
REST API (Spring Boot)
        ↓
Database (MySQL)
```

- Frontend communicates using Axios
- Backend exposes REST APIs
- Security handled with Spring Security and JWT

---

## Technology Stack

### Backend
- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA (Hibernate)
- MySQL
- JWT (jjwt)
- Lombok
- ModelMapper
- Stripe Java SDK
- SMTP Email Service

### Frontend
- React.js
- React Router DOM
- Axios
- Stripe Integration
- Chart.js
- FontAwesome

---

## Project Structure

```
food-ordering-app/
│
├── food-backend/
│   ├── src/main/java/
│   │   ├── auth_users/
│   │   ├── cart/
│   │   ├── category/
│   │   ├── config/
│   │   ├── email_notification/
│   │   ├── enums/
│   │   ├── exceptions/
│   │   ├── menu/
│   │   ├── order/
│   │   ├── payment/
│   │   ├── review/
│   │   ├── role/
│   │   ├── security/
│   │   └── response/
│   │
│   └── src/main/resources/
│
├── food-react/
│   ├── src/
│   │   ├── components/
│   │   ├── services/
│   │   ├── pages/
│   └── public/
```

---

## Backend API Design

### Auth
```
POST   /auth/register
POST   /auth/login
```

### User
```
GET    /api/users/all
GET    /api/users/account
PUT    /api/users/update
DELETE /api/users/deactivate
```

### Cart
```
POST   /api/cart/items
PUT    /api/cart/items/increment/{menuId}
PUT    /api/cart/items/decrement/{menuId}
GET    /api/cart
DELETE /api/cart
```

### Category
```
POST   /api/categories
PUT    /api/categories
GET    /api/categories/{id}
GET    /api/categories/all
DELETE /api/categories/{id}
```

### Menu
```
POST   /api/menu
PUT    /api/menu
GET    /api/menu/{id}
DELETE /api/menu/{id}
```

### Order
```
POST   /api/orders/checkout
GET    /api/orders/me
GET    /api/orders/order-item/{orderItemId}
GET    /api/orders/all
PUT    /api/orders/update
GET    /api/orders/unique-customers
```

### Payment
```
POST   /api/payments/pay
PUT    /api/payments/update
GET    /api/payments/all
GET    /api/payments/{paymentId}
```

### Review
```
POST   /api/reviews
GET    /api/reviews/menu-item/{menuId}
GET    /api/reviews/menu-item/average/{menuId}
```

### Role
```
POST   /api/roles
PUT    /api/roles
GET    /api/roles
DELETE /api/roles/{id}
```

---

## Security

- JWT-based authentication
- Role-based authorization (ADMIN, CUSTOMER)
- Custom authentication filter
- Custom UserDetailsService
- Access control using @PreAuthorize

All protected APIs require a valid JWT token in the Authorization header.

---

## Exception Handling

Centralized exception handling is implemented using:

- GlobalExceptionHandler
- Custom exceptions:
  - BadRequestException
  - NotFoundException
  - UnauthorizedAccessException
  - PaymentProcessingException

---

## Additional Features

- Email notifications (SMTP)
- Stripe payment integration
- AWS S3 file upload support
- Pagination support
- DTO mapping using ModelMapper

---

## Installation

### Backend

```
cd food-backend
mvnw spring-boot:run
```

### Frontend

```
cd food-react
npm install
npm start
```

Frontend runs at:
http://localhost:3000

---

## Configuration Note

Do not expose sensitive credentials in the repository. Use environment variables for:

- Database credentials
- JWT secret
- Email credentials
- Stripe keys

---

## Future Improvements

- Search and filtering
- Order tracking
- Improved review system
- Redis caching
- Docker support
- CI/CD pipeline
- Microservices architecture

---

## Author

Md Easin Khandokar  
Backend Developer (Spring Boot, REST APIs, Security)

---

## License

This project is for educational and portfolio purposes.
