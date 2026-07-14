public class PlayingCat{

	public static boolean isCatPlaying(boolean isSummer, int temp){

		if((isSummer == true) && ((temp >= 25) && (temp <= 45))){
			
			return true;
		}else if((isSummer == false) && ((temp >= 25) && (temp <= 35))){

			return true;
		}else {


			return false;
		}
	}



	public static void main(String[] args){

		System.out.println(isCatPlaying(true, 10));
		System.out.println(isCatPlaying(false, 36));
		System.out.println(isCatPlaying(false, 35));
	}
}
