# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/maven-plugin/)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

1.create Student DB in Pgadm4 tool
https://www.postgresqltutorial.com/postgresql-create-database/ 

2. StudentEntity class: 
Mark class as @Entity and refer Db as @Table(name = "table name")
In model package --> For the entity class creating Default constructor is necessary
Generate getters and setters for all the columns in the table
Set annotations for all getter methods:
	For primary key in the table, 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	for other columns in the table,
	@Column(name="", nullable = false)
	
Exception Handling:
Spring Exception Handling using @ExceptionHandler(customException.class), @ControllerAdvice and HandlerExceptionResolver
 Notice that we can use @ResponseStatus annotation with exception classes to define the HTTP code 
 that will be sent by our application 
 when this type of exception is thrown by our application and handled by our exception handling implementations.
