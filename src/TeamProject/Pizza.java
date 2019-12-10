package TeamProject;

public class Pizza extends Food {
    // inherits form Food class
    private String size = "s";
    //validSize [s,m,l]; create an array with the valid inputs to check for errors
    //create an additional set and get method for size
    private String topping = "n";
    //validToppings [Pepperoni, sausage, peppers, chicken, salami, tomatoes, olives, anchovies ]; create an array with the valid inputs to check for errors
    //create an additional set and get method for size

    @Override // override the Food toString to include the size and toppings in the output
    public String toString() {
        return super.toString();
    }

}
