package sortparallel;

import java.util.*;

public class Employee {
	private String lastName;
	private String firstName;
	private int    id;
	
	public Employee(String lastName, String firstName, int id) {
		this.lastName  = lastName;
		this.firstName = firstName;
		this.id        = id;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public int getId() {
		return id;
	}

}
