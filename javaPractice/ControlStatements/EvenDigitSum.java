public class EvenDigitSum{

	public static int getEvenDigitSum(int num){

		int sum = 0;
		if(num<0) {
			
			return -1;
		} else {

			for(int i = num; i>0;i=i){
				
				int current = i%10;
				if(current%2 == 0){
				
					sum += current;
				}
				i = i/10;
			} 
		}
		
		return sum;
	}


	public static void main(String[] args){

		System.out.println(getEvenDigitSum(252));
	}




}
