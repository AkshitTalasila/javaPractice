public class CopyArray{

	public int[] copy(int[] array){
	
		int[] copyArray = new int[array.length];
		for(int i=0;i<array.length;i++){

			copyArray[i] = array[i];
		}

		return copyArray;
	}
}
