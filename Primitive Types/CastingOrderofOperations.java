public class CastingOrderOfOperations
{
    public static void main(String[] args)
    {
        // Casting to an int chops off the decimal, rather than rounding
        // to the nearest int.
        int doubleCastedToInt = (int) 10.9 ;
        System.out.println("Casting to an int: ");
        System.out.print("(int) 10.9 = ");
        System.out.println(doubleCastedToInt);
        System.out.println();
        
        // Casting takes place before any arithmetic operations
        // like addition, subtraction, multiplication, division, modulus
        // But parentheses take precendence over all.
        double castNumerator = (double) 2 / 3;
        System.out.println("Casting numerator: ");
        System.out.print("(double) 2 / 3 = ");
        System.out.println(castNumerator);
        System.out.println();
        
        double castDenominator = 2 / (double) 3;
        System.out.println("Casting denominator: ");
        System.out.print("2 / (double) 3 = ");
        System.out.println(castDenominator);
        System.out.println();
        
        double castNeither = 2 / 3;
        System.out.println("Casting neither (integer division): ");
        System.out.print("2 / 3 = ");
        System.out.println(castNeither);
        System.out.println();
        
        double castOutsideOfParentheses = (double) (2 / 3);
        System.out.println("Casting outside of parentheses: ");
        System.out.print("(double) (2 / 3) = ");
        System.out.println(castOutsideOfParentheses);
        System.out.println();
        
        // This casts the 5, which results in
        // 5.0 + 2 / 3. The integer division happens first, resulting in
        // 5.0 + 0 = 5.0
        double castWrongElement = (double) 5 + 2 / 3;
        System.out.println("Casting the 5...\n2 / 3 is unaffected by cast (be careful):");
        System.out.print("(double) 5 + 2 / 3 = ");
        System.out.println(castWrongElement);
        System.out.println();
        
        // This casts the 2, which results in
        // 5 + 2.0 / 3. The division will be double division, resulting in
        // 5 + 0.6666 = 5.6666
        double castCorrectElement = 5 + (double) 2 / 3;
        System.out.println("Cast happens before the division here:");
        System.out.print("5 + (double) 2 / 3 = ");
        System.out.println(castCorrectElement);
        System.out.println();
    }
}
