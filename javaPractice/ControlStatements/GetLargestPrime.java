public class GetLargestPrime{

	public static int getLargestPrime(int num){
		
		if(num<=0){

			return -1;
		}

		int largestPrime =1;

		for(int i=2;i<=num;i++){
			
			boolean isPrime =true;
			if(num%i ==0){
			
				for(int j =2; j<i;j++){

					if(i%j==0){
						
						isPrime = false;
					}	
				}


				if(isPrime == true){

					largestPrime =i;
				}
			}			
		}


		if(largestPrime == 1){

			return -1;
		}else{

			return largestPrime;
		}
	}



	public static void main(String[] args){

		System.out.println(getLargestPrime(7));
	}



}
