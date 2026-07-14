public class InterestRate{

	public static double getAmount(double principle, double rate){

		return (principle * (rate/100));
	}


	public static void main(String[] args){
	
		for(double i = 7.5; i<=10; i += 0.25){
			
			if(i>9){

				break;
			}
	
			double amount = getAmount(100,i);
			System.out.println("the amount at rate" +i +"for $100 is " +amount);

		}
	}

}
