package todo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "todos")
@EntityListeners(AuditingEntityListener.class)
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;

	// Getter and Setter for 'name'
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// Getter and Setter for 'id'
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
