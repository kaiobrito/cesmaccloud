package cobr.edu.cesmac;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class TodoStore {
	static List<Todo> todos = new ArrayList<Todo>();
	static AtomicInteger idgen = new AtomicInteger();

	public List<Todo> all() {
		return todos;
	}

	public void add(Todo todo) {
		todo.id = idgen.incrementAndGet();
		todos.add(todo);
	}

	public Todo findById(Integer id) {
		for (Todo todo : todos) {
			if (todo.id == id) {
				return todo;
			}
		}

		return null;
	}

	public Todo update(Integer id, String title) {
		Todo todo = findById(id);

		if (todo != null) {
			todo.title = title;
			return todo;
		}

		return null;
	}
}
