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
| ![architecture diagram of spring boot](https://github.com/user-attachments/assets/ebd2c91b-7e42-4a81-987e-44250a5a4a8c) |
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
![Screenshot (89)](https://github.com/user-attachments/assets/d3757c7c-7600-4741-bb89-24c55f1edc72)
![Screenshot (90)](https://github.com/user-attachments/assets/786d712f-d211-420c-a189-e04061bfca7c)
![Screenshot (94)](https://github.com/user-attachments/assets/a84cf876-24fc-4e4d-a9d4-c5a9b670c75b)
![Screenshot (92)](https://github.com/user-attachments/assets/a2e8a047-e1ad-494c-a939-23dc9d38abf6)
![Screenshot (93)](https://github.com/user-attachments/assets/5ec06a9c-3e89-423e-ac7b-56320fc6fd6e)
![Screenshot (95)](https://github.com/user-attachments/assets/8dcc7de7-eb56-4a8b-b78c-291393f069a4)
![Screenshot (96)](https://github.com/user-attachments/assets/f64405c4-31a5-4140-881d-dae09b5d61cd)
![Screenshot (97)](https://github.com/user-attachments/assets/8939c020-ac7c-469a-8452-fe80c49bd486)
![Screenshot (98)](https://github.com/user-attachments/assets/9c231594-8efc-4efd-916b-872b326f2079)
![Screenshot (99)](https://github.com/user-attachments/assets/dfed3741-2140-4cc1-a295-ca8bcec6c59b)
