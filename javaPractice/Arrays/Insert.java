public class Insert{

	public int[] insertElement(int[] array, int targetPos,int value){

		int[] newArray = new int[array.length+1];
	
		for(int i=0;i<newArray.length;i++){

			if(i<targetPos){

				newArray[i] = array[i];
			}else if(i == targetPos){

				newArray[i] = value;
			}else{

				newArray[i] = array[i-1];
			}	
		}	
		return newArray;
	}
}
