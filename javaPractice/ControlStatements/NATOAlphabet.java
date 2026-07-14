public class NATOAlphabet{

	
	public static void phoneticNATO(char letter){

		switch(letter){
		
		case 'A':
			System.out.println("A Able");
			break;
		
		case 'B':
			System.out.println("B Baker");
			break;

		case 'C':
			System.out.println("C Charlie");
			break;

		case 'D':
			System.out.println("D Delta");
			break;

		case 'E':
			System.out.println("E Echo");
			break;

		default:
			System.out.println("Message Not Found");
			break;		
		}
			
	}




	public static void main(String[] args){

		phoneticNATO('B');
	}

}
