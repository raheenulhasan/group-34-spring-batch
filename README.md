# group-34-spring-batch
Spring Boot Batch project to convert CSV to Database

# Spring Boot Batch Application Project

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

## Running the application locally

*	Default active profile is **`test`**.
*	In the **`test`** profile, the application uses **H2** database (data in memory).

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
```

URL to kickstart the application from Browser : ##http://localhost:8081/load


### Running the application with IDE

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the springbootapplication class from your IDE.

* 	Download the zip or clone the Git repository.
* 	Unzip the zip file (if you downloaded one)
* 	Open Command Prompt and Change directory (cd) to folder containing pom.xml
* 	Open Eclipse
	* File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
	* Select the project
* 	Choose the Spring Boot Application file (search for @SpringBootApplication)
* 	Right Click on the file and Run as Java Application


### Running the application with Maven

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
$ git clone https://github.com/raheenulhasan/group-34-spring-batch.git
$ cd Spring-Boot-Application-Template
$ mvn spring-boot:run
```

### Running the application with Executable JAR

The code can also be built into a jar and then executed/run. Once the jar is built, run the jar by double clicking on it or by using the command 

```shell
$ git clone https://github.com/raheenulhasan/group-34-spring-batch.git
$ cd Spring-Boot-Application-Template
$ mvn package -DskipTests
$ java -jar target/SpringBootCSV-0.0.1-SNAPSHOT.jar --spring.profiles.active=test
```

To shutdown the jar, follow the below mentioned steps on a Windows machine.

*	In command prompt execute the **jcmd** command to print a list of all running Java processes
*	**Taskkill /PID PROCESS_ID_OF_RUNNING_APP /F** execute this command by replacing the **PROCESS_ID_OF_RUNNING_APP** with the actual process id of the running jar found out from executing the previous command


### Accessing Data in H2 Database

#### H2 Console

URL to access H2 console: **https://localhost:8080/h2-console/login.jsp** or **https://192.168.99.102:8080/h2-console/login.jsp**

Fill the login form as follows and click on Connect:

* 	Saved Settings: **Generic H2 (Embedded)**
* 	Setting Name: **Generic H2 (Embedded)**
* 	Driver class: **org.h2.Driver**
* 	JDBC URL: **jdbc:h2:mem:sbat;MODE=MySQL**
* 	User Name: **sa**
* 	Password:


## Directory Structure

C:.
│   .classpath
│   .gitignore
│   .project
│   LICENSE
│   mvnw
│   mvnw.cmd
│   pom.xml
│   README.md
│
├───.settings
│       org.eclipse.core.resources.prefs
│       org.eclipse.jdt.core.prefs
│       org.hibernate.eclipse.console.prefs
│
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───techprimers
│   │   │           └───springbatchexample1
│   │   │               │   SpringBatchExample1Application.java
│   │   │               │
│   │   │               ├───batch
│   │   │               │       DBWriter.java
│   │   │               │       Processor.java
│   │   │               │
│   │   │               ├───config
│   │   │               │       SpringBatchConfig.java
│   │   │               │
│   │   │               ├───controller
│   │   │               │       LoadController.java
│   │   │               │
│   │   │               ├───model
│   │   │               │       User.java
│   │   │               │
│   │   │               └───repository
│   │   │                       UserRepository.java
│   │   │
│   │   └───resources
│   │           application.properties
│   │           users.csv
│   │
│   └───test
│       └───java
│           └───com
│               └───techprimers
│                   └───springbatchexample1
│                           SpringBatchExample1ApplicationTests.java
│
└───target
    ├───classes
    │   │   .gitignore
    │   │
    │   └───META-INF
    │           MANIFEST.MF
    │
    └───test-classes
