package edu.umass;
import java.util.*;

public class StoreEmployee extends Employee{

	private String store;

	public class StoreComparator implements Comparator<StoreEmployee>{

		public int compare(StoreEmployee o1, StoreEmployee o2){

			int storeComp = o1.store.compareTo(o2.store);
			
			if(storeComp == 0){

				return new Employee.EmployeeComparator("yearSort").compare(o1,o2);
			}else{

				return storeComp;
			}
		}
	}

	public StoreEmployee(){


	}

	public StoreEmployee(String store, int ID, int yearStarted, String name){

		super(yearStarted,ID,name);
		this.store = store;
	}	
}
