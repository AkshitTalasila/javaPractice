public class SmartKitchen{
	
	private CoffeeMaker brewMaster;
	private DishWasher dishWasher;
	private Refrigerator iceBox;

	public SmartKitchen(){
	
		this.brewMaster = new CoffeeMaker();
		this.dishWasher = new DishWasher();
		this.iceBox = new Refrigerator();	
	}
	
	public CoffeeMaker getBrewMaster(){
	
		return brewMaster;
	}
	
	public DishWasher getDishWasher(){

		return dishWasher;
	}
	
	public Refrigerator getIceBox(){
	
		return iceBox;
	}
}
