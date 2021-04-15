# group-34-spring-batch
Spring Boot Batch project to convert CSV to Database

# Spring Boot Batch Application Project [![Build Status](https://raheenulhasan.github.io/group-34-spring-batch/)]

## Table of Contents

  * Purpose
  * [Tech stack & Open-source libraries](#tech-stack---open-source-libraries)
    + [Data](#data)
    + [Server - Backend](#server---backend)
    + [Build Tools](#build)
    + [External Tools & Services](#external-tools---services)

## Purpose

This is a Spring Boot Batch application to process data from a CSV file. The business logic of this application transforms the data and persists the same in the Database.
The application creates Job and Step Factory to build the job and execute it.

## Tech stack & Open-source libraries

### Data

* 	CSV : Comma Separated Value File
* 	[H2 Database Engine](https://www.h2database.com/html/main.html) - Java SQL database. Embedded and server modes; in-memory databases

### Server - Backend

* 	[JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard Edition Development Kit
* 	[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications

### Build Tools

* 	[Maven](https://maven.apache.org/) - Dependency Management

### External Tools & Services

* 	[Eclipse](https://www.eclipse.org/) - IDE for Java projects


## To-Do

* 	[x] Logger (Console, File)
* 	[x] [Spring Security](https://spring.io/projects/spring-security) RBAC, Session Timeout
* 	[x] [Spring Profiles](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-profiles) (dev, production, qa, staging, test)
* 	[x] [Docker](https://www.docker.com/)
* 	[x] Software documentation - [Swagger](https://swagger.io/), [Javadoc](https://en.wikipedia.org/wiki/Javadoc), [Postman Collection](https://www.postman.com/collection/)
*   [ ] Unit Tests, Integration Tests
* 	[ ] Shut down app on button click via actuator url 
* 	[ ] Spring Boot Admin
* 	[ ] NoSQL (MongoDB)


