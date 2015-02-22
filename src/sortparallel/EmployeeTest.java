package sortparallel;

import java.io.IOException;
import java.util.*;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeUtil util = new EmployeeUtil();
		
		// Read employee data from the text file
		try {
			util.readEmployeeData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Employee[] empArray = util.sortEmpByFirstName();
		util.printSortedEmployee();
		String firstName;
		do {
			System.out.println("Enter first name to search: ");
			firstName = sc.next();
		
			int foundIndex = util.searchEmployee(0, empArray.length, empArray, firstName);
			System.out.println("Search object " + firstName + " found in index " + foundIndex);
		} while (! firstName.equalsIgnoreCase("quit"));
		
		System.out.println("Routine terminated");
	}

}
