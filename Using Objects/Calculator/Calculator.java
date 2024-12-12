public class Calculator
{
    /* This class doesn't need instance variable or
     * a constructor. You can create the same way
     * you create other objects, using empty
     * parenthesis.
     * Calculator c = new Calculator();
     *
     */
     
    // Prints the sum of x and y
    public void sum(int x, int y)
    {
        int result = x + y;
        System.out.print(x);
        System.out.print(" + ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
    
    // Prints the product of x and y
    public void multiply(int x, int y)
    {
        int result = x * y;
        System.out.print(x);
        System.out.print(" * ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
    }
    
    public void addFive(int x)
    {
        System.out.println(x + 5);
    }
}
