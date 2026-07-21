public class CommonString{

	public void getCommon(String[] array1, String[] array2){
		
		for(int i=0;i<array1.length;i++){

			for(int z =0;z<array2.length;z++){

				if(array1[i].equals(array2[z])){

					System.out.println("DupeElement = " +array1[i]);
				}
			}
		}	
	}
}
