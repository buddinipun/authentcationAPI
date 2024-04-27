Spring Boot API with Keycloak Authentication and Authorization
This repository contains a Spring Boot API developed in Java 17 that integrates with Keycloak for authentication and authorization. The API provides endpoints for managing a portfolio application.
Features
•	Secure authentication and authorization using Keycloak
•	CRUD operations for managing portfolio items
Prerequisites
Before running the application, ensure you have the following installed:
•	Java 17
•	Maven
•	Keycloak (for authentication and authorization)
Configuration
Keycloak Setup
1.	Create Realm:
•	Create a realm named HCL in your Keycloak instance.
2.	Create Client:
•	Create a client named portfolio_api in the HCL realm.
3.	Root URL:
•	Set the root URL of the client to http://localhost:8090.
4.	Realm Role:
•	Create a realm role named customer_user.
5.	Create User:
•	Under users, create a user named buddinipun and assign the customer_user role.
Application Configuration
1.	Clone this repository:
bash
Copy code
git clone https://github.com/your_username/your_repository.git 
2.	Navigate to the project directory:
bash
Copy code
cd your_repository 
3.	Build the project using Maven:
Copy code
mvn clean install 
4.	Run the application:
bash
Copy code
java -jar target/your_application.jar 
Usage
•	Access the API endpoints using a tool like Postman or cURL.
•	Authenticate using the credentials created in Keycloak.
API Endpoints
•	GET /api/portfolio: Retrieve all portfolio items.
•	GET /api/portfolio/{id}: Retrieve a specific portfolio item by ID.
•	POST /api/portfolio: Create a new portfolio item.
•	PUT /api/portfolio/{id}: Update a portfolio item.
•	DELETE /api/portfolio/{id}: Delete a portfolio item.
