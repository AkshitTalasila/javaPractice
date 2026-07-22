public class EvenOddReplace{

	public int[][] replace(int[][] array){

		for(int i=0;i<array.length;i++){
		
			for(int z=0;z<array[i].length;z++){
				
				array[i][z] = (array[i][z]%2);		
			}			
		}
		
		return array;
	}
}
