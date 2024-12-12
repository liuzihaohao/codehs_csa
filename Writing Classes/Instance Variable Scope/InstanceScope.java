public class InstanceScope
{
    public static void main(String[] args)
    {
        System.out.println("instanceVariable exists throughout the entire class.");
        System.out.println();
        
        // You can create a new object to see the effect
        MyClass obj = new MyClass();
        
        obj.method1();
        obj.method2();
    }
    
    
}