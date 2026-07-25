import java.util.*;

public class Exercise{

	public void doStuff(){

		System.out.println("Create and Print an ArrayList");
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Crimson");
		colors.add("Navy");
		colors.add("Emerald");
		colors.add("Gold");
		colors.add("Coral");
		colors.add("Lavender");
		colors.add("Turquoise");
		colors.add("Maroon");
		colors.add("Olive");
		colors.add("Indigo");

		System.out.println(colors);

		System.out.println("Iterating through colors");
		for(int i=0;i<colors.size();i++){
			
			System.out.println(colors.get(i));
		}

		System.out.println("Inserting at First Pos");
		System.out.println(colors);
		colors.add(0,"Cyan");
		System.out.println(colors);
		

		System.out.println("Retriving Element at index 3");
		System.out.println(colors.get(3));
		
		
		System.out.println("Updateing Element at index 2");
		System.out.println(colors);
		System.out.println(colors.set(2,"Yellow"));

	
		System.out.println("Removing Element at index 3");
		System.out.println(colors);
		System.out.println(colors.remove(3));


		System.out.println("Searching for color red in arraylist and returning its index");
		System.out.println(colors.indexOf("Red"));
	
		
		System.out.println("Sorting array");
		colors.sort(Comparator.naturalOrder());
		System.out.println(colors);


		System.out.println("Shuffling the array");
		Collections.shuffle(colors);
		System.out.println(colors);


		System.out.println("Reversing the array");
		for(int i=0;i<colors.size();i++){
			
			String temp = colors.get(i);
			colors.set(i,colors.get(colors.size()-1-i));
			colors.set(colors.size()-1-i,temp);
		}
		System.out.println(colors);


		System.out.println("Getting sublist from array");
		System.out.println(colors.subList(2,4));


		System.out.println("Swaping elements 2 and 4 in arraylist");
		String temp = colors.get(2);
		colors.set(2,colors.get(4));
		colors.set(4,temp);
		System.out.println(colors);

		
		System.out.println("Adding two arrays to a new array");
		ArrayList<String> colors2 = new ArrayList<>();
		colors2.add("Silver");
		colors2.add("Teal");
		colors2.add("Magenta");
		colors2.add("Bronze");
		colors2.add("Ivory");	

		System.out.println(colors2);
		colors.addAll(colors2);
		System.out.println(colors);


		System.out.println("Copying the colors arraylist to another");
		ArrayList<String> colors3 = (ArrayList<String>) colors.clone();
		System.out.println(colors3);

		System.out.println("Clearing the arraylist colors 3");
		System.out.println(colors3);
		System.out.println(colors.removeAll(colors3));

		System.out.println("Checking if arraylist is empty");	
		System.out.println(colors3.isEmpty());

		System.out.println("Trimming the arraylist to capacity");
		colors.trimToSize();
		System.out.println(colors.size());

		
	}
}
