public class DiagSum{

	public int diag(int[][] array){

		int sum=0;
		for(int i=0;i<array.length;i++){

			sum+=array[i][i];
		}
		
		return sum;
	}


	public int anti(int[][] array){

		int sum=0;
		for(int i=array.length-1;i>=0;i--){

			sum+=array[array.length-i-1][i];		
		}

		return sum;
	}
}
