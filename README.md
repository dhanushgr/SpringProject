### Spring Boot REST API with PostgreSQL

This project demonstrates various REST API methods (GET, PUT, POST, DELETE) using Java's Spring Boot framework and PostgreSQL database.

Tech stack: Java Spring Boot 3, PostgreSQL database, JPA (Java Persistence API)\
Tools used: Postman, PgAdmin Postgresql database console, IDE (Intellij or VSCode or Eclipse)

Please refer to the [Steps to run](#steps-to-run) section for instruction on how to clone and run this application. 

### REST API Method Table
```
| Number | API Name              | HTTP Method | Path                        | Status Code    | Additional details                    |
|--------|-----------------------|-------------|-----------------------------|----------------|---------------------------------------|
| 1      | GET load              | GET         | /load                       | 200 OK         | All load details are retrieved        |
| 2      | POST load             | POST        | /load                       | 201 Created    | A new load is created                 |
| 3      | GET load by Id        | GET         | /load/{id}                  | 200 OK         | Specific load is fetched by Id        |
| 4      | GET load by shipperId | GET         | /load/shipperId/{shipperID} | 200 OK         | Specific load is fetched by shipperId |
| 5      | PUT load              | PUT         | /load/{id}                  | 200 OK         | Specific load is updated              |
| 6      | DELETE load           | DELETE      | /load/{id}                  | 204 No Content | Specific load is deleted              |
```

### Spring Boot Architecture
| ![springBootArchitectureDiagram](https://github.com/user-attachments/assets/ee451bff-6e9d-40df-ae01-620069500072) |
|:--:| 
| *Architecture of Spring Boot Framework* |


### Version details:
The versions can be found in the file `pom.xml`. You can update the versions in pom.xml [here](https://github.com/dhanushgr/SpringBoot-LoadsAPI/blob/main/pom.xml).

* Java version: 21
* Spring boot version: 3.3.2
* JPA version: 3.2.5
* Postgresql version: 42.7.3

### Steps to run

1. Clone this git repository to your local computer
```commandline
git clone git@github.com:dhanushgr/SpringBoot-LoadsAPI.git
```
2. PostgreSQL Database setup:
* Make sure that you have "PostgreSQL pgadmin" and "Postman" installed in your system. You can search in Google for the installation steps. 
* Open Pgadmin (PostgreSQL console) and create a new database called `LoadAPI` in your Pgadmin console. You can search in Google for "How to create database in postgresql pgadmin"
* Default port of PostgreSQL is `5432`. If there is a port conflict (port already in use), then you need to update the postgresql port in `spring.datasource.url` present in the file `src/main/resources/application.properties`:
  https://github.com/dhanushgr/SpringBoot-LoadsAPI/blob/main/src/main/resources/application.properties#L4
3. Open the project `SpringBoot-LoadsAPI` using your IDE (Intellij or VSCode or Eclipse etc.)
4. In the IDE, navigate to `src/main/java/com/dhanush/springproject/SpringprojectApplication.java`
5. Right click on `SpringprojectApplication.java` and click on `Run`
6. Open Postman and then try out various REST API methods (GET, PUT, POST, DELETE). Alternatively, you can use `curl` command instead of Postman.
7. You can verify the data present by running `SELECT` SQL queries in PostgreSQL pgadmin console.

### Example screenshots

GET request for empty database :
![Screenshot (106)](https://github.com/user-attachments/assets/1667df03-3b32-4cba-9682-54245f6a410c)
Empty database :
![Screenshot (105)](https://github.com/user-attachments/assets/f52abeab-9d67-4eb7-9800-533db485b67e)
POST request to add load detail(with comment) :
![Screenshot (107)](https://github.com/user-attachments/assets/4e4ab291-c4bf-47f8-a2e4-1b557ff90907)
posted detail in database :
![Screenshot (108)](https://github.com/user-attachments/assets/3b49139f-9ff0-48d6-af4f-4d749522b029)
POST request to add load detail(without comment) :
![Screenshot (109)](https://github.com/user-attachments/assets/c1c4df7a-cfa2-4bef-9f4b-ee0742dbf8d2)
posted detail in database :
![Screenshot (110)](https://github.com/user-attachments/assets/b9eb61e4-e0fe-4967-abbb-1bcc19aa644d)
posted two more data in database :
![Screenshot (111)](https://github.com/user-attachments/assets/f8c323fd-fcb1-4081-aae5-7bfae9af922f)
GET /load : shows all the details
![Screenshot (112)](https://github.com/user-attachments/assets/b341bd7e-0987-403b-b72c-0e56b4b9090d)
GET /load/{id} :
![Screenshot (113)](https://github.com/user-attachments/assets/0acaf466-a579-47ff-ba1c-6849a5f0d715)
GET /load/shipperId/{shipperId} :
![Screenshot (114)](https://github.com/user-attachments/assets/b8f56995-5a6c-4c03-bcfe-87e99aedb4bd)
PUT /load/{id} :
![Screenshot (115)](https://github.com/user-attachments/assets/73ce9225-b5fb-4719-b5a5-9fbed7d41182)
PUT /load/{id} updated in database :
![Screenshot (116)](https://github.com/user-attachments/assets/91b5a052-456e-4028-89e6-42dda078762d)
Exception handling for PUT request:
![Screenshot (117)](https://github.com/user-attachments/assets/94c980a5-54f6-45f1-8006-bb00e214f98f)
Exception handling for GET request(/load/{id}): NOT_FOUND
![Screenshot (118)](https://github.com/user-attachments/assets/82927566-91c8-48ae-ae8a-6a74ac64d66b)
Exception handling for GET request(/load/shipperId/{shipperId}): INTERNAL_SERVER_ERROR
![Screenshot (119)](https://github.com/user-attachments/assets/9ad6a29e-be7b-43ab-81a3-527c4be0483a)
DELETE request /load/{id}:
![Screenshot (121)](https://github.com/user-attachments/assets/34fb8b05-789f-48b7-a142-7ec5193e9985)
deleted the specific load detail for given id:
![Screenshot (122)](https://github.com/user-attachments/assets/78e61815-c149-494b-94de-44ac6e8c23a8)

