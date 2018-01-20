# Project Title

The Simple Web App

## Getting Started

These instructions will get you a short introduce how to build and runn on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software and how to install them

```
FontEnd:
* Node JS 
* download here https://nodejs.org/en/
* Angular cli
* refer here https://cli.angular.io/
```

```
Backend:
* Maven Lastest version 3.5.2
* download here: https://maven.apache.org/download.cgi
```

```
Database:
* Mysql 5.7.21
* download here: https://maven.apache.org/download.cgi
```

### Install

```
Install Node JS
Install Angular cli
Install Maven
Install Mysql Server
Run sql script to create the schema
```

### Configuration

```
You MUST update the username and password of your database.
You can find the configuration in application.properties file.

This is the default value.
spring.datasource.url=jdbc:mysql://localhost:3306/achoodb?useSSL=false
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=password
```

### Build

```
Run this command to build:
mvn clean install
```

## Deployment

```
The application will be run with a single command
mvn spring-boot:run
```