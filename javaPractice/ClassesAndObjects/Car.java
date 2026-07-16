public class Car{

	private boolean engine;
	private String name;
	private int cylinders;
	private int wheels;
		
	public Car(int cylinders, String name){
	
		this.engine = true;
		this.name = name;
		this.cylinders = cylinders;
		this.wheels = 4;
	}

	public String startEngine(){
	
		return(getClass().getName() +"->" +"Car engine is starting");
	}

	public String accelerate(){
	
		return(getClass().getName() +"->"+"The car is accelerating");
	}
	
	public String brake(){

		 return(getClass().getName() +"->"+"The car is braking");	
	}
		
	public String getName(){

		return this.name;
	}
	
	public int getCylinders(){
	
		return this.cylinders;
	} 
}
