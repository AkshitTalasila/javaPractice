import java.util.*;

public class InputCalculator{

	public static void inputThenPrintSumAndAverage(){

		int sum =0;
		double avg =0;
		int count =0;
		Scanner scanner = new Scanner(System.in);

		while(true){

			try{

				String num = scanner.nextLine();
				int acc = Integer.parseInt(num);
				count++;
				sum += acc;
				avg =(double) sum/count;
			}catch(NumberFormatException nfe){

				System.out.println("Sum = " +sum +" AVG = " +avg);
				break;
			}
		}
	}


	public static void main(String[] args){

		inputThenPrintSumAndAverage();
	}

}
