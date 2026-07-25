import java.util.*;

public class Trip{

	private LinkedList<Place> trips = new LinkedList<>();
	
	public void addPlace(Place place){
	
		if(trips.isEmpty()){

			trips.add(place);
		}else if((trips.get(0).getDistance())>= place.getDistance()){

			trips.addFirst(place);
		}else if((trips.get(trips.size()-1).getDistance())<= place.getDistance()){

			trips.addLast(place);
		}else {

			for(int i=0;i<trips.size()-1;i++){

				if(((trips.get(i).getDistance()<=place.getDistance()) && ((trips.get(i+1).getDistance())>=place.getDistance()))) 	{

					trips.add(i+1,place);
					break;
				}
			}
		}	
	}


	public LinkedList getList(){

		return trips;
	}
		
		
}
