Spring Boot API with Keycloak Authentication and Authorization
This repository contains a Spring Boot API developed in Java 17 that integrates with Keycloak for authentication and authorization. The API provides endpoints for managing a portfolio application.

Features
Secure authentication and authorization using Keycloak
CRUD operations for managing portfolio items
Prerequisites
Before running the application, ensure you have the following installed:

Java 17
Maven
Keycloak (for authentication and authorization)
Configuration
Keycloak Setup
Create Realm:
Create a realm named HCL in your Keycloak instance.
Create Client:
Create a client named portfolio_api in the HCL realm.
Root URL:
Set the root URL of the client to http://localhost:8090.
Realm Role:
Create a realm role named customer_user.
Create User:
Under users, create a user named buddinipun and assign the customer_user role.
Application Configuration
Clone this repository:
bash
Copy code
git clone https://github.com/your_username/your_repository.git
Navigate to the project directory:
bash
Copy code
cd your_repository
Build the project using Maven:
Copy code
mvn clean install
Run the application:
bash
Copy code
java -jar target/your_application.jar
Usage
Access the API endpoints using a tool like Postman or cURL.
Authenticate using the credentials created in Keycloak.
API Endpoints
GET /api/portfolio: Retrieve all portfolio items.
GET /api/portfolio/{id}: Retrieve a specific portfolio item by ID.
POST /api/portfolio: Create a new portfolio item.
PUT /api/portfolio/{id}: Update a portfolio item.
DELETE /api/portfolio/{id}: Delete a portfolio item.
Contributing
Contributions are welcome! Feel free to open issues and pull requests.
