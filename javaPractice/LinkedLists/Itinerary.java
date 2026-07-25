import java.util.*;

public class Itinerary{

	private LinkedList<Place> itin = new LinkedList<>();
	private ListIterator<Place> iterator;
	public Itinerary(LinkedList<Place> place){
		
		for(int i=0;i<place.size();i++){
			
			if(itin.contains(place.get(i))){

				System.out.println("This list already contains " +place.get(i).getName());
			}else{
				
				itin.add(place.get(i));
			}

			iterator = itin.listIterator();
		}	
	}


	public void moveForward(){
		
		if(iterator.hasNext()){

			System.out.println(iterator.next());
		}else{

			System.out.println("The itinerary is at its end please use the back key");
		}
	}
	
	public void moveBackwards(){

		if(iterator.hasPrevious()){

			System.out.println(iterator.previous());
		}else{
		
			System.out.println("The itinerary is at the start please use the forward key");
		}
	}

	public void listPlaces(){
		
		for(Place i : itin){

			System.out.println("Place: " +i.getName() +" Distance: " +i.getDistance());
		}
	}

	
}
