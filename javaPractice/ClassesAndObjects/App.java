import java.util.*;

public class App{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean keepOrdering = true;

        while(keepOrdering){

            System.out.println("\n--- New Order ---");

            System.out.print("Burger type: ");
            String burgerType = scanner.nextLine();
            System.out.print("Burger base price: ");
            double burgerPrice = Double.parseDouble(scanner.nextLine());
            System.out.print("Number of toppings (0-3): ");
            int toppings = Integer.parseInt(scanner.nextLine());
            Burger burger = new Burger(burgerType, burgerPrice, toppings);

            System.out.print("\nDrink type: ");
            String drinkType = scanner.nextLine();
            System.out.print("Drink size (10, 15, or 20): ");
            double drinkSize = Double.parseDouble(scanner.nextLine());
            Drink drink = new Drink(drinkType, drinkSize);

            System.out.print("\nSide item type: ");
            String sideType = scanner.nextLine();
            System.out.print("Side item price: ");
            double sidePrice = Double.parseDouble(scanner.nextLine());
            SideItem sideItem = new SideItem(sideType, sidePrice);

            MainOrder order = new MainOrder(burger, drink, sideItem);

            // burger.getPrice() will prompt you for each topping here
            double burgerFinalPrice = burger.getPrice();

            System.out.println("\nBurger price: " + burgerFinalPrice);
            System.out.println("Drink price: " + drink.getPrice());
            System.out.println("Side price: " + sideItem.getPrice());
            System.out.println("Total order price: " + order.getPrice());

            System.out.print("\nOrder again? (y/n): ");
            String again = scanner.nextLine();
            keepOrdering = again.equalsIgnoreCase("y");
        }

        System.out.println("Thanks for ordering!");
        scanner.close();
    }
}
