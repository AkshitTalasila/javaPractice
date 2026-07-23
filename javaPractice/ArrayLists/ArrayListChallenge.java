import java.util.*;

public class ArrayListChallenge{

	
	public ArrayList<String> addItems(ArrayList<String> items){


		Scanner sc = new Scanner(System.in);
		boolean noDupes = true;	
		do{
			noDupes = true;
			System.out.println("Please enter the list of groceries only seperated by commas");
			String[] listOfItems = sc.nextLine().split(",");
			
			for(String item : listOfItems){

				if(items.contains(item)){

					System.out.println("Please do not enter duplicates");
					noDupes = false;
					break;
				}

			}
			if(noDupes == true){
					
				items.addAll(Arrays.asList(listOfItems));
			}

		}while(noDupes == false);	
		items.sort(Comparator.naturalOrder());
		return items;
	}

	public ArrayList<String> removeItems(ArrayList<String> items){

		Scanner sc = new Scanner(System.in);
		boolean isInList = true;

		do{
			
			isInList = true;
			System.out.println("Please enter the list of gorceries to be removed only seperated by a comma");
			String[] listOfItems = sc.nextLine().split(",");

			for(String item : listOfItems){

				if(items.contains(item) == false){
				
					System.out.println("Only items already in the list can be removed");
					isInList = false;
					break;
				}
			}
				
			if(isInList == true){
	
				items.removeAll(List.of(listOfItems));
			}
		}while(isInList == false);	
		
		return items;
	}


	
}
