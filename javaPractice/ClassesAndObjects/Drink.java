public class Drink extends Item{

	private double size;

	public Drink(String type, double size){
	
		super(type,0);
		this.size = size;
	}

	public double getSize(){

		return this.size;
	}

	public double getPrice(){
	
		if(getSize() == 10){
		
			return 5;
		}else if(getSize() == 15){
		
			return 8;
		}else if(getSize() == 20){

			return 10;
		}else {
			
			return -1;
		}
	}


}
