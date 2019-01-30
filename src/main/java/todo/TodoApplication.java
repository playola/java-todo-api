package todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootApplication adds the following:
 * 		- @Configuration: Tags the class as a source of bean definitions for the application context.
 * 		- @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on property settings.
 * 		- @EnableWebMvc: This flags the application as a web application and activates key behaviors (e.g. DispatcherServlet).
 *		- @ComponentScan: Tells Spring to look for other components, configurations, and services in 'todoclient' package.
 */

@SpringBootApplication
public class TodoApplication {

	public static void main(String... args) {
		SpringApplication.run(TodoApplication.class, args);
	}
}
