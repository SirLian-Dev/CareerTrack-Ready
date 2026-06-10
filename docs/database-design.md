# CareerTrack - Database Design

## Database

PostgreSQL

Version:

16+

---

# Entity Relationship Diagram

```text
User
 |
 | 1
 |
 | N
 |
JobApplication
```

---

# Table: users

## Description

Stores platform users.

---

## Columns

| Column     | Type         | Constraints     |
| ---------- | ------------ | --------------- |
| id         | BIGINT       | PK              |
| name       | VARCHAR(100) | NOT NULL        |
| email      | VARCHAR(255) | UNIQUE NOT NULL |
| password   | VARCHAR(255) | NOT NULL        |
| created_at | TIMESTAMP    | NOT NULL        |
| updated_at | TIMESTAMP    | NOT NULL        |

---

## Indexes

```sql
CREATE UNIQUE INDEX idx_users_email
ON users(email);
```

---

# Table: job_applications

## Description

Stores job applications created by users.

---

## Columns

| Column             | Type          | Constraints |
| ------------------ | ------------- | ----------- |
| id                 | BIGINT        | PK          |
| company_name       | VARCHAR(255)  | NOT NULL    |
| position           | VARCHAR(255)  | NOT NULL    |
| location           | VARCHAR(255)  | NULL        |
| salary_expectation | DECIMAL(12,2) | NULL        |
| job_url            | VARCHAR(1000) | NULL        |
| contact_person     | VARCHAR(255)  | NULL        |
| application_date   | DATE          | NOT NULL    |
| status             | VARCHAR(50)   | NOT NULL    |
| notes              | TEXT          | NULL        |
| created_at         | TIMESTAMP     | NOT NULL    |
| updated_at         | TIMESTAMP     | NOT NULL    |
| user_id            | BIGINT        | FK NOT NULL |

---

## Foreign Key

```sql
ALTER TABLE job_applications
ADD CONSTRAINT fk_application_user
FOREIGN KEY (user_id)
REFERENCES users(id);
```

---

# Status Enumeration

```java
SAVED
APPLIED
IN_REVIEW
INTERVIEW
TECHNICAL_TEST
OFFER
REJECTED
HIRED
```

---

# Indexes

Applications by User

```sql
CREATE INDEX idx_application_user
ON job_applications(user_id);
```

Applications by Status

```sql
CREATE INDEX idx_application_status
ON job_applications(status);
```

Applications by Company

```sql
CREATE INDEX idx_application_company
ON job_applications(company_name);
```

---

# JPA Relationship

User:

```java
@OneToMany(mappedBy = "user")
private List<JobApplication> applications;
```

JobApplication:

```java
@ManyToOne
@JoinColumn(name = "user_id")
private User user;
```

---

# Auditing Fields

Every entity should contain:

```java
private LocalDateTime createdAt;
private LocalDateTime updatedAt;
```

Purpose:

* Traceability
* Analytics
* Future reporting

---

# Future Tables (Not MVP)

Interview

```text
id
date
type
notes
application_id
```

Resume

```text
id
title
file_path
user_id
```

Notification

```text
id
message
status
user_id
```

These tables are intentionally excluded from Version 1.0.
