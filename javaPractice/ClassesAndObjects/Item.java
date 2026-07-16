public class Item{

	private String type;
	private double price;

	public Item(String type, double price){
		
		this.type = type;
		this.price = price;
	}
		
	public String getType(){
		
		return this.type;
	}

	public double getPrice(){
	
		return this.price;
	}
	
	public void setPrice(double price){

		this.price = price;
	}
	
	public void incrementPrice(double increment){

		this.price +=increment;
	}
}
