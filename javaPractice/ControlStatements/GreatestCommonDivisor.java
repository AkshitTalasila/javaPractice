public class GreatestCommonDivisor{

	public static int getGreatestCommonDivisor(int first, int second){

		if((first<10) || (second<10)){

			return -1;
		}else{
			int gcf =0;
			for(int i=1; i<Math.max(first,second);i++){
			
				if((first%i==0) && (second%i==0)){

					gcf = i;
				}
			}
			
			return gcf;
		}
	}

	public static void main(String[] args){


		System.out.println(getGreatestCommonDivisor(25,25));
	}


}
