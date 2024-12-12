public class ImplicitCasting
{
    public static void main(String[] args)
    {
        int x = 10;                    // occupies 4 bytes (32 bits)
        double y = x;                  // occupies 8 bytes (64 bits)
        System.out.println(y);         // prints 10.0
    }
}
