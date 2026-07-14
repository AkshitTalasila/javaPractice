public class NumberPalindrome{

	public static boolean isPalindrome(int num){

		int reverse = 0;
		if(num<0){
			
			int newNum = num*(-1);
			for(int i = newNum; i>0; i=i){

                        	reverse = reverse *10;
                       		reverse += i%10;
                	        i = i/10;
			}
			reverse = reverse *(-1);
		}else{
			for(int i = num; i>0; i=i){

				reverse = reverse *10;
				reverse += i%10;
				i = i/10;
			}
		}

		if(num == reverse){
		
			return true;
		}else{

			return false;
		}

	}


	public static void main(String[] args){

		System.out.println(isPalindrome(-1221));
	}





}
