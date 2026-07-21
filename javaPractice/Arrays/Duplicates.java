public class Duplicates{
	
	public String findDupes(int[] array){

		String allDupes = "";
		for(int i =0;i<array.length;i++){
		
			for(int z =i+1;z<array.length;z++){
				
				if(array[i] == array[z]){

					allDupes = allDupes +array[i] + " ";
				}
			}
		}
		
		return allDupes;
	}
}
