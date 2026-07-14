public class SharedDigit{

	public static boolean hasSharedDigit(int one, int two){

		if(((one<10) || (one>99)) ||((two<10) || (two>99))){
			
			return false;
		}else{
		
			int oneLast = one%10;
			int oneFirst = one/10;
			int twoLast = two%10;
			int twoFirst = two/10;
			
			if((oneLast == twoLast) ||(oneLast == twoFirst) || (oneFirst == twoLast) || (oneFirst == twoFirst)){

				return true;
			}else{
				
				return false;
			}
		}
	}



	public static void main(String[] args){

		System.out.println(hasSharedDigit(12,23));
	}
}
