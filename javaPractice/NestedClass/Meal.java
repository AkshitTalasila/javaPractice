package edu.umass;
import java.util.*;

public class Meal{

	private Burger burger;
	private Item drink;
	private Item side;
	private double conversionRate;
	private static double price = 5;
	
	public Meal(double conversionRate){

		burger = new Burger("CheeseBurger");
		drink = new Item("Coke", "Drink", 1.50);
		System.out.println(drink.type);
		side = new Item("Fries", "side", 2);	
		this.conversionRate = conversionRate;
	}

	public Meal(){
		
		this(1);
	}
		
	public double getTotal(){

		double total = burger.getPrice(burger.getPrice(),this.conversionRate)+drink.getPrice(drink.price,this.conversionRate)+side.getPrice(side.price,this.conversionRate);	
		
		return total;
	}
	
	public void addToppings(String... toppings){
    	
		burger.addToppings(toppings);
	}

		
	public String toString(){

		String bill = "%s%n%s%n%s%n%.2f%n".formatted(burger,drink,side,getTotal());
		return bill;
	}	


	private class Item{
		
		private String name;
		private String type;
		private double price;

		public Item(String name, String type, double price){

			this.name = name;
			this.type = type;
			this.price = price;
		}

		public Item(String name, String type){
		
			this(name,type,name.equals("burger") ? Meal.this.price:0);
		}

		public double getPrice(double price, double conv){
			
			return price * conv;
		}

	
		public String toString(){

			String fullText = "%s %s  $%.2f".formatted(name,type,getPrice(this.price,Meal.this.conversionRate));
			return fullText;
		}
	}

	private class Burger extends Item{
		
		List<Item> toppings = new ArrayList<>();
		
		public enum Extra{
			
			Lettuce,
			Tomato,
			Mayo;


			public double getPrice(){

				double price;
				switch(this){
					
					case Lettuce -> price = 4.50;
					case Tomato -> price =  5;
					case Mayo -> price = 0.5;
					default -> price =  0;
				}

				return price;
			}
		}

		
		public Burger(String name){

			super(name,"Burger",5.00);
		}	


		public double getPrice(){
			
			double total = super.price;

    			for(Item topping : toppings){
        	
				total += topping.price;
    			}

    			return total;
		}
			
		private void addToppings(String... toppings){

			 for(String topping : toppings){

       				 try{
            				Extra extra = Extra.valueOf(topping.toUpperCase());
            				Item newTopping = new Item(extra.name(), "Topping", extra.getPrice());
            				this.toppings.add(newTopping);
        			}catch(IllegalArgumentException e){
            				System.out.println(topping + " is not a valid topping");
        			}

			}
		}
		
	}

	
}
