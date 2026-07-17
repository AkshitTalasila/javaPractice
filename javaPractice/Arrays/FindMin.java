import java.util.*;

public class FindMin{

	public static int[] addIntegers(){

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your array of character seperated by a comma and not a space");
		String input = sc.nextLine();
		String[] inputArray = input.split(",");
		int[] numberArray = new int[inputArray.length];
		for(int i =0; i<inputArray.length;i++){

			numberArray[i] = Integer.parseInt(inputArray[i]);		
		}

		return numberArray;	
	}

	public static int findMin(int[] array){
		
		int min = array[0];
		for(int i=0;i<array.length;i++){
			
			if(array[i]<min){

				min = array[i];
			}	
		}
		
		return min;
	}
	
	public static void main(String[] args){
	
		System.out.println(findMin(addIntegers()));
	}
}
