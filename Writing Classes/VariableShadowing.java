public class VariableShadowing
{
    private static String name = "Instance Variable";
    
    public static void main(String[] args)
    {
        printInstanceVar();
        printLocalVar();
        printParameter("Parameter");
    }
    
    // Inside this method, name refers to the
    // instance variable name
    public static void printInstanceVar()
    {
        System.out.println(name);
    }
    
    // Inside this method, name refers to the
    // local variable name
    public static void printLocalVar()
    {
        String name = "Local Variable";
        System.out.println(name);
    }
    
    // Inside this method, name refers to the
    // parameter name
    public static void printParameter(String name)
    {
        System.out.println(name);
    }
}
