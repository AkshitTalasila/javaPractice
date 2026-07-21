public class FindMinMax{

	public void findMinMax(int[] array){
		
		int min = array[0];
		int max = array[0];
		
		for(int i =0; i<array.length; i++){

			if(array[i]>max){
				
				max = array[i];
			}else if(array[i]<min){

				min = array[i];
			}
		}

		
		System.out.println("The maximum value in this array is " +max);
		System.out.println("The minimum value in this array is " +min);
	}
}
