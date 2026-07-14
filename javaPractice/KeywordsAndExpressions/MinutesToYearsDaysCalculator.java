public class MinutesToYearsDaysCalculator{

	public static void printYearsAndDays(long minutes){

		long years = minutes/(60*24*365);
		long remDays = (minutes%(60*24*365))/(24*60);
		
		System.out.println(minutes +" min = " +years +" y and " +remDays +" d");
	
	}


	public static void main(String[] args){

		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);
	}


}
