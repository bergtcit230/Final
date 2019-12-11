package TeamProject;
import java.sql.Array;
import java.util.ArrayList;
/**
 * Pizza
 * Purpose” creates an object pizza that inherits from Food class.
 * constructs a pizza w/ size, toppings and cost.
 */

public class Pizza extends Food {
    // inherits form Food class
    private String size = "s";
    private ArrayList toppings;
    private Array validToppings;
    //validSize [s,m,l]; create an array with the valid inputs to check for errors
    //create an additional set and get method for size
    private String topping = "n";
    //validToppings [Pepperoni, sausage, peppers, chicken, salami, tomatoes, olives, anchovies ]; create an array with the valid inputs to check for errors
    //create an additional set and get method for size
    public void setToppings(String topping){
        // add topping to the Pizza's toppings
    }
    public void setSize(String size) {
        this.size = size;
    }
    public ArrayList getToppings(){
        /**
         * getToppings
         * Purpose: returns the toppings for a burger object.
         * @return ArrayList (topping)
         */
        return toppings;
    }
    public String getSize() {
        return size;
    }

    public double setCost() {
    if(size.equals("s")){
        super.setCost(5.00);
    } else if(size.equals("m")){
        super.setCost(7.00);
    } else if(size.equals("l")){
        super.setCost(10.00);
    }
    return super.getCost();
    }

    @Override // override the Food toString to include the size and toppings in the output
    public String toString() {
        return super.toString();
    }

}
