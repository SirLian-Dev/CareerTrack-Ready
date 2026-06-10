\# CareerTrack - API Design



\## API Information



Base URL:



```http

/api

```



Response Format:



```json

{

&#x20; "success": true,

&#x20; "data": {},

&#x20; "message": "Operation completed successfully"

}

```



\---



\# Authentication Endpoints



\## Register User



Endpoint:



```http

POST /api/auth/register

```



Request:



```json

{

&#x20; "name": "Julian",

&#x20; "email": "julian@email.com",

&#x20; "password": "Password123"

}

```



Response:



```json

{

&#x20; "success": true,

&#x20; "message": "User registered successfully"

}

```



\---



\## Login User



Endpoint:



```http

POST /api/auth/login

```



Request:



```json

{

&#x20; "email": "julian@email.com",

&#x20; "password": "Password123"

}

```



Response:



```json

{

&#x20; "token": "jwt-token"

}

```



\---



\# Applications Endpoints



\## Create Application



Endpoint:



```http

POST /api/applications

```



Request:



```json

{

&#x20; "companyName": "OpenAI",

&#x20; "position": "Java Developer",

&#x20; "location": "Remote",

&#x20; "salaryExpectation": 3000,

&#x20; "jobUrl": "https://...",

&#x20; "contactPerson": "John Smith",

&#x20; "applicationDate": "2026-06-09",

&#x20; "status": "APPLIED",

&#x20; "notes": "Applied through LinkedIn"

}

```



Response:



```json

{

&#x20; "id": 1,

&#x20; "companyName": "OpenAI"

}

```



\---



\## Get All Applications



Endpoint:



```http

GET /api/applications

```



Response:



```json

\[

&#x20; {

&#x20;   "id": 1,

&#x20;   "companyName": "OpenAI",

&#x20;   "position": "Java Developer",

&#x20;   "status": "APPLIED"

&#x20; }

]

```



\---



\## Get Application By Id



Endpoint:



```http

GET /api/applications/{id}

```



\---



\## Update Application



Endpoint:



```http

PUT /api/applications/{id}

```



\---



\## Delete Application



Endpoint:



```http

DELETE /api/applications/{id}

```



Response:



```json

{

&#x20; "message": "Application deleted successfully"

}

```



\---



\# Dashboard Endpoints



\## Dashboard Summary



Endpoint:



```http

GET /api/dashboard/summary

```



Response:



```json

{

&#x20; "totalApplications": 50,

&#x20; "saved": 10,

&#x20; "applied": 20,

&#x20; "inReview": 8,

&#x20; "interviews": 5,

&#x20; "offers": 2,

&#x20; "rejected": 4,

&#x20; "hired": 1

}

```



\---



\# Search Endpoints



\## Search Applications



Endpoint:



```http

GET /api/applications/search?keyword=openai

```



\---



\## Filter Applications



Endpoint:



```http

GET /api/applications/filter?status=INTERVIEW

```



\---



\# Error Response Standard



```json

{

&#x20; "timestamp": "2026-06-09T20:30:00",

&#x20; "status": 404,

&#x20; "error": "Not Found",

&#x20; "message": "Application not found"

}

```



\---



\# HTTP Status Codes



| Code | Description           |

| ---- | --------------------- |

| 200  | Success               |

| 201  | Created               |

| 400  | Bad Request           |

| 401  | Unauthorized          |

| 403  | Forbidden             |

| 404  | Not Found             |

| 409  | Conflict              |

| 500  | Internal Server Error |



\---



\# API Security



Protected endpoints require:



```http

Authorization: Bearer <token>

```



Authentication Endpoints:



\* Register

\* Login



Public Access:



YES



All Other Endpoints:



Protected



