public class Transpose{

		
	public int[][] transpose(int[][] array){

		int rowLength = array[0].length;
		int colLength = array.length;
		
		int[][] transposedArray = new int[rowLength][colLength];

		for(int i=0;i<transposedArray.length;i++){

			for(int z =0;z<transposedArray[i].length;z++){

				transposedArray[i][z] = array[z][i];
			}
		}

		return transposedArray;
	}
}
