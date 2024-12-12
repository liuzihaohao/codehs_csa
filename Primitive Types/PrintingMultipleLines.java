public class Printing
{
    public static void main(String[] args)
    {
        /* You can use println to go to a new line
         * at the end of the print statement.
         */
        System.out.println("Hello world.");
        System.out.println("Another line");
        
        /* Using just print will keep you on the
         * same line.
         */
        System.out.print("Print will add to ");
        System.out.print("the same line!");
        
        /* Even if you use a println after a print
         * statement, you will only go to a new
         * line AFTER that print statement.
         */
        System.out.println(" New line after this!");
         
        /* You can also go to a new line by adding
         * a blank println statement.
         */
        System.out.print("Print on one line");
        System.out.println();
        System.out.print("Print on another line");
        System.out.println();
        
        /* Alternatively, you can add a \n into
         * your statement and it will go to a
         * new line.
         */
        System.out.print("First line\nSecond Line\n");
         
    }
}