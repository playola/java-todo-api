# Java TODO API

Simple TODO API to `get`, `post`, and `delete` tasks to do. The project was bootstrapped using Spring Initializr [1].

## Start here:
```
git clone https://github.com/playola/java-todo-api.git

// Open IDE (Developed and tested using Eclipse IDE)

// File > Import ... > Gradle > Existing Gradle Project
```

## Build
```
cd java-todo-api

./gradlew build -info
```

## Documentation

### Annotations

#### A.1. @SpringBootApplication
@SpringBootApplication adds the following:
  - @Configuration: Tags the class as a source of bean definitions for the application context.
  - @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on property settings.
  - @EnableWebMvc: This flags the application as a web application and activates key behaviors (e.g. DispatcherServlet).
  - @ComponentScan: Tells Spring to look for other components, configurations, and services in 'todoclient' package.

#### A.2. @RequestMapping
@RequestMapping ensures that HTTP requests to /todos are mapped to the todoRepository.
By default, maps all HTTP operations. To narrow this mapping use: @RequestMapping(method = GET).

An alternative is to define specifically the method type using:
  - @GetMapping(): Reads a resource.
  - @PostMapping(): Create a new resource.
  - @PutMapping(): Update an existing resource.
  - @DeleteMapping(): Delete a resource.

#### A.3. @Entity
@Entity: Specifies that the class is an entity. An entity is...

#### A.4. @Table
@Table: TODO

#### A.5. @EntityListeners
@EntityListeners: TODO

#### A.6. @Id
@Id: TODO

#### A.7. @GeneratedValue
@GeneratedValue: TODO

#### A.8. @Repository
@Repository: Indicates that the decorated class is a repository. A repository is a mechanism of encapsulating storage, retrieval, and search behavior which simulates a collection of objects.

## References
[1] https://start.spring.io/ </br>
[2] https://spring.io/guides/gs/rest-service/ </br>
[3] http://www.springboottutorial.com/spring-boot-crud-rest-service-with-jpa-hibernate </br>
[4] https://dzone.com/articles/how-to-create-rest-api-with-spring-boot </br>
[5] https://spring.io/guides/gs/accessing-data-mysql/ </br>
[6] https://www.baeldung.com/rest-with-spring-series </br>
