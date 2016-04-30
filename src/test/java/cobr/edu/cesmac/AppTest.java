package cobr.edu.cesmac;

import org.junit.Test;

/**
 * @author jooby generator
 */
public class AppTest extends BaseTest {

  @Test
  public void newTodo() throws Exception {
      server
          .post("/todo")
          .body("{\"title\":\"eriva\"}", "application/json")
	  .expect("{\"title\":\"eriva\",\"id\":1}");
  }
  
  @Test
  public void viewTodo() throws Exception {
	  Todo todo = new Todo("lorem");
	  todo.id = 1;
	  TodoResource.todos.add(todo);
	  
	  server.get("/todo/lorem")
	  	.expect("{\"title\":\"lorem\",\"id\":1}");
  }

  @Test
  public void viewAllTodos() throws Exception {

	  Todo todo = new Todo("lorem");
	  todo.id = 1;

	  Todo todo2 = new Todo("ipsum");
	  todo2.id = 2;	  

	  TodoResource.todos.clear();
	  TodoResource.todos.add(todo);
	  TodoResource.todos.add(todo2);	  
	  
	  server.get("/todo")
	  	.expect("[{\"title\":\"lorem\",\"id\":1},{\"title\":\"ipsum\",\"id\":2}]");
  }

}
