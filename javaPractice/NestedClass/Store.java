package edu.umass;

public class Store{

    public static void main(String[] args){

        Meal regularMeal = new Meal();
        Meal convertedMeal = new Meal(0.68);

        regularMeal.addToppings("Bacon", "Cheese", "Cheddar");

        System.out.println(regularMeal);
        System.out.println(convertedMeal);
    }
}
