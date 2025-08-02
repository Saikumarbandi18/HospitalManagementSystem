# Hospital Management Application

A comprehensive Spring Boot REST API for managing hospital operations including patients, doctors, appointments, and billing.

## Features

- **Patient Management**: CRUD operations for patient records
- **Doctor Management**: CRUD operations for doctor profiles
- **Appointment Management**: Schedule and manage patient appointments
- **Billing System**: Generate and manage patient bills
- **RESTful API**: Complete REST API with proper HTTP status codes
- **Database Integration**: MySQL database with JPA/Hibernate
- **Error Handling**: Comprehensive error handling and logging

## Technology Stack

- **Backend**: Spring Boot 3.5.4
- **Database**: MySQL
- **ORM**: Spring Data JPA with Hibernate
- **Build Tool**: Maven
- **Java Version**: 17
- **Lombok**: For reducing boilerplate code

## Prerequisites

- Java 17 or higher
- MySQL 8.0 or higher
- Maven 3.6 or higher

## Database Setup

1. Create a MySQL database named `hospital_db`:
```sql
CREATE DATABASE hospital_db;
```

2. Update the database configuration in `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost/hospital_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## Running the Application

1. Clone the repository
2. Navigate to the project directory
3. Run the application:
```bash
mvn spring-boot:run
```

The application will start on port 1011.

## API Documentation

### Base URL
```
http://localhost:1011/api/v1
```

### 1. Patient Management

#### Get All Patients
```http
GET /patients
```

#### Get Patient by ID
```http
GET /patients/{id}
```

#### Create Patient
```http
POST /patients
Content-Type: application/json

{
    "name": "John Doe",
    "gender": "Male",
    "age": 35
}
```

#### Update Patient
```http
PUT /patients/{id}
Content-Type: application/json

{
    "name": "John Doe Updated",
    "gender": "Male",
    "age": 36
}
```

#### Delete Patient
```http
DELETE /patients/{id}
```

### 2. Doctor Management

#### Get All Doctors
```http
GET /doctors
```

#### Get Doctor by ID
```http
GET /doctors/{id}
```

#### Create Doctor
```http
POST /doctors
Content-Type: application/json

{
    "name": "Dr. Smith",
    "speciality": "Cardiology"
}
```

#### Update Doctor
```http
PUT /doctors/{id}
Content-Type: application/json

{
    "name": "Dr. Smith Updated",
    "speciality": "Neurology"
}
```

#### Delete Doctor
```http
DELETE /doctors/{id}
```

### 3. Appointment Management

#### Get All Appointments
```http
GET /appointments
```

#### Get Appointment by ID
```http
GET /appointments/{id}
```

#### Create Appointment
```http
POST /appointments
Content-Type: application/json

{
    "patientid": 1,
    "doctorid": 1,
    "date": "2024-01-15"
}
```

#### Update Appointment
```http
PUT /appointments/{id}
Content-Type: application/json

{
    "patientid": 1,
    "doctorid": 2,
    "date": "2024-01-20"
}
```

#### Delete Appointment
```http
DELETE /appointments/{id}
```

### 4. Bill Management

#### Get All Bills
```http
GET /bills
```

#### Get Bill by ID
```http
GET /bills/{id}
```

#### Create Bill
```http
POST /bills
Content-Type: application/json

{
    "patientid": 1,
    "amount": 150.00,
    "status": "Pending"
}
```

#### Update Bill
```http
PUT /bills/{id}
Content-Type: application/json

{
    "patientid": 1,
    "amount": 200.00,
    "status": "Paid"
}
```

#### Delete Bill
```http
DELETE /bills/{id}
```

## HTTP Status Codes

- `200 OK`: Request successful
- `201 Created`: Resource created successfully
- `204 No Content`: Resource deleted successfully
- `404 Not Found`: Resource not found
- `500 Internal Server Error`: Server error

## Project Structure

```
src/main/java/com/HMA/
├── Controller/          # REST Controllers
│   ├── PatientController.java
│   ├── DoctorController.java
│   ├── AppointmentController.java
│   └── BillController.java
├── Service/            # Business Logic Layer
│   ├── PatientService.java
│   ├── DoctorService.java
│   ├── AppointmentService.java
│   └── BillService.java
├── Repository/         # Data Access Layer
│   ├── PatientRepository.java
│   ├── DoctorRepository.java
│   ├── AppointmentRepository.java
│   └── BillRepository.java
├── models/            # Entity Classes
│   ├── Patient.java
│   ├── Doctor.java
│   ├── Appointment.java
│   └── Bill.java
└── HospitalManagementAppApplication.java
```

## Testing the API

You can test the API using tools like:
- Postman
- cURL
- Any REST client

### Example cURL Commands

#### Create a Patient
```bash
curl -X POST http://localhost:1011/api/v1/patients \
  -H "Content-Type: application/json" \
  -d '{
    "name": "John Doe",
    "gender": "Male",
    "age": 35
  }'
```

#### Get All Patients
```bash
curl -X GET http://localhost:1011/api/v1/patients
```

#### Create a Doctor
```bash
curl -X POST http://localhost:1011/api/v1/doctors \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Dr. Smith",
    "speciality": "Cardiology"
  }'
```

## Error Handling

The application includes comprehensive error handling:
- Resource not found exceptions
- Database connection errors
- Validation errors
- Proper HTTP status codes
- Detailed logging

## Logging

The application uses SLF4J with Logback for logging. Logs include:
- Service layer operations
- Error messages with stack traces
- Database operations
- API request/response information

## Future Enhancements

- Authentication and Authorization
- Input validation
- API documentation with Swagger
- Unit and integration tests
- Docker containerization
- Frontend application
- Email notifications
- Report generation

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests if applicable
5. Submit a pull request

## License

This project is licensed under the MIT License. 