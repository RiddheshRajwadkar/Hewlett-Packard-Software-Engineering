# Hewlett-Packard-Software-Engineering

This repository contains the implementation of a RESTful web service developed as part of the Hewlett Packard Enterprise Software Engineering Virtual Experience. The application manages employee data, allowing for adding and retrieving employee information.​

## Features
* Add new employees via HTTP POST requests.​

* Retrieve a list of all employees via HTTP GET requests.​

* In-memory storage of employee data using a simple list structure.​

* Unit tests implemented with JUnit 5 to ensure functionality.​

## Technologies Used
* Java 17​

* Spring Boot 3.4.2​

* Spring Web​

* Spring Data JPA​

* JUnit 5​

* Maven​

## Project Structure

```
Hewlett-Packard-Software-Engineering/
├── src/
│   ├── main/
│   │   └── java/com/Hewlett/Packard/Software/Engineering/
│   │       ├── Employee.java
│   │       ├── EmployeeController.java
│   │       ├── EmployeeManager.java
│   │       ├── EmployeeRepository.java
│   │       └── EmployeeApplication.java
│   └── test/
│       └── java/com/Hewlett/Packard/Software/Engineering/
│           └── EmployeeManagerTest.java
├── pom.xml
└── README.md
```

## Getting Started
### Prerequisites
* Java 17 installed​

* Maven installed

### Running the Application
Clone the repository:

```
git clone https://github.com/RiddheshRajwadkar/Hewlett-Packard-Software-Engineering.git
```
Navigate to the project directory:

```
cd Hewlett-Packard-Software-Engineering
```
Build and run the application using Maven:
```
mvn spring-boot:run
```

## API Endpoints
* Add Employee
  * URL: `/addEmployee​`

  * Method:POST

  * Request Body:
```
{
"first_name": "John",
"last_name": "Doe",
"email": "john.doe@example.com",
"title": "Software Engineer"
}
```

## Get All Employees

* URL: `/allEmployee`

* Method: GET

## Running Tests
Execute the following command to run unit tests:
```
mvn test
```
## Contributing
Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.​

## License
This project is licensed under the MIT License.