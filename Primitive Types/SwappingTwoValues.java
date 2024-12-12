public class Swap
{
    public static void main(String[] args)
    {
        /**
         * Variables can only hold one value so if
         * we want to swap the values of two variables
         * we need to use a third variable to help us
         * out.
         */
        
        
        String one = "Value one";
        String two = "Value two";
        
        System.out.println("Initial value of One: " + one);
        System.out.println("Initial value of Two: " + two);
        System.out.println();
        
        // Trying to swap without a third variable
        one = two;
        two = one;
        
        System.out.println("Without using a third variable:");
        System.out.println("Swapped value of One: " + one);
        System.out.println("Swapped value of Two: " + two);
        System.out.println();
        
        /** Now we will use a third variable to help us **/
        String three = "Value three";
        String four = "Value four";
        
        System.out.println("Initial value of Three: " + three);
        System.out.println("Initial value of Four: " + four);
        System.out.println();
        
        // Trying to swap with a third variable (temp)
        String temp = three; // Save the value of three to the temp variable
        three = four; // Safely overwrite the value of three
        four = temp; // Move the value from the temp back to four
        
        System.out.println("With using a third variable:");
        System.out.println("Swapped value of Three: " + three);
        System.out.println("Swapped value of Four: " + four);
    }
}
