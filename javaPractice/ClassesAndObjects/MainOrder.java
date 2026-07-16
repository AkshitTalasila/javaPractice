public class MainOrder{

	private Burger burger;
	private Drink drink;
	private SideItem sideItem;

	public MainOrder(){

		this.burger = new Burger("Cheese", 4.50, 0);
		this.drink = new Drink("Coke", 10);
		this.sideItem = new SideItem("Fries",3);	
	}
	
	public MainOrder(Burger burger, Drink drink, SideItem sideItem){
	
		this.burger = burger;
		this.drink = drink;
		this.sideItem = sideItem;
	}
		
	public double getPrice(){

		double orderPrice = burger.getPrice()+drink.getPrice()+sideItem.getPrice();
		return orderPrice;
	}
}
