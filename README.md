📒 Contact Manager – Full Stack Application

(Spring Boot + MySQL + Angular)

A complete Contact Management System built from scratch using Spring Boot (Backend) and Angular (Frontend).
This project was developed to deeply understand real-world application architecture, backend–frontend integration, and CRUD workflows used in enterprise projects.

🎯 What I Learned From This Project

How a real backend service team works step by step

How Spring Boot connects to MySQL using JPA & Hibernate

Why we use Controller, Service, Repository, Entity layers

How REST APIs are designed and tested using Postman

How Angular consumes backend APIs

How CORS works and how to fix it

How frontend CRUD operations sync with database

How auto-increment IDs work in real databases

How to structure and deploy a full-stack application

🚀 Features
Backend (Spring Boot)

Create Contact

Get All Contacts

Update Contact

Delete Contact

MySQL integration

Hibernate auto SQL generation

Clean layered architecture

Frontend (Angular)

Display contacts in a responsive table

Add contact (popup modal)

Edit contact (same popup, update mode)

Delete contact

Clean UI using pure Angular + CSS (no Bootstrap)

Real-time data sync with backend

🛠 Tech Stack
Backend

Java 17

Spring Boot 3+

Spring Web

Spring Data JPA

Hibernate ORM

MySQL

Maven

Frontend

Angular (latest)

TypeScript

HTML

CSS (custom, no Bootstrap)

📂 Project Architecture (Industry Standard)
Backend – Layered Architecture
controller  →  service  →  repository  →  database

src/main/java/com/veer/contact_manager_backend
│
├── controller
│   └── ContactController.java     # REST APIs
│
├── service
│   ├── ContactService.java        # Service interface
│   └── impl
│       └── ContactServiceImpl.java # Business logic
│
├── repository
│   └── ContactRepository.java     # JPA DB operations
│
├── model
│   └── Contact.java               # Entity (DB mapping)
│
└── ContactManagerBackendApplication.java

Frontend – Angular Structure
src/app
│
├── services
│   └── contact.service.ts         # API calls
│
├── app.component.ts               # Logic
├── app.component.html             # UI
├── app.component.css              # Styling
└── app.module.ts

🔥 End-to-End Application Flow
Angular UI
   ↓
Angular Service (HttpClient)
   ↓
Spring Boot Controller
   ↓
Service Layer (Business Logic)
   ↓
Repository (JPA)
   ↓
MySQL Database
