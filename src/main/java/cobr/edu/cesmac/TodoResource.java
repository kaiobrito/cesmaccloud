/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Kaio Henrique Alves de Brito
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package cobr.edu.cesmac;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.jooby.mvc.Body;
import org.jooby.mvc.GET;
import org.jooby.mvc.POST;
import org.jooby.mvc.Path;
import org.jooby.mvc.Produces;

import javassist.NotFoundException;


@Produces("application/json")
@Path("/todo")
public class TodoResource {
	static List<Todo> todos = new ArrayList<Todo>();

	static AtomicInteger idgen = new AtomicInteger();

	@GET
	public List<Todo> listAllTodos()  {
		return todos;
	}

	@POST
	public Todo store(@Body Todo todo){
		todo.id = idgen.incrementAndGet();
		todos.add(todo);
		return todo;
	}

	@Path("/:title")
	@GET
	public Todo get(String title) throws NotFoundException {
		System.out.println("Total of todos: " + todos.size());
		for (Todo todo: todos) {
			if (todo.title.equals(title)) {
				return todo;
			}
		}
		
		throw new NotFoundException("Todo does not exist");
	}

}
