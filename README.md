HRMS (Human Resource Management System)
=======================================

HRMS is a web application for managing human resources in a company. The system provides features for both job seekers and employers. Job seekers can create profiles, apply for jobs, and get updates on their applications. Employers can post job openings, view applicant profiles, and manage the hiring process.

Technologies Used
-----------------

*   Java 11
*   Spring Boot 2.5.5
*   PostgreSQL 13.4
*   Maven
*   Hibernate
*   JPA
*   Swagger
*   Lombok

Features
--------

### For Job Seekers

*   Create a profile with personal information
*   Search for jobs by keyword, location, and category
*   Apply for job openings
*   Get updates on job applications
*   View application history

### For Employers

*   Create a company profile
*   Post job openings with job descriptions and requirements
*   View applicant profiles and resumes
*   Manage the hiring process with interview scheduling and candidate feedback

Getting Started
---------------

### Prerequisites

*   Java 11
*   PostgreSQL 13.4
*   Maven

### Installing

1.  Clone the repository to your local machine.
2.  Open the project in your preferred IDE.
3.  Configure the PostgreSQL database settings in the `application.properties` file.
4.  Run the application using Maven.

### Running the Tests

To run the unit tests, use the following command:

bashCopy code

`mvn test`

API Documentation
-----------------

The API documentation is available using Swagger. To access the documentation, run the application and go to `http://localhost:8080/swagger-ui.html` in your browser.

Authors
-------

*   Umıt Sınanoglu

License
-------

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
