# Spring Boot Application Template/Starter-Project [Java-Backend-Test]

The only thing better than a Maven archetype is a repo you can fork with everything already setup. Skip the documentation and just fork-and-code. 

Delete the sample code, replace with your own and you’re good to go.

## Requirements

We need new registration service for mobile application. Please provide JAVA Restful API for user to register and get user information after registration. Try your best to deliver 2 API services with security (access token, encryption, etc.)
and testability (test cases).

Submit source code on GIT control with document (design, description.
installation guide, usage, etc.)

Please design data for registration process (username, password, address, phone, etc.,) and keep it in SQL database for retrieval. Please also implement business logic below.
- Register process has to generate reference code from register date and last 4 digits of phone number like this "YYYYMMDDXXXX" (ex. 201708154652) and keep it in database.
- Member type classify from salary
   - Platinum (salary > 50,000 baht)
   - Gold (salary between 30,000 to 50,000)
   - Silver (salary < 30,000)
- Reject if salary < 15,000 with error code (please define error code)

Your code must run and work properly. Provide us GIT access and installation step.

Prefer tools (just is a plus with this tool)
- Java Spring Boot
- Mockito
- JWT


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard Edition Development Kit 
* [Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* [PostgreSQL](https://www.postgresql.org) - Open-Source Object Relational Database System
* [git](https://git-scm.com/) - Free and Open-Source distributed version control system 
* [Thymeleaf](https://www.thymeleaf.org/) - Modern server-side Java template engine for both web and standalone environments.
* [Postman](https://www.getpostman.com/) - API Development Environment (Testing Docmentation)
* [Lombok](https://projectlombok.org/) - Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.
* [Swagger](https://swagger.io/) - Open-Source software framework backed by a large ecosystem of tools that helps developers design, build, document, and consume RESTful Web services.
	
## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.krungsri.kma.api.KrungsriApiDemoApplication` class from your IDE.

- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Documentation

* [Postman Collection](https://documenter.getpostman.com/view/5627328/SVtPXVu9) - online, with code auto-generated snippets in cURL, jQuery, Ruby,Python Requests, Node, PHP and Go programming languages
* [Swagger](http://localhost:8088/swagger-ui.html) - Documentation & Testing

## packages

- `entities` — to hold our entities;
- `repositories` — to communicate with the database;
- `services` — to hold our business logic;
- `controllers` — to listen to the client;

- `resources/` - Contains all the static resources, templates and property files.
- `resources/static` - contains static resources such as css, js and images.
- `resources/templates` - contains server-side templates which are rendered by Spring.
- `resources/application.properties` - It contains application-wide properties. Spring reads the properties defined in this file to configure your application. You can define server’s default port, server’s context path, database URLs etc, in this file.

- `test/` - contains unit and integration tests

- `pom.xml` - contains all the project dependencies

## Resources

* [My API Lifecycle Checklist and Scorecard](https://dzone.com/articles/my-api-lifecycle-checklist-and-scorecard)
* [Spring Security](https://spring.io/projects/spring-security)
* [HTTP Status Codes](https://www.restapitutorial.com/httpstatuscodes.html)
* [Common application properties](https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html)
* [JSON Web Tokens:JWT](https://jwt.io/)
* [Mockito](https://site.mockito.org/)
