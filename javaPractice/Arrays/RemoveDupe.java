public class RemoveDupe{

	public int[] removeDupe(int[] array){

		int uniqueElements =array.length;
		for(int i=0;i<array.length;i++){
			
			for(int z=i+1;z<uniqueElements;z++){

				if(array[i] == array[z]){
				
					array[z] = array[uniqueElements-1];	
					uniqueElements--;
					
				}
			}
		}
		
		int[] newArray = new int[uniqueElements];
			
		for(int i=0;i<newArray.length;i++){
			
			newArray[i] = array[i];
		}

		return newArray;
	}
}
