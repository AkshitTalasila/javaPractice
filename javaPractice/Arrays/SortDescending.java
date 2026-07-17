import java.util.*;

public class SortDescending{

	public static void main(String[] args){
		
		Random rand = new Random();
		int[] random = new int[10];
		for(int i=0; i<random.length;i++){	
			
			random[i] = rand.nextInt(100);
		}
		System.out.println(Arrays.toString(random));
		Arrays.sort(random);	
		System.out.println(Arrays.toString(random));
		for(int i=0; i<random.length/2; i++){
		
			int temp = random[i];
			random[i] = random[random.length-1-i];
			random[random.length-1-i] = temp;	
				
		}
		
		System.out.println(Arrays.toString(random));	
	}
}
