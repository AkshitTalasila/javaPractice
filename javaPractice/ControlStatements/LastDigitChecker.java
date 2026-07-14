public class LastDigitChecker{

	public static boolean hasSameLastDigit(int one, int two, int three){

		if(!isValid(one) || !isValid(two) || !isValid(three)){

			return false;
		}else if((one%10 == two%10) || (two%10 == three%10) || (one%10 == three%10)){
				
				return true;
		}else{
			
			return false;
		}
			
	}


	public static boolean isValid(int num){

		if((num<10) || (num>1000)){
			
			return false;
		}else{
			
			return true;
		}
	}



	public static void main(String[] args){

		System.out.println(hasSameLastDigit(9,99,19));		
	}

}
