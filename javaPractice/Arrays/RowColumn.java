public class RowColumn{

	public void rowSum(int[][] array){

		int rowSum =0;

		for(int i=0;i<array.length;i++){
			
			rowSum =0;
			for(int z=0;z<array[i].length;z++){

				rowSum+= array[i][z];
			}
			
			System.out.println(rowSum);
		}
	}


	public void colSum(int[][] array){

		int colSum=0;
		
		for(int i=0;i<array.length;i++){

			colSum=0;
			for(int z=0;z<array.length;z++){
				
				colSum+=array[z][i];
			}

			System.out.println(colSum);
		}
	
	}
}
