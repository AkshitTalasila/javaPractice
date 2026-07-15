public class Employee extends Worker{
	
	private long employeeID;
	private String hiringDate;

	public Employee(String name, String birthDate, String endDate, long employeeID, String hiringDate){
	
		super(name,birthDate,endDate);
		this.employeeID = employeeID;
		this.hiringDate = hiringDate;
	}

	public String toString(){

		return("Employee ID: " +employeeID +" Hiring Date:" +hiringDate +super.toString());
	}
}
