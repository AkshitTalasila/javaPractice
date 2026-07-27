package edu.umass;

public class Painting extends ProductsForSale{

	
	public Painting(String type, double price, String description){
		
		super(type,price,description);
	}

	@Override
	public String showDetails(){
		
		return("Description" +super.description +"/nPrice: " +super.price);
	}
}
