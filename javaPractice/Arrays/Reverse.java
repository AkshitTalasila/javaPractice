public class Reverse{

	
	public int[] rev(int[] array){
	
		for(int i=0;i<array.length/2;i++){

			int temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}

		return array;
	}
}
