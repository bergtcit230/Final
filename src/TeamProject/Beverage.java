package TeamProject;

public class Beverage extends Food {
 // inhearets form Food class
    private String size = "s";
    //validSize [s,m,l]; create an array with the valid inputs to check for errors
    //create an additional set and get method for size

    @Override // override the Food toString to include the size in the output
    public String toString() {
        return super.toString();
    }
}
