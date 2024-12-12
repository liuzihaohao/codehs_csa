public class MyProgram
{
    public static void main(String[] args)
    {
        int intTempF = 70;
        
        /* This will evaluate incorrectly and print 0.0. 
         * Even though convert1 is a double, every
         * number used in the calculation is an int
         * and 5 / 9 will evaluate to zero. After
         * evaluating to 0, saving it as a double
         * will convert to 0.0.
        */
        
        double convert1 = 5 / 9 * (intTempF - 32);
        System.out.println(convert1);
        
        /* This will evaluate correctly and print  
         * 21.11111111111111. The difference with  
         * this calculation is that the 5.0 converts
         * the first calculation to a double. The
         * double is then carried through the entire
         * equation and printed out.
        */
        
        double convert2 = 5.0 / 9 * (intTempF - 32);
        System.out.println(convert2);
        
        /* Convert 3 still produces 0.0 because
         * the 5 / 9 evaluated to zero before 
         * multiplying by the double.
         *
         * Convert 4 works correctly because 
         * the doubleTempF - 32 produces a double
         * that then gets multiplied by an int
         * (producing a double) which is then
         * divided by an int, but remains a double.
         */
        
        double doubleTempF = 70;
        
        double convert3 = 5 / 9 * (doubleTempF - 32);
        System.out.println(convert3);
        
        double convert4 = (doubleTempF - 32) * 5 / 9;
        System.out.println(convert4);
    }
}
