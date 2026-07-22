public class BorderSum{

	public int getSum(int[][] array){

		int sum =0;	
		for(int i=0;i<array.length;i++){
			
			for(int z=0;z<array[i].length;z++){
	
				if((i==0)||(z==0)||(i==array.length-1)||(z==array[i].length-1)){

					sum+=array[i][z];
				}
			}
		}
		
		return sum;
	}
}
