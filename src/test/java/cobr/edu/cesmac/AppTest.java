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

}
