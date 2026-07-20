public class Remove{


	public int[] removeElement(int[] array,int index){

		for(int i = index;i<array.length-1;i++){
		
			array[i] = array[i+1];
		}
	
		return array;
	}
}
