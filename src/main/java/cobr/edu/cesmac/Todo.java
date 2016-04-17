package cobr.edu.cesmac;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Todo {
	
	public int id;
	
	public String name;

	public Todo(@JsonProperty("name") String name) {
		super();
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
}
