public class Grid{


	public void drawGrid(){
	
		String[] gridPattern = {"-"};
		
		for(int i=0;i<10;i++){
			
			for(int z=0;z<10;z++){

				System.out.print(gridPattern[0]+" ");
			}
			System.out.println();
		}
	}
}
