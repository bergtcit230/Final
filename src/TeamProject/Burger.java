package TeamProject;
import java.sql.Array;
import java.util.ArrayList;

/**
 * Burger Class
 * Purpose” creates an object burger that inherits from Food class.
 * constructs a burger w/ toppings and cost
 */

public class Burger extends Food {
    // inherits form Food class
    private Array toppings;
    private Array validToppings;
    //validToppings [Patty, bacon, cheese, lettuce, tomato, pickles, onions ]; create an array with the valid inputs to check for errors
    private String topping = "n"; //  default toppings n = none

    public void setToppings(){
        /**
         * setToppings
         * Purpose: adds a topping to the burger's Toppings List.
         */
    }
    public Array getToppings(){
        /**
         * Purpose: returns the toppings for a burger object.
         * @return Array (topping)
         */
        return toppings;
    }
    public void setCost() {
//        double price = 5.00;
//        for (topping:toppings) {
//            price += .50;
//        }
//        super.setCost(price);
    }

    @Override // override the Food toString to include the size and toppings in the output
    public String toString() {
        return super.toString();
    }

}
