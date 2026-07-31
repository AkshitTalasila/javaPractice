package edu.umass;
import java.util.*;

public class Main{

	public static void main(String[] args){

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(2020,1,"Randy"));
		list.add(new Employee(2019,2,"Chloe"));
		list.add(new Employee(2018,3,"Swiss"));

		list.sort(new Employee.EmployeeComparator("yearSort").reversed());
		
		System.out.println(list);		


		List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
    		new StoreEmployee("Target", 1, 2019, "Meg"),
    		new StoreEmployee("Walmart", 2, 2021, "Joe"),	
		new StoreEmployee("Macys", 3, 2020, "Tom"),
		new StoreEmployee("Walmart", 4, 2018, "Marty"),
		new StoreEmployee("Target", 5, 2016, "Bud")
		));

		storeEmployees.sort(new StoreEmployee().new StoreComparator());

		System.out.println(storeEmployees);
	}
}
