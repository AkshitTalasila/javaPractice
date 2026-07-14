public class ScoreCalculator{


	public static int scoreCalc(boolean isGameOver, int score, int levelCompleted, int bonus){

		int finalScore = score;
		
		if(isGameOver){
			
			finalScore += (levelCompleted * bonus);
		}
		
		return finalScore;
	}

	public static void main(String[] args){

		int score1 = scoreCalc(true,800,5,100);
		System.out.println("Your high score is " + score1);
		
		int score2 = scoreCalc(true, 10000, 8, 200);
		System.out.println("Your high score is " + score2);
	}

}
