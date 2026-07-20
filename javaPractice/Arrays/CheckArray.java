public class CheckArray{


	public boolean check(int[] array,int value){
	
		for(int i=0;i<array.length;i++){

			if(array[i]==value){
			
				return true;
			}
		}
		
		return false;	
	}
}
