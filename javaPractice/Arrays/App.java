import java.util.*;

public class App{


	public static void main(String[] args){
	
		int[] my_array = {
            10789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};

		        System.out.println("Original numeric array : " + Arrays.toString(my_array));

		SecondLargest one = new SecondLargest();

		System.out.println(one.getSecond(my_array));	
	}
}
