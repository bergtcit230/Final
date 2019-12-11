package TeamProject;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    //a method that displays the menu to the user
    public static void displayMenu(){
        //*Displays the Menu
        System.out.printf( "%-15s%-10s%-40s%-5s\n", "Food Item", "Size", "Options", "Price" );
        System.out.printf( "%-15s%-10s%-40s%-5s\n", "---------", "----", "-------", "-----" );
        System.out.printf( "%-15s%-10s%-40s%-5s\n", "Drink", "S,M,L", "Sprite, Rootbeer, and Orange Fanta", "$5.50 for small, +$.50 for each size increase\n" );
        System.out.printf( "%-15s%-10s%-40s%-5s\n", "Burger", "N/A", "Extra Patty, bacon, cheese, lettuce", "$3.00 for a burger, +$.50 for additional toppings" );
        System.out.printf( "%-15s%-10s%-40s%-5s\n", "", "", "tomato, pickles, onions", "\n" );
        System.out.printf( "%-15s%-10s%-40s%-5s\n", "Pizza", "S,M,L", "Pepperoni, sausage, peppers, chicken", "$5.00 for small, +$2.50 for each size increase," );
        System.out.printf( "%-15s%-10s%-40s%-5s\n", "", "", "salami, tomatoes, olives, anchovies", "+$1.00 for each extra topping" );
    }

    //a method that will ask the user if they would like to start a new order
    public static boolean newOrder(){
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        boolean Continue = false;
        int x = 0;
        //Ask user if they would like to order
        do {
            System.out.print("Would you like to start a new order (y or n):  ");

            String answer = input.nextLine();
            switch (answer) {
                case "Y":
                case "y":
                case "Yes":
                case "yes":
                    Continue = true;
                    x=0;
                    break;
                case "N":
                case "n":
                case "No":
                case "no":
                    Continue = false;
                    x=0;
                    break;
                default:
                    System.out.println("invalid choice");
                    x++;
                    break;
            }
        } while (x>0);
        return Continue;
    }

    //a method that asks the user what they would like to order
    public static String orderItem(){
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        String item = "";
        int x = 0;
        //Ask user if what they would like to order.
        do {
            System.out.print("Enter the item you would like.\n" +
                    "D-Drink\n" +
                    "B- Burger\n" +
                    "P-Pizza\n");

            String answer = input.nextLine();
            switch (answer) {
                case "D":
                case "d":
                case "Drink":
                case "drink":
                    item="D";
                    x=0;
                    break;
                case "B":
                case "b":
                case "Burger":
                case "burger":
                    item = "B";
                    x=0;
                    break;
                case "P":
                case "p":
                case "Pizza":
                case "pizza":
                    item = "P";
                    x=0;
                    break;
                default:
                    System.out.println("invalid choice");
                    x++;
                    break;
            }
        } while (x>0);
        return item;
    }

    //a method that depending on what the user orders shows food options
    public static void addToOrder(ArrayList order){
        String itemOrdered = orderItem();
        switch (itemOrdered) {
            case "D":
                order.add(orderDrink());
                break;
            case "B":
                order.add(orderBurger());
                break;
            case "P":
                order.add(orderPizza());
                break;
            default:
                break;
        }
    }

    //a method that shows the Beverage options
    public static Beverage orderDrink(){
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        String size = "";
        String type ="";
        int x = 0;
        int y =0;
        //Ask user if what size and type of drink they would like to order.
        do {
            System.out.print("What size of Drink would you like?\n" +
                    "S-Small\n" +
                    "M-Medium\n" +
                    "L-Large\n");

            String answer = input.nextLine();
            switch (answer) {
                case "S":
                case "s":
                case "Small":
                case "small":
                    size="Small";
                    x=0;
                    break;
                case "M":
                case "m":
                case "Medium":
                case "medium":
                    size = "Medium";
                    x=0;
                    break;
                case "L":
                case "l":
                case "Large":
                case "large":
                    size = "Large";
                    x=0;
                    break;
                default:
                    System.out.println("invalid choice");
                    x++;
                    break;
            }
        } while (x>0);

        do {
            System.out.print("What soda do you prefer?\n" +
                    "S- Sprite\n" +
                    "R- Rootbeer\n" +
                    "F- Orange Fanta\n");

            String answer = input.nextLine();
            switch (answer) {
                case "S":
                case "s":
                case "Sprite":
                case "sprite":
                    type="Sprite";
                    x=0;
                    break;
                case "R":
                case "r":
                case "Rootbeer":
                case "rootbeer":
                    type = "Rootbeer";
                    x=0;
                    break;
                case "F":
                case "f":
                case "Fanta":
                case "fanta":
                case "Orange Fanta":
                case "orange fanta":
                    type = "Orange Fanta";
                    x=0;
                    break;
                default:
                    System.out.println("invalid choice");
                    x++;
                    break;
            }
        } while (x>0);
        return new Beverage("Drink",size, type);
    }

    //a method that shows the Burger options
    public static Burger orderBurger(){
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        String size = "";
        ArrayList<String> toppings =new ArrayList<>();;
        int x = 0;
        int y =0;
        int z = 0;
        int a = 0;
        //Ask user what toppings they would like to order
        do {
            do {
                System.out.print("What toppings would you like to add? Each burger starts with a bun and patty.\n" +
                        "E- extra patty\n" +
                        "B- bacon\n" +
                        "C- cheese\n" +
                        "L- lettuce\n" +
                        "T- tomato\n" +
                        "P- pickles\n" +
                        "O- onions\nPlease enter your toppings one at a time.\n");
                String answer = input.nextLine();

                switch (answer) {
                    case "e":
                    case "E":
                    case "Extra Patty":
                    case "extra patty":
                        toppings.add("Extra Patty");
                        y = 0;
                        break;
                    case "B":
                    case "b":
                    case "Bacon":
                    case "bacon":
                        toppings.add("Bacon");
                        y = 0;
                        break;
                    case "C":
                    case "c":
                    case "Cheese":
                    case "cheese":
                        toppings.add("Cheese");
                        y = 0;
                        break;
                    case "L":
                    case "l":
                    case "lettuce":
                    case "Lettuce":
                        toppings.add("Lettuce");
                        y = 0;
                        break;
                    case "T":
                    case "t":
                    case "Tomato":
                    case "tomato":
                        toppings.add("Tomato");
                        y = 0;
                        break;
                    case "P":
                    case "p":
                    case "Pickles":
                    case "pickles":
                        toppings.add("Pickles");
                        y = 0;
                        break;
                    case "O":
                    case "o":
                    case "Onion":
                    case "onion":
                        toppings.add("Onion");
                        y = 0;
                        break;
                    default:
                        System.out.println("invalid choice");
                        y++;
                        break;
                }
            } while (y > 0);

            do {
                System.out.print("Would you like any more toppings (y or n):  ");

                String answer = input.nextLine();
                switch (answer) {
                    case "Y":
                    case "y":
                    case "Yes":
                    case "yes":
                        a=0;
                        z++;
                        break;
                    case "N":
                    case "n":
                    case "No":
                    case "no":
                        a=0;
                        z=0;
                        break;
                    default:
                        System.out.println("invalid choice");
                        a++;
                        break;
                }
            } while (a>0);
        }while (z>0);
        return new Burger("Burger",size,toppings);
    }

    //a method that shows the Pizza options
    public static Pizza orderPizza(){
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        String size = "";
        ArrayList<String> toppings =new ArrayList<>();

        int x = 0;
        int y =0;
        int z=0;
        int a=0;

        //Ask user if what size and toppings they would like to add to their pizza
        do {
            System.out.print("What size of Pizza would you like?\n" +
                    "S-Small\n" +
                    "M-Medium\n" +
                    "L-Large\n");

            String answer = input.nextLine();
            switch (answer) {
                case "S":
                case "s":
                case "Small":
                case "small":
                    size="Small";
                    x=0;
                    break;
                case "M":
                case "m":
                case "Medium":
                case "medium":
                    size = "Medium";
                    x=0;
                    break;
                case "L":
                case "l":
                case "Large":
                case "large":
                    size = "Large";
                    x=0;
                    break;
                default:
                    System.out.println("invalid choice");
                    x++;
                    break;
            }
        } while (x>0);

        do {
            do {
                System.out.print("What toppings would you like to add? Each pizza starts with cheese and red sauce.\n" +
                        "P- pepperoni\n" +
                        "S- sausage\n" +
                        "O- olives\n" +
                        "A- anchovies \n Please enter your toppings one at a time.\n");
                String answer = input.nextLine();

                switch (answer) {
                    case "P":
                    case "p":
                    case "Pepperoni":
                    case "pepperoni":
                        toppings.add("Pepperoni");
                        y = 0;
                        break;
                    case "S":
                    case "s":
                    case "Sausage":
                    case "sausage":
                        toppings.add("Sausage");
                        y = 0;
                        break;
                    case "A":
                    case "a":
                    case "Anchovies":
                    case "anchovies":
                        toppings.add("Anchovies");
                        y = 0;
                        break;
                    case "O":
                    case "o":
                    case "Olives":
                    case "olives":
                        toppings.add("Olives");
                        y = 0;
                        break;
                    default:
                        System.out.println("invalid choice");
                        y++;
                        break;
                }
            } while (y > 0);

            do {
                System.out.print("Would you like any more toppings (y or n):  ");

                String answer = input.nextLine();
                switch (answer) {
                    case "Y":
                    case "y":
                    case "Yes":
                    case "yes":
                        a=0;
                        z++;
                        break;
                    case "N":
                    case "n":
                    case "No":
                    case "no":
                        a=0;
                        z=0;
                        break;
                    default:
                        System.out.println("invalid choice");
                        a++;
                        break;
                }
            } while (a>0);
        }while (z>0);
        return new Pizza("Pizza", size, toppings);
    }

    //a method that asks if the user would like to continue ordering
    public static boolean continueOrdering(){
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        boolean Continue = false;
        int x = 0;
        //Ask user if they would like to order
        do {
            System.out.print("Would you like to order more (y or n):  ");

            String answer = input.nextLine();
            switch (answer) {
                case "Y":
                case "y":
                case "Yes":
                case "yes":
                    Continue = true;
                    x=0;
                    break;
                case "N":
                case "n":
                case "No":
                case "no":
                    Continue = false;
                    x=0;
                    break;
                default:
                    System.out.println("invalid choice");
                    x++;
                    break;
            }
        } while (x>0);
        return Continue;
    }

    public static void main(String[] args) throws IOException {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Tells the user what the program does.
        System.out.println("Welcome to Tiffany’s Restaurant. We offer an array of delicious food items. " +
                "Take a look at our menu below.\n");

        //Display Menu
        displayMenu();

        // Ask the User if they would like to start a new order
        Boolean answer = newOrder();

        //Depending on if they would like to start a new order or not either continue
        //ordering process or display good bye greeting
        if (answer) {
            //creates an order ArrayList so each of the Food items can be added
            ArrayList<Food> order = new ArrayList<>();

            //Calls the addToOrder method with the Array to capture the order.
            addToOrder(order);

            //Ask the user if they would like to continue ordering
            Boolean notDoneOrdering;
            do{
                addToOrder(order);
                notDoneOrdering = continueOrdering();

            }while(notDoneOrdering);

            //Once the order is complete write the order to a file
            try(PrintWriter data = new PrintWriter("order.txt")){
                java.util.Date dateCreated = new java.util.Date();
                data.print(dateCreated);
                for(Food x : order){
                   data.print( x.toString());
                }
            }
            //Read the order back from the file
            File myFile = new File("order.txt");
            try (Scanner inputFile = new Scanner(myFile)) {
                while(inputFile.hasNextLine()){
                    String line = inputFile.nextLine();
                    System.out.println(line);
                }
            }

            //Show the goodbye Greeting.
            System.out.println("Thank you for coming. Have a great day. See you next time!");

        }
        else {
            System.out.println("Thank you for coming. Have a great day. See you next time!");
        }



    }
}
