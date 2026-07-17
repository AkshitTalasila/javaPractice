import java.util.*;

public class SortedArray{

	public static int[] getIntegers(int length){
			
		Scanner sc = new Scanner(System.in);
		int[] newArray = new int[length];
		for(int i=0; i<newArray.length;i++){

			System.out.println("Please enter the number to be stored in the array");
			int temp = sc.nextInt();
			newArray[i] = temp;
		}
		
		return newArray;
	}
		
	public static void printArray(int[] array){

		for(int i=0;i<array.length;i++){

			System.out.println("Element " +i +" contents " +array[i]);
		}
	}

	public static int[] sortIntegers(int[] array){

		int[] sortArray = Arrays.copyOf(array, array.length);
		for(int i=0;i<sortArray.length/2;i++){

			int temp = sortArray[i];
			sortArray[i] = sortArray[sortArray.length -1-i];
			sortArray[sortArray.length-1-i] = temp;
		}

		return sortArray;
	}

	public static void main(String[] args){

		int[] temp =getIntegers(10);
		int[] tempTwo =	sortIntegers(temp);	
		printArray(tempTwo);
	}
}
