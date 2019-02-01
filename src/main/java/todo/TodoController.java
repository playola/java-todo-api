package todo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * @RestController includes @Controller and @ResponseBody annotations (simplifies the implementation).
 * 
 * @Autowired: Avoid null object for todoRepository.
 */

@RestController
public class TodoController {

	@Autowired
	private TodoRepository todoRepository;

	@GetMapping("/todos")
	public List<Todo> getAllTodos() {
	    return todoRepository.findAll();
	}
	
	@PostMapping(path = "/add-todo", consumes = "application/json")
	@ResponseBody
	public void createTaskTodo(@RequestBody Todo taskTodo) {
		todoRepository.save(taskTodo);
	}
	
	@DeleteMapping(path = "/delete-todo/{todoId}")
	public void deleteTaskTodo(@PathVariable long todoId) {
		todoRepository.deleteById(todoId);
	}
}
