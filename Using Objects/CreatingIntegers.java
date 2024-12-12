

// Integer and Double are in
// java.lang package


import java.lang.*;

public class IntegerExamples
{
    public static void main(String[] args)
    {
        // Explictly create an integer
        Integer x = new Integer(12);
        
        // Use autoboxing to have
        // Java convert the integer value
        // to an Integer object
        // Autoboxing: turning an int into an Integer
        Integer y = 12;
        
        // Use unboxing to convert the Integer
        // back to an int to print
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        
        
        // Use the methods to get the values
        // of x and y
        int sum = x.intValue() + y.intValue();
        String equation = x.toString() + " + " + y.toString();
        equation += " = " + sum;
        System.out.println(equation);
        
        // Can use Integers exactly like
        // you can use ints because
        // of unboxing
        // Unboxing: turning an Integer into an int
        int difference = x - y;
        equation = x + " - " + y + " = " + difference;
        System.out.println(equation);
        
        
    }
}
