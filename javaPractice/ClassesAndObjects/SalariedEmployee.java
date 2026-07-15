public class SalariedEmployee extends Employee{

	private double annualSalary;
	private boolean isRetired;

	public SalariedEmployee(String name, String birthDate, String endDate, long employeeID, String hiringDate, double annualSalary){

		super(name, birthDate, endDate, employeeID, hiringDate);
		this.annualSalary = annualSalary;
	}

	public double collectPay(){
		
		double pay = annualSalary;
		if(this.isRetired == true){
			
			return ((double)(pay/2));
		}else{

			return pay;
		}
	}

	public void retire(){
		
		terminate("12/12/2026");
		this.isRetired = true;
	}

	public String toString(){
	
		return("annualSalary: " +annualSalary +super.toString()); 
	}

	
}
