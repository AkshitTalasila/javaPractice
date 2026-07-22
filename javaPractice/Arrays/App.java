import java.util.*;

public class App{

	public static void main(String[] args){
	
		int[][] grid = {
            { 1,  2,  3,  4 },
            { 5,  6,  7,  8 },
            { 9, 10, 11, 12 }
        };
	
	BorderSum sum = new BorderSum();
	
	System.out.println(sum.getSum(grid));			
	}	
}
