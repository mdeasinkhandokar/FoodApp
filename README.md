# 🍔 Food Ordering Application (Full-Stack)

A full-stack **Food Ordering Web Application** built with **Spring Boot** (backend) and **React.js** (frontend). This project provides a complete solution for browsing food items, placing orders, managing users, and handling secure payments.

---

## 🚀 Project Overview

This application allows users to:

* Browse available food items
* Add items to cart
* Place orders
* Make secure payments (Stripe integration)
* Authenticate securely using JWT-based authentication

It follows a **modern full-stack architecture** with RESTful APIs and a responsive frontend UI.

---

## 🧠 Key Features

### 👤 User Features

* User Registration & Login (JWT Authentication)
* Browse Food Menu
* Add to Cart / Remove Items
* Place Orders
* Secure Payment Integration (Stripe)

### 🛠️ Admin Features (if implemented)

* Manage Food Items
* View Orders
* Dashboard Analytics (Chart.js)

---

## 🏗️ Architecture

```
Frontend (React)
   ↓
REST API (Spring Boot)
   ↓
Database (MySQL)
```

* **Frontend** communicates via Axios
* **Backend** exposes RESTful APIs
* **Database** stores users, orders, and products

---

## 🛠️ Tech Stack

### 🔹 Backend

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* MySQL
* JWT Authentication
* Lombok
* Mail Service (Email support)

### 🔹 Frontend

* React.js
* React Router DOM
* Axios
* Stripe (Payment Gateway)
* Chart.js (Analytics)
* FontAwesome (Icons)

---

## 📂 Project Structure

```
food-ordering-app/
│
├── food-backend/        # Spring Boot Backend
│   ├── src/
│   ├── pom.xml
│
├── food-react/          # React Frontend
│   ├── src/
│   ├── public/
│   ├── package.json
```

---

## ⚙️ Installation & Setup

### 🔧 Backend Setup (Spring Boot)

```bash
cd food-backend
./mvnw spring-boot:run
```

Or (Windows):

```bash
mvnw.cmd spring-boot:run
```

👉 Make sure to configure:

* MySQL database (application.properties)
* Email settings (if used)

---

### 💻 Frontend Setup (React)

```bash
cd food-react
npm install
npm start
```

App will run on:

```
http://localhost:3000
```

---

## 🔐 Authentication

* Uses **Spring Security + JWT**
* Token-based authentication system
* Secured API endpoints

---

## 💳 Payment Integration

* Integrated with **Stripe**
* Supports secure online payments
* Uses:

  * `@stripe/react-stripe-js`
  * `@stripe/stripe-js`

---

## 📡 API Overview (Sample)

| Method | Endpoint       | Description   |
| ------ | -------------- | ------------- |
| POST   | /auth/register | Register user |
| POST   | /auth/login    | Login user    |
| GET    | /foods         | Get all foods |
| POST   | /orders        | Place order   |

---

## 📊 Future Improvements

* 🔍 Search & Filter food items
* 📱 Mobile responsive optimization
* 🧾 Order history tracking
* ⭐ Reviews & Ratings
* 🚀 Deployment (Docker + AWS)

---

