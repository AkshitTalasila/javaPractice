public class Sum2DArray{

	public int sum(int[][] array){
		
		int sum =0;
		for(int i =0;i<array.length;i++){
			
			for(int z =0;z<array[i].length;z++){

				sum+= array[i][z];
			}
		}
		
		return sum;
	}
}
