public class AllFunctionsCalculator
{
    public static void main(String[] args)
    {
        //Try changing the values for any of the variables below to see how the output changes. 
        int num = 2; 
        
        int sum = 5; 
        int difference = 5;
        int product = 5;
        int dividend = 5;
        int modulo = 5; 
        
        // Why does the dividend output NOT give the intended result? Explain. 
        sum += num;
        difference -= num; 
        product *= num; 
        dividend /= num; 
        modulo %= num; 
        
        System.out.print("The sum is ");
        System.out.println(sum);
        System.out.print("The difference is ");
        System.out.println(difference);
        System.out.print("The product is ");
        System.out.println(product);
        System.out.print("The dividend is ");
        System.out.println(dividend);
        System.out.print("The modulo is ");
        System.out.println(modulo);
    }
}
