import java.util.*;

public class MinMax{

	public static void main(String[] args){

		double max =0;
		double min =0;
		Scanner scanner = new Scanner(System.in);
			System.out.println("This program keeps a track of all the max and min user inputs, enter a number to stay and a character to quit the program");
		while(true){

			try{
			String num = scanner.nextLine();
			double acc = Double.parseDouble(num);
				
				if(acc>=max){
				
					max = acc;
				}else if(acc <= min){

					min = acc;
				}

			System.out.println("Max number = " +max);
			System.out.println("Min number = " +min);
			}catch(NumberFormatException nfe){

				System.out.println("You are ending the program, because you entered a caracter");
				System.out.println("Max number = " +max);
                        	System.out.println("Min number = " +min);
				break;
			}
		}		
	}


}
