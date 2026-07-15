public class Worker{

	private String name;
	private String birthDate;
	private String endDate;

	public Worker(String name, String birthDate, String endDate){
		
		this.name = name;
		this.birthDate = birthDate;
		this.endDate = endDate;
	}

	public int getAge(){
		
		int currentYear = 2026;
		int birthYear = Integer.parseInt(birthDate.substring(6)); 
	
		return currentYear-birthYear;
	}

	public double collectPay(){
	
		return 0.0;
	}

	public void terminate(String endDate){
	
		this.endDate = endDate;
	}

	public String toString(){

		return("Employee Name: " +this.name +" Birth Date: " +birthDate +" endDate: " +endDate);
	}
}	
