public class DayPrinter{

	public static String printDayOfWeek(int num){

		return switch(num){
			
			case 0 -> "Sunday";
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			default -> "Invalid Day";
		};

	}



	public static void main(String[] args){

		System.out.println(printDayOfWeek(0));
		System.out.println(printDayOfWeek(1));
		System.out.println(printDayOfWeek(2));
		System.out.println(printDayOfWeek(3));
		System.out.println(printDayOfWeek(4));
		System.out.println(printDayOfWeek(5));
		System.out.println(printDayOfWeek(6));
		System.out.println(printDayOfWeek(7));
	}

}
