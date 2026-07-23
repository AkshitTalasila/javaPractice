import java.util.*;

public class GroceryList{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		boolean isZero = false;
		
		ArrayListChallenge program = new ArrayListChallenge();	
		ArrayList<String> items = new ArrayList<>();

		do{

			System.out.println("Available Actions");
			System.out.println("0 - ShutDown");
			System.out.println("1 - Add item to the list(comma delimited)");
			System.out.println("2 - Remove items from the list (comma delimited)");
			String inputString = sc.nextLine();
			int input = Integer.parseInt(inputString);

			if(input == 0){

				System.out.println("Program Ending");
				isZero = true;
				break;
			}else if(input == 1){
				
				System.out.println(program.addItems(items));
				isZero = false;
			}else if(input ==2){

				System.out.println(program.removeItems(items));
				isZero = false;
			}else{

				System.out.println("Please enter a valid input");
				isZero = false;
			}
		}while(!isZero);
	}
}
