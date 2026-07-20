import java.util.*;

public class App{


	public static void main(String[] args){
	
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		Insert insert = new Insert();
		System.out.println(Arrays.toString(my_array));
		System.out.println(Arrays.toString(insert.insertElement(my_array,3,54)));
	}
}
