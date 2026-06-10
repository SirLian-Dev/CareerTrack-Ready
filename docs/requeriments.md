\# CareerTrack - Requirements Specification



\## Document Information



| Field        | Value            |

| ------------ | ---------------- |

| Project      | CareerTrack      |

| Version      | 0.1              |

| Status       | Draft            |

| Author       | CareerTrack Team |

| Last Updated | June 2026        |



\---



\# 1. Introduction



\## 1.1 Purpose



This document defines the functional and non-functional requirements for the CareerTrack platform.



CareerTrack is designed to help job seekers organize and monitor their job search process through a centralized dashboard.



The goal of the MVP is to provide a simple, reliable, and efficient solution for tracking job applications.



\---



\## 1.2 Project Scope



The MVP will focus exclusively on:



\* User registration

\* User authentication

\* Job application management

\* Application status tracking

\* Dashboard statistics



Features such as AI integration, resume generation, interview preparation, notifications, and mobile applications are explicitly excluded from the MVP.



\---



\# 2. User Roles



\## 2.1 Standard User



A standard user can:



\* Register an account

\* Authenticate into the system

\* Manage personal job applications

\* View statistics related to their job search



\---



\# 3. Functional Requirements



\## FR-001 User Registration



The system shall allow a new user to create an account.



Acceptance Criteria:



\* User provides name, email and password.

\* Email must be unique.

\* Password must be securely stored.



\---



\## FR-002 User Authentication



The system shall allow registered users to authenticate using email and password.



Acceptance Criteria:



\* Valid credentials return an authentication token.

\* Invalid credentials return an error message.



\---



\## FR-003 Create Job Application



The system shall allow users to create job applications.



Required Fields:



\* Company Name

\* Position

\* Status



Optional Fields:



\* Location

\* Salary Expectation

\* Job URL

\* Notes



Acceptance Criteria:



\* Application is associated with the authenticated user.

\* Application is persisted successfully.



\---



\## FR-004 View Applications



The system shall allow users to retrieve all their applications.



Acceptance Criteria:



\* Users can only view their own applications.

\* Results are ordered by creation date.



\---



\## FR-005 View Application Details



The system shall allow users to view a specific application.



Acceptance Criteria:



\* Application exists.

\* Application belongs to the authenticated user.



\---



\## FR-006 Update Application



The system shall allow users to update application information.



Editable Fields:



\* Position

\* Status

\* Location

\* Salary Expectation

\* Notes

\* Job URL



Acceptance Criteria:



\* Changes are persisted successfully.



\---



\## FR-007 Delete Application



The system shall allow users to delete an application.



Acceptance Criteria:



\* Deleted applications cannot be retrieved afterwards.



\---



\## FR-008 Dashboard Summary



The system shall provide a dashboard summary.



Dashboard Metrics:



\* Total Applications

\* Applications In Review

\* Interviews

\* Offers

\* Rejections

\* Hired



Acceptance Criteria:



\* Metrics are calculated using user-owned data only.



\---



\## FR-009 Search Applications



The system shall allow users to search applications.



Searchable Fields:



\* Company Name

\* Position



\---



\## FR-010 Filter Applications



The system shall allow users to filter applications by status.



Supported Statuses:



\* SAVED

\* APPLIED

\* IN\_REVIEW

\* INTERVIEW

\* TECHNICAL\_TEST

\* OFFER

\* REJECTED

\* HIRED



\---



\# 4. Business Rules



\## BR-001



Each application belongs to exactly one user.



\## BR-002



A user can own multiple applications.



\## BR-003



Email addresses must be unique.



\## BR-004



Users may only access their own data.



\## BR-005



Application status must belong to the predefined status catalog.



\---



\# 5. Non-Functional Requirements



\## NFR-001 Security



The system shall use JWT authentication.



\---



\## NFR-002 Performance



The system shall respond to standard API requests in under 2 seconds under normal load.



\---



\## NFR-003 Scalability



The architecture shall support future feature expansion without requiring major redesign.



\---



\## NFR-004 Maintainability



The codebase shall follow a layered architecture:



\* Controller

\* Service

\* Repository



\---



\## NFR-005 Data Integrity



All persistent data shall be stored in PostgreSQL.



\---



\## NFR-006 API Standards



The API shall follow RESTful principles.



\---



\# 6. Out of Scope



The following features are intentionally excluded from the MVP:



\* AI features

\* Resume generation

\* Interview preparation

\* Mobile application

\* Push notifications

\* Email notifications

\* Job board integrations

\* Social login

\* Multi-language support

\* Payment processing



\---



\# 7. Future Features



Planned after MVP validation:



\* Resume Builder

\* Career Analytics

\* AI Career Assistant

\* Interview Tracker

\* Calendar Integration

\* LinkedIn Integration

\* Premium Subscription

\* Export to PDF

\* Portfolio Builder



\---



\# 8. Success Criteria



The MVP will be considered successful when users can:



\* Create accounts

\* Manage applications

\* Track application progress

\* Visualize statistics

\* Use CareerTrack without relying on spreadsheets



\---



\# 9. MVP Definition



Version 1.0 includes:



✓ Authentication



✓ Job Application CRUD



✓ Dashboard Metrics



✓ Search and Filtering



✓ PostgreSQL Persistence



✓ JWT Security



Any additional functionality will be scheduled for future releases.



