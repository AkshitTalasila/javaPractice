import java.util.*;

public class MinimumElement{

	public static int readInteger(){
	
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter how many numbers you want to store in an array");
		int elementNo = sc.nextInt();
		return elementNo;	
	}

	public static int[] readElements(int no){

		int[] numbers = new int[no];
		
		Scanner sc = new Scanner(System.in);
		String numberString; 
		String[] stringArray; 
		boolean isNotCorrectLength = true;
		do{
			
			System.out.println("Please enter the " +no +" numbers you want to find the min of seperated by a comma and not a space");
			numberString = sc.nextLine();
			stringArray = numberString.split(",");
			if(stringArray.length == no){
				
				isNotCorrectLength = false;	
			}else{

				isNotCorrectLength = true;
			}
		}while(isNotCorrectLength);

		for(int i =0;i<stringArray.length;i++){
			
			numbers[i] = Integer.parseInt(stringArray[i]);
		}

		return numbers;
	}

	
	public static int findMin(int[] array){

		int min =array[0];
		
		for(int i=0;i<array.length;i++){

			if(array[i]<min){

				min = array[i];
			}
		}
		
		return min;
	}

	
	public static void main(String[] args){

		
		System.out.println(findMin(readElements(readInteger())));
	}
}
