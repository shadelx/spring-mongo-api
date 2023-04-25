# Spring boot todo-app

This is a REST API using spring-boot backend and mongoDB database 

## Installation
For this project we use the next commands

```
 mvn spring-boot:run
```

This project use cloud mongoDB, so in order to make the connection you need to change the "applications.properties" file as the next example
create file in directory "/src/main/resources/application.properties"
```
server.port = 8090
spring.data.mongodb.uri=mongodb+srv://<your-user>:<your-password>@<collection-name>.akldyfb.mongodb.net/<name-database>?retryWrites=true&w=majority
```
## Dependencies
* Spring Boot
* Spring Web
* Lombok
* Spring boot dev tools
* Spring Data MongoDB

## Server 

### Routes

* /api//addUser
* /api/getAllUser
* /api/todo (CRUD)