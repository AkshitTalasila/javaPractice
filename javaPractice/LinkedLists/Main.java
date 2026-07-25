import java.util.*;

public class Main{
	
	public static void main(String[] args){

		Trip trip = new Trip();
		Place sydney = new Place("Sydney",0);
		trip.addPlace(sydney);
		Place adelade = new Place("Adelade",1374);
		trip.addPlace(adelade);
		Place brisbane = new Place("Brisbane",917);
		trip.addPlace(brisbane);
		Place perth = new Place("Perth",3923);
		trip.addPlace(perth);
		Place aliceSpring = new Place("Alice Springs", 2771);
		trip.addPlace(aliceSpring);
	        Place darwin = new Place("Darwin", 3972);
		trip.addPlace(darwin);
	        Place melbourne = new Place("Melbourne", 877);
		trip.addPlace(melbourne);


		Itinerary itinerary = new Itinerary(trip.getList());

		boolean run = true;
			
		Scanner sc = new Scanner(System.in);
		System.out.println("This is the trip planner plese follow the insturction");
		do{
						
			System.out.println("This is the trip planner plese follow the insturction");
			System.out.println("(F)orward");
			System.out.println("(B)ackward");
			System.out.println("(L)ist");
			System.out.println("(M)enu");
			System.out.println("(Q)uit");

			String input = sc.nextLine();

			if(input.equals("F")){

				itinerary.moveForward();
				run = true;
			}else if(input.equals("B")){
				
				itinerary.moveBackwards();
				run = true;
			}else if(input.equals("L")){

				itinerary.listPlaces();
				run = true;
			}else if(input.equals("M")){

				System.out.println("This is the trip planner plese follow the insturction");
	                        System.out.println("(F)orward");
                        	System.out.println("(B)ackward"); 
                        	System.out.println("(L)ist"); 
       		                System.out.println("(M)enu");
	                        System.out.println("(Q)uit");
				run = true;
			}else if(input.equals("Q")){

				run = false;
			}
		}while(run == true);
			
	

		
	}
}
