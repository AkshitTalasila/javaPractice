public class Mitsubishi extends Car{

	public Mitsubishi(int cylinders, String name){

		super(cylinders, name);
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

	
	
}
