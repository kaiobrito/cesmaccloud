package cobr.edu.cesmac;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import org.jooby.Result;
import org.jooby.Results;
import org.jooby.View;
import org.jooby.mvc.Body;
import org.jooby.mvc.GET;
import org.jooby.mvc.POST;
import org.jooby.mvc.Path;
import org.jooby.mvc.Produces;


@Produces("application/json")
@Path("/todo")
public class TodoResource {
	

	static AtomicInteger idgen = new AtomicInteger();

	@POST
	public Todo store(@Body Todo todo){
		todo.id = idgen.incrementAndGet();
		return todo;
	}

}
