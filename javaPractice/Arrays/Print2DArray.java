public class Print2DArray{

	public void print(int[][] array){

		for(int i =0;i<array.length;i++){
			
			for(int z =0; z<array[i].length;z++){
				
				System.out.print(array[i][z] + " ");
			}
			System.out.println();
		}
	}
}
