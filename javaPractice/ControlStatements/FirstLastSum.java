public class FirstLastSum{

	public static int sumFirstLast(int num){

			int last = num%10;
			int first = 0;
		if(num<0){
		
			return -1;
		}else if(num/10 == 0){
			
			int sum= num*2;
			return sum;

		}else{
			int i = num;
			do{
				i=i/10;
				if(i<10){
					first = i;
					break;
				}
			}while(i>0);
			return first+last;
		}
			

		
		
	}


	public static void main(String[] args){

		System.out.println(sumFirstLast(5));
	}


}
