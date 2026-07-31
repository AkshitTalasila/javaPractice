package edu.umass;
import java.util.*;

public class Employee{

	private int yearStarted;
	private int ID;
	private String name;
	
	public Employee(){

	}

	public Employee(int yearStarted, int ID, String name){

		this.yearStarted = yearStarted;
		this.ID = ID;
		this.name = name;
	}

	public static class EmployeeComparator implements Comparator<Employee>{
		
		private String sortType;
		
		public EmployeeComparator(String sortType){

			this.sortType = sortType;
		}

		public EmployeeComparator(){
			
			this("name");
		}

		public int compare(Employee o1, Employee o2){
			
			if(this.sortType == "yearSort"){
				
				return o1.yearStarted - o2.yearStarted;
			}else{
			
				return o1.name.compareTo(o2.name);
			}
		}
	}

	public String toString(){

		return("%s %d %d").formatted(this.name, this.ID, this.yearStarted);
	}



}
