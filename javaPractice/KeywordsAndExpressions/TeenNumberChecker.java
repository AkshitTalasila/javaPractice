public class TeenNumberChecker{

	public static boolean hasTeen(int one, int two, int three){

		if((one>=13) && (one<=19)){
			
			return true;
		}else if((two>=13) && (two<=19)){
			
			return true;
		}else if((three>=13) && (three<=19)){
			
			return true;
		}else{
			
			return false;
		}
	}



	public static boolean isTeen(int one){
	
		if((one>=13) && (one<=19)){
        
                        return true;
                }else{
			
			return false;
		}
	}


	public static void main(String[] args){

		System.out.println(hasTeen(9, 99, 19));	
		System.out.println(hasTeen(23, 15, 42));	
		System.out.println(hasTeen(22, 23, 34));	
		System.out.println(isTeen(9));	
	}
	

}
