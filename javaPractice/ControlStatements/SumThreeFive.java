public class SumThreeFive{

	public static void main(String[] args){

		int sum =0;
		int tracker = 0;
		for(int i = 1; i<=1000; i++){
		
			if((i%3 ==0) && (i%5 ==0)){
				
				tracker++;
				sum = sum + i;	
			}
			
			if(tracker ==5){

				break;
			}
			
		}

		System.out.println(sum);
	}


}
