package TeamProject;

public class Burger extends Food {
    // inhearets form Food class
    private String topping = "n";
    //validToppings [Patty, bacon, cheese, lettuce, tomato, pickles, onions ]; create an array with the valid inputs to check for errors
    //create an additional set and get method for size

    @Override // override the Food toString to include the size and toppings in the output
    public String toString() {
        return super.toString();
    }

}
