package todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * @Repository: Indicates that the decorated class is a repository. A repository is a mechanism of encapsulating storage,
 * retrieval, and search behavior which simulates a collection of objects.
 */

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {}
