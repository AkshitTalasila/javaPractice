public class MaxMin{

	public void getMaxMin(int[][] array){

		int max = array[0][0];
		int min = array[0][0];
		
		for(int i=0;i<array.length;i++){

			for(int z=0;z<array[i].length;z++){

				if(array[i][z] > max){
					
					max = array[i][z];
				}else if(array[i][z]<min){

					min = array[i][z];
				}
			}
		}

		System.out.println(max);
		System.out.println(min);
	}
}
