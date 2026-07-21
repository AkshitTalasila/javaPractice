public class DupeString{

	public String getStringDupes(String[] array){
	
		String allDupeElements = "";
		for(int i=0;i<array.length;i++){

			for(int z = i+1;z<array.length;z++){

				if(array[i].equals(array[z])){
				
					allDupeElements = allDupeElements +array[i] +" ";
				}
			}
		}
		
		return allDupeElements;
	}
}
