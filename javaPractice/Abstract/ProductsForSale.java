package edu.umass;

public abstract class ProductsForSale{

	protected String type;
	protected double price;
	protected String description;

	public ProductsForSale(String type, double price, String description){

		this.type = type;
		this.price = price;
		this.description = description;	
	}

	public double getSalesPrice(int quantity){

		return this.price*quantity;	
	}

	public String getPricedItem(int quantity){
		
		return("$" +getSalesPrice(quantity) +this.type +"  " +this.description);
	}

	public abstract String showDetails();
}
