public class OperatorChallenge{

	public static void main(String[] args){

		double varOne = 20.00;
		double varTwo = 80.00;
		double varThree = (varOne + varTwo) *(100);
		double rem = varThree % 40.00;
		boolean isRemZero = (rem == 0.00);
		System.out.println(isRemZero);

		if(!isRemZero){
			
			System.out.println("got some remainder");
		}
	}


}
