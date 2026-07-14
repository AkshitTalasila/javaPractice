public class MethodChallenge{

	public static void displayHighScorePosition(String playerName, int playerPosition){

		System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
		
	}
	
	
	public static int calcHighScorePosition(int playerScore){

		if(playerScore >=1000){

			return 1;
		
		}else if((playerScore >=500) && (1000 > playerScore)){
		
			return 2;

		}else if((playerScore >= 100) && (500 > playerScore)){

			return 3;
		}else{
		
			return 4;
		}
	}

	
	public static void main(String[] args){

		displayHighScorePosition("Akshit" , calcHighScorePosition(1500));
		displayHighScorePosition("Akshit" , calcHighScorePosition(1000));
		displayHighScorePosition("Akshit" , calcHighScorePosition(499));
		displayHighScorePosition("Akshit" , calcHighScorePosition(100));
		displayHighScorePosition("Akshit" , calcHighScorePosition(25));
	}


}
