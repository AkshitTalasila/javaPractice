package edu.umass;
import java.util.*;


public class Store{

	private ArrayList<ProductsForSale> itemsInStore = new ArrayList<>();
	private ArrayList<OrderItem> order = new ArrayList<>();		

	public void addToInventory(ProductsForSale product){
		
		itemsInStore.add(product);
	}

	public void addToOrder(OrderItem item){

		order.add(item);
	}

	public void printInventory(){

		for(ProductsForSale i : itemsInStore){
			
			System.out.println(i.showDetails());
		}
	}

	public void removeFromOrder(OrderItem item){

		order.remove(item);
	}

	public void printOrder(){
		
		for(OrderItem i : order){

			System.out.println(i.getProduct().getPricedItem(i.getQuantity()));
		}
	}

	public static void main(String[] args){

		Store store = new Store();

		Painting painting = new Painting("Oil Painting", 250.00, "A sunset over the ocean");
		Chair chair = new Chair("Chair", 89.99, "A comfy armchair");

		store.addToInventory(painting);
		store.addToInventory(chair);

		System.out.println("=== Store Inventory ===");
		store.printInventory();

		OrderItem paintingOrder = new OrderItem(2, painting);
		OrderItem chairOrder = new OrderItem(4, chair);

		store.addToOrder(paintingOrder);
		store.addToOrder(chairOrder);

		System.out.println("=== Order Receipt ===");
		store.printOrder();

		store.removeFromOrder(chairOrder);

		System.out.println("=== Order Receipt After Removing Chair ===");
		store.printOrder();
    }
}
