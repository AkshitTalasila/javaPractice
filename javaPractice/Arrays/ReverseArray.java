import java.util.*;

public class ReverseArray{

	public static int[] reverse(int[] array){

		for(int i=0;i<array.length/2;i++){
		
			int temp =array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}
		
		return array;
	}

	public static void main(String[] args){

		int[] normal = {5,4,3,2,1};
		System.out.println(Arrays.toString(normal));
		int[] reversed = reverse(normal);
		System.out.println(Arrays.toString(reversed));
	}
}
