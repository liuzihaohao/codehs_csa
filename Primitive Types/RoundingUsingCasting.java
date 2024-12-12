public class RoundingWithCasting
{
    public static void main(String[] args)
    {
        double value1 = 10.0;
        double value2 = 10.3;
        double value3 = 10.5;
        double value4 = 10.7;
        double value5 = 10.9;
        double value6 = 11.1;
        
        int rounded1 = (int) (value1 + 0.5);
        int rounded2 = (int) (value2 + 0.5);
        int rounded3 = (int) (value3 + 0.5);
        int rounded4 = (int) (value4 + 0.5);
        int rounded5 = (int) (value5 + 0.5);
        int rounded6 = (int) (value6 + 0.5);
        
        System.out.println("Adding 0.5 then casting to an int will round to the\n" + 
                            "nearest int.\n" +
                            "If the decimal is 0.5 or greater, this will round up.\n" +
                            "If the decimal is less than 0.5, this will round down\n" +
                            "Can you determine why?");
        
        System.out.print(value1);
        System.out.print(" rounded = ");
        System.out.println(rounded1);
        
        System.out.print(value2);
        System.out.print(" rounded = ");
        System.out.println(rounded2);
        
        System.out.print(value3);
        System.out.print(" rounded = ");
        System.out.println(rounded3);
        
        System.out.print(value4);
        System.out.print(" rounded = ");
        System.out.println(rounded4);
        
        System.out.print(value5);
        System.out.print(" rounded = ");
        System.out.println(rounded5);
        
        System.out.print(value6);
        System.out.print(" rounded = ");
        System.out.println(rounded6);
    }
}
