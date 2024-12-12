public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Create a calculator object
        Calculator calc = new Calculator();
        
        // Notice the order of the parameters
        // corresponds to the order in which
        // the values are printed out
        calc.sum(3, 10);
        calc.multiply(-5, -7);
        
        int x = 5;
        calc.addFive(x);
        
        //Notice how the value of x remains 5, even after using it in the addFive method
        //Changes that occur within a method will not apply to the initial variable, unless that
        //variable is changed in the current class (CalculatorTester)
        System.out.println(x);
    }
}
