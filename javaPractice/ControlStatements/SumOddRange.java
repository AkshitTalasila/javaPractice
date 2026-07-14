public class SumOddRange{

	public static boolean isOdd(int num){

		if(num<0){
		
			return false;
		}else if(num%2 == 0){
		
			return false;	
		}else {

			return true;
		}
	}


	public static int sumOdd(int start, int end){

		int sum = 0;

		if((start<0) || (end <0) || (end < start)){
		
			return -1;
		}else {

			for(int i = start; i<=end; i++){
				
				if(isOdd(i)){
				
					sum += i;
				}
			}
		}
		
		return sum;
	}





	public static void main(String[] args){

		System.out.println(sumOdd(1,100));
		System.out.println(sumOdd(-1,100));
	}
		

}
