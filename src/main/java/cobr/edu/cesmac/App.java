package cobr.edu.cesmac;

import org.jooby.Jooby;
import org.jooby.json.Jackson;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  {
	  use(new Jackson());
    use(TodoResource.class);
    get("/", () -> "Hello World! Guy");
  }

  public static void main(final String[] args) throws Exception {
    run(App::new, args);
  }

}
