public class DecimalComperator{

	
	public static boolean areEqualByThreeDecimalPlaces(double one, double two){
	
		int compareOne = (int) (one*1000);
		int compareTwo = (int) (two*1000);
		
		if(compareOne == compareTwo){
			
			return true;
		}else{
			
			return false;
		}
	}


	public static void main(String[] args){

		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
		System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
	}

}
