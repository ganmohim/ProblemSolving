package sortparallel;

import java.util.*;
import java.io.*;

public class EmployeeUtil {
	
	ArrayList<Employee> listOfEmployee = new ArrayList<Employee> ();
	ArrayList<Employee> listOfEmployeeSorted = new ArrayList<Employee> ();
	Employee[] empArray;
	
	public void readEmployeeData() throws IOException {
		String lastName, firstName;
		int id;
		
		FileReader fr = new FileReader("sort-parallel-data.txt");
		Scanner sc = new Scanner(fr);
		//s.useDelimiter("[, ]+"); wrong! you are reading entire line
		
		while (sc.hasNextLine()) {
			String data = sc.nextLine(); // you made mistake here sc.next() -->wrong
			Scanner s = new Scanner(data);
			s.useDelimiter("[, ]+"); // you missed this! Each line should be parsed
			lastName  = s.next();
			firstName = s.next();
			id        = s.nextInt();
			
		    Employee empObj = new Employee(lastName, firstName, id);
		    listOfEmployee.add(empObj);
			
		} // end of while
		
		sc.close();
		
	} // end of readEmployeeData
	
	public Employee[] sortEmpByFirstName() {
		empArray = new Employee[listOfEmployee.size()];
		empArray = listOfEmployee.toArray(empArray);
		
		for (int i = 0; i < empArray.length; i++) {
			for (int j = i+1; j < empArray.length; j++) {
				if (empArray[i].getFirstName().compareToIgnoreCase(
						empArray[j].getFirstName() ) > 0) {
					Employee temp = empArray[j];
					empArray[j] = empArray[i];
					empArray[i] = temp;
				} // end of if
			} // end of inner for
		} // end of outer for
		
		// loading sorted array list
		for (int i = 0; i < empArray.length; i++) {
			listOfEmployeeSorted.add(empArray[i]);
		}
		
		return empArray;
		
	} // end of sortEmpByFirstName
	
	public void printSortedEmployee() {
		for (Employee e : listOfEmployeeSorted) {
			System.out.println(e.getFirstName() + " " + e.getLastName()
					+ " " + e.getId());
		} // end of for
	} // end of printSortedEmployee()
	
	// Binary search on employee string
	public int searchEmployee(int start, int end, Employee[] empArray, String nameToSearch) {
		
		if (start > end) 
			return -1;
		
		int midIndex = (start + end) / 2;
		
		if (empArray[midIndex].getFirstName().compareToIgnoreCase(nameToSearch) == 0) {
			return midIndex;
		} // end of if
		
		
		else if(empArray[midIndex].getFirstName().compareToIgnoreCase(nameToSearch) > 0) {
			return searchEmployee(0, midIndex-1, empArray, nameToSearch);
		}
		
		else {
			return searchEmployee(midIndex+1, end, empArray, nameToSearch);
		}
		
	}

}
