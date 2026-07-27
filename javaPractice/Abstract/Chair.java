package edu.umass;

public class Chair extends ProductsForSale{

	public Chair(String type,double price,String description){
		
		super(type,price,description);
	}

	public String showDetails(){

		return("Type :" +super.type +"/nPrice: " +super.price);
	}


}
