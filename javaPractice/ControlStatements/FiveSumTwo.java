import java.util.*;

public class FiveSumTwo{

	public static void main(String[] args){

		int counter =0;
		int sum =0;
			
		Scanner scanner = new Scanner(System.in);

		do{

			try{
				System.out.println("Please enter your no #" +(counter+1));
				String num = scanner.nextLine();
				sum += Integer.parseInt(num);	
				counter++;
			}catch(NumberFormatException nfe){

				System.out.println("Please enter a vaild integer input");
			}	
		}while(counter<5);

		System.out.println(sum);
	}

}
