import java.util.*;

public class SumFive{

	public static void main(String[] args){

		int sum =0;
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<5;i++){
			
			System.out.println("Enter your number #" +(i+1));
			sum += scanner.nextInt();
		}

		System.out.println(sum);
	}

}
