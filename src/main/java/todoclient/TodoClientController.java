package todoclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoClientController {

    @RequestMapping("/todo-list")
    public TodoClient todoclient(@RequestParam(value="name", defaultValue="Default todo") String name) {
        return new TodoClient(0, "Pol");
    }
}
