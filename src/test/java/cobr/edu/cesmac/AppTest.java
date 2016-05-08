package cobr.edu.cesmac;

import org.junit.Test;

/**
 * @author jooby generator
 */
public class AppTest extends BaseTest {

	@Test
	public void newTodo() throws Exception {
		server.post("/todo").body("{\"title\":\"eriva\"}", "application/json").expect("{\"title\":\"eriva\",\"id\":1}");
	}

	@Test
	public void viewTodo() throws Exception {
		Todo todo = new Todo("lorem");
		todo.id = 1;
		TodoStore.todos.add(todo);

		server.get("/todo/1").expect("{\"title\":\"lorem\",\"id\":1}");
	}

	@Test
	public void updateTodo() throws Exception {
		Todo todo = new Todo("lorem");
		todo.id = 1;

		Todo todo2 = new Todo("lorem2");
		todo.id = 2;

		TodoStore.todos.add(todo);
		TodoStore.todos.add(todo2);

		server.put("/todo/2").body("{\"title\":\"diego\"}", "application/json")
				.expect("{\"title\":\"diego\",\"id\":2}");
	}

	@Test
	public void viewAllTodos() throws Exception {

		Todo todo = new Todo("lorem");
		todo.id = 1;

		Todo todo2 = new Todo("ipsum");
		todo2.id = 2;

		TodoStore.todos.clear();
		TodoStore.todos.add(todo);
		TodoStore.todos.add(todo2);

		server.get("/todo").expect("[{\"title\":\"lorem\",\"id\":1},{\"title\":\"ipsum\",\"id\":2}]");
	}

}
