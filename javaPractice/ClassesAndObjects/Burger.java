import java.util.*;

public class Burger extends Item{

	private int noToppings;

	public Burger(String type, double price, int noToppings){
	
		super(type, price);
		this.noToppings  = noToppings>3 ? -1:noToppings;
	}
	
	public double getPrice(){
		
		Scanner scanner = new Scanner(System.in);
		int counter =0;
		for(int i =0; i<noToppings;i++){
			
			System.out.println("You have " +noToppings +" remaining");
			System.out.println("Please choose your toppings, the options are Bacon, Lettuce, Tomato");
			String topping = scanner.nextLine();
			if(topping.equals("Bacon")){

           				 incrementPrice(0.50);
        		}else if(topping.equals("Lettuce")){

           			 incrementPrice(1);
        		}else if(topping.equals("Tomato")){

           			 incrementPrice(1);
        		}else {

           			 System.out.println("Please enter a valid topping option");
           			 i--;
        		}
		} 
		
			return super.getPrice();
	}
}
