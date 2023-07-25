# SpringMavenProjectWithMongoDB

Implemented an API endpoint for CRUD Operation With MongoDB to Employee Management details in database.

Step 1: Clone the Repository
Step 2: Configure MongoDB
Step 3: Build the Project
Step 4: Run the Application

Prerequisites
Java Development Kit (JDK) 11 or higher
Apache Maven
MongoDB (installed and running)

Getting Started
Follow these steps to set up and run the project locally.

Step 1: Clone the Repository
bash
Copy code
git clone <repository-url>
cd project-name

Step 2: Configure MongoDB
Ensure that MongoDB is installed and running. You can configure the MongoDB connection settings in the application.properties file located at src/main/resources.
properties
Copy code
spring.data.mongodb.uri=mongodb://localhost:27017/employee_db
Replace localhost with your MongoDB server's address and db-name with the desired database name.

Step 3: Build the Project
bash
Copy code
mvn clean package

Step 4: Run the Application
bash
Copy code
mvn spring-boot:run
The application will start on a local server, and you can access it at http://localhost:8080.

Usage
You have to firstly installed all Prerequisites. Then you can follow 1 and 2 steps after that you have to run that application through your choice like postman, as well as you can use Thunder Client to use API Endpoints to Save that that get all data, get by id, delete by id, and update by id.

Endpoints
POST : http://localhost:8080/employees/save ---> After Save it return the employee id. This will save record to the MongoDB Database.
JSON FILE FOR THIS : 
{
  "id": 101,
  "employeeName": "Priti Garad",
  "phoneNumber": "7499182008",
  "email": "pritigarad30@gmail.com",
  "reportsTo": 1,
  "profileImage": "priti.jpg"
}

GET : http://localhost:8080/employees/getall ---> For get all.
      http://localhost:8080/employees/getbyid/101 ---> get by id.

PUT : http://localhost:8080/employees/updatebyid/101 ---> it will update employee name, phoneno, email etc by id.

DELETE : http://localhost:8080/employees/deletebyid/101 ---> This will delete any return string with successful message.


Technologies Used
Spring Boot
Spring Data MongoDB
Maven
