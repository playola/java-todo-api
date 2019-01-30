package todo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * @RestController includes @Controller and @ResponseBody annotations (simplifies the implementation).
 */

@RestController
public class TodoController {

	@Autowired
	private TodoRepository todoRepository;

	/*
	 * @RequestMapping ensures that HTTP requests to /todo-list are mapped to the todoclient() method.
	 * By default, maps all HTTP operations. To narrow this mapping use: @RequestMapping(method=GET).
	 * 
	 * An alternative is to define specifically the method type using:
	 * 		- @GetMapping(): Reads a resource.
	 * 		- @PostMapping(): Create a new resource.
	 * 		- @PutMapping(): Update an existing resource.
	 * 		- @DeleteMapping(): Delete a resource.
	 */
	/*
     * @RequestParam binds the value of the query string parameter into the method.
     */
	
	@GetMapping("/todos")
	public List<Todo> getAllTodos() {
	    return todoRepository.findAll();
	}
}
