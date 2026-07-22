public class RowMax{

	public int[] findMax(int[][] array){

		int[] rowMax = new int[array.length];
		
		for(int i=0;i<array.length;i++){
			
			int max = array[i][0];
			for(int z=0;z<array[i].length;z++){
				
				if(array[i][z]>max){
					
					max = array[i][z];
				}			
			}

			rowMax[i] = max;
		}

		return rowMax;
	}
}
