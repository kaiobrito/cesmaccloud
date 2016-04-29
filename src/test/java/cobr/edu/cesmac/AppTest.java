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

}
