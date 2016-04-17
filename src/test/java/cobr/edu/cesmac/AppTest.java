package cobr.edu.cesmac;

import org.junit.Test;

/**
 * @author jooby generator
 */
public class AppTest extends BaseTest {


  @Test
  public void newTodo() throws Exception {
	  server.post("/todo").body("{\"name\":\"eriva\"}", "application/json")
	  .expect("{\"name\":\"eriva\",\"id\":1}");
	  
  }

}
