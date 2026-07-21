public class CommonInteger{

	public void getCommon(int[] array1, int[] array2){

		for(int i=0;i<array1.length; i++){

			for(int z=0;z<array2.length;z++){

				if(array1[i] == array2[z]){
				
					System.out.println("Dupe Element = " +array1[i]);
				}
			}
		}	
	}
}
