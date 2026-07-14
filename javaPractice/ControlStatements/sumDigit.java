public class sumDigit{

	public static int calcSumDigits(int num){

		int sum = 0;

		if(num<0){
			
			return -1;
		}else{
			
			for(int i = num; i>0; i=i){

				sum += i%10;
				i=i/10;
			}



		}

		return sum;	
	}


	public static void main(String[] args){


		System.out.println(calcSumDigits(125));
	}


}
