public class AppTest {

    static int passed = 0;
    static int failed = 0;

    public static void main(String[] args){

        testDefaultMainOrder();
        testCustomMainOrder();
        testDrinkSizes();
        testSideItemPrice();
        testBurgerNoToppings();

        System.out.println("\nResults: " + passed + " passed, " + failed + " failed");
    }

    static void check(String testName, double expected, double actual){

        if(expected == actual){
            System.out.println("PASS: " + testName);
            passed++;
        } else {
            System.out.println("FAIL: " + testName + " (expected " + expected + ", got " + actual + ")");
            failed++;
        }
    }

    static void testDefaultMainOrder(){

        // Burger("Cheese", 4.50, 0) -> 4.50
        // Drink("Coke", 10) -> 5
        // SideItem("Fries", 3) -> 3
        MainOrder order = new MainOrder();
        check("Default MainOrder total", 12.5, order.getPrice());
    }

    static void testCustomMainOrder(){

        Burger burger = new Burger("Veggie", 5.00, 0);
        Drink drink = new Drink("Sprite", 15);
        SideItem side = new SideItem("Onion Rings", 4);

        MainOrder order = new MainOrder(burger, drink, side);
        // 5.00 + 8 + 4 = 17.00
        check("Custom MainOrder total", 17.0, order.getPrice());
    }

    static void testDrinkSizes(){

        check("Drink size 10", 5, new Drink("Coke", 10).getPrice());
        check("Drink size 15", 8, new Drink("Coke", 15).getPrice());
        check("Drink size 20", 10, new Drink("Coke", 20).getPrice());
        check("Drink invalid size", -1, new Drink("Coke", 99).getPrice());
    }

    static void testSideItemPrice(){

        SideItem side = new SideItem("Fries", 3.25);
        check("SideItem price", 3.25, side.getPrice());
    }

    static void testBurgerNoToppings(){

        Burger burger = new Burger("Cheese", 4.50, 0);
        check("Burger with 0 toppings", 4.50, burger.getPrice());
    }
}
