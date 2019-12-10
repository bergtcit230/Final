package TeamProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This program creates an order");
        ArrayList order = new  ArrayList<Food>();

        for (int i = 0;i<3;i++) {
            Scanner input = new Scanner(System.in);
            Burger myShape = new Burger();
            System.out.println("Enter the item you would like to order (e.g. \"Burger, Pizza, Beverage\"):");
            String type = input.nextLine();
        }

        for (Object food : order) {
            System.out.println("\n" + food.toString());
            Food item = (Food) food;
            System.out.printf("Cost =", item.getCost());
        }
        System.out.printf("%nGoodbye...");
    }
}


