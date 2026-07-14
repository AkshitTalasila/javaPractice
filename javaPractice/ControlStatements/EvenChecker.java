public class EvenChecker{

	public static boolean isEven(int num){

		if(num%2 == 0){
		
			return true;
		}else {
			
			return false;
		}
	}



	public static void main(String[] args){

		int startingNum = 5;
		int endingNum = 20;
		int tracker = 0;
		int evenCount = 0;
		int oddCount = 0;
		while(startingNum<=endingNum){
			
			if(tracker == 5){

				break;
			}else if(isEven(startingNum)){
				System.out.println("Even Number: " +startingNum);
				tracker++;
				evenCount++;
			}else{
				oddCount++;
			}

			startingNum++;
		}


		System.out.println("No of Odd No's are" +oddCount);
		System.out.println("No of Even No's are" +evenCount);
	}


}
