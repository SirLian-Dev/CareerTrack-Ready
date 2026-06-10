\# CareerTrack - Architecture Document



\## Document Information



| Field        | Value       |

| ------------ | ----------- |

| Project      | CareerTrack |

| Version      | 0.1         |

| Status       | Draft       |

| Last Updated | June 2026   |



\---



\# 1. Architecture Overview



CareerTrack follows a modern web application architecture composed of:



\* Frontend Client

\* REST API Backend

\* Relational Database



The architecture is designed to be:



\* Simple

\* Scalable

\* Maintainable

\* Easy to understand for contributors



\---



\# 2. High-Level Architecture



```text

┌─────────────────┐

│     React UI    │

└────────┬────────┘

&#x20;        │ HTTPS

&#x20;        ▼

┌─────────────────┐

│ Spring Boot API │

└────────┬────────┘

&#x20;        │ JPA

&#x20;        ▼

┌─────────────────┐

│   PostgreSQL    │

└─────────────────┘

```



\---



\# 3. Technology Stack



\## Frontend



\* React

\* Vite

\* Tailwind CSS

\* Axios



Purpose:



\* User Interface

\* API Communication

\* State Management



\---



\## Backend



\* Java 21

\* Spring Boot 3

\* Spring Security

\* Spring Data JPA

\* Hibernate

\* Bean Validation



Purpose:



\* Business Logic

\* Authentication

\* Data Access

\* REST API



\---



\## Database



\* PostgreSQL



Purpose:



\* Persistent Data Storage



\---



\## Version Control



\* Git

\* GitHub



Purpose:



\* Source Control

\* Collaboration

\* Release Management



\---



\## Deployment



\### Frontend



Vercel



\### Backend



Render



\### Database



Neon PostgreSQL



\---



\# 4. Backend Architecture



The backend follows a layered architecture.



```text

Controller

&#x20;    │

&#x20;    ▼

Service

&#x20;    │

&#x20;    ▼

Repository

&#x20;    │

&#x20;    ▼

Database

```



Responsibilities:



Controller:



\* HTTP requests

\* Request validation

\* Response generation



Service:



\* Business rules

\* Application logic



Repository:



\* Database access



Database:



\* Persistent storage



\---



\# 5. Package Structure



```text

com.careertrack

│

├── config

├── controller

├── dto

├── entity

├── exception

├── mapper

├── repository

├── security

├── service

├── util

└── CareerTrackApplication

```



\---



\# 6. Package Responsibilities



\## config



Application configuration.



Examples:



\* Security configuration

\* CORS configuration



\---



\## controller



REST endpoints.



Examples:



\* AuthController

\* ApplicationController

\* DashboardController



\---



\## dto



Data transfer objects.



Examples:



\* RegisterRequest

\* LoginRequest

\* ApplicationRequest

\* DashboardResponse



\---



\## entity



JPA entities.



Examples:



\* User

\* JobApplication



\---



\## exception



Global exception handling.



Examples:



\* ResourceNotFoundException

\* UnauthorizedException

\* GlobalExceptionHandler



\---



\## mapper



Entity ↔ DTO conversion.



Examples:



\* UserMapper

\* JobApplicationMapper



\---



\## repository



Spring Data repositories.



Examples:



\* UserRepository

\* JobApplicationRepository



\---



\## security



Authentication and authorization.



Examples:



\* JwtFilter

\* JwtService

\* SecurityConfig



\---



\## service



Business logic.



Examples:



\* AuthService

\* ApplicationService

\* DashboardService



\---



\# 7. Database Design



Initial Entities:



\## User



```text

id

name

email

password

createdAt

updatedAt

```



\---



\## JobApplication



```text

id

companyName

position

location

salaryExpectation

jobUrl

contactPerson

applicationDate

status

notes

createdAt

updatedAt

userId

```



\---



\# 8. Entity Relationships



```text

User

&#x20;│

&#x20;│ 1

&#x20;│

&#x20;│ N

&#x20;▼

JobApplication

```



A single user may own multiple job applications.



Each application belongs to exactly one user.



\---



\# 9. Authentication Architecture



CareerTrack uses JWT Authentication.



Flow:



```text

User Login

&#x20;    │

&#x20;    ▼

Validate Credentials

&#x20;    │

&#x20;    ▼

Generate JWT

&#x20;    │

&#x20;    ▼

Return Token

```



Subsequent requests:



```text

Request

&#x20;    │

&#x20;    ▼

JWT Filter

&#x20;    │

&#x20;    ▼

Token Validation

&#x20;    │

&#x20;    ▼

Protected Endpoint

```



\---



\# 10. Authorization Strategy



Version 1.0 supports:



ROLE\_USER



Future versions may introduce:



ROLE\_ADMIN



Current policy:



Users may access only their own resources.



\---



\# 11. API Design Principles



The API follows REST conventions.



Examples:



```http

GET /api/applications



GET /api/applications/{id}



POST /api/applications



PUT /api/applications/{id}



DELETE /api/applications/{id}

```



\---



\# 12. Validation Strategy



Validation is performed using Bean Validation.



Examples:



\* NotBlank

\* Email

\* Size

\* Positive



Validation occurs before business logic execution.



\---



\# 13. Error Handling



Global exception handling will be implemented.



Standardized error response:



```json

{

&#x20; "timestamp": "2026-06-09T12:00:00",

&#x20; "status": 404,

&#x20; "error": "Not Found",

&#x20; "message": "Application not found"

}

```



Benefits:



\* Consistency

\* Easier debugging

\* Better client integration



\---



\# 14. Logging Strategy



Initial logging:



\* Authentication attempts

\* Application creation

\* Application updates

\* Critical failures



Framework:



\* SLF4J

\* Logback



\---



\# 15. Security Principles



Passwords:



\* BCrypt hashing



Authentication:



\* JWT



Authorization:



\* Resource ownership validation



Sensitive information:



\* Never exposed in API responses



\---



\# 16. Scalability Considerations



Future enhancements:



\* Docker

\* Flyway migrations

\* Redis caching

\* Email notifications

\* AI integrations

\* Analytics engine



The current architecture is designed to support these additions without major restructuring.



\---



\# 17. Architecture Decisions



\### AD-001



Use monolithic architecture.



Reason:



\* Faster MVP delivery

\* Simpler deployment

\* Easier maintenance



\---



\### AD-002



Use PostgreSQL.



Reason:



\* Reliability

\* Strong relational support

\* Industry adoption



\---



\### AD-003



Use React for frontend.



Reason:



\* High market demand

\* Large ecosystem

\* Resume value



\---



\### AD-004



Use JWT authentication.



Reason:



\* Stateless architecture

\* Industry standard

\* Easy frontend integration



\---



\# 18. MVP Architecture Boundary



Included:



✓ Authentication



✓ Job Applications



✓ Dashboard Metrics



✓ Search



✓ Filtering



✓ REST API



Excluded:



✗ AI Features



✗ Mobile Application



✗ Notifications



✗ Resume Builder



✗ External Integrations



These features will be evaluated after MVP validation.



