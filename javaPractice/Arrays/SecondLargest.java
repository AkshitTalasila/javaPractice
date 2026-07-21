import java.util.*;

public class SecondLargest{

	public int getSecond(int[] array){
	
		Arrays.sort(array);
		int i = array.length -1;
		return array[array.length-2];
	}
}
