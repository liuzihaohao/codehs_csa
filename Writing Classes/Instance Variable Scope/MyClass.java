public class MyClass {

    // Instance variables are defined at the top of the class
    private String instanceVariable = "Hello! I'm an instance variable!";
    private static int counter = 0; 
    
    public MyClass() {
        // You can call the variable abywhere in the class
        // by referenceing the variable name
        System.out.println("instanceVariable exists in the constructor: " + instanceVariable);
        counter++;
        System.out.println("Counter: " + counter);
        System.out.println();
    }
    
    public void method1()
    {
        
        System.out.println("and in method1: " + instanceVariable);
        counter++;
        System.out.println("Counter: " + counter);
        System.out.println();
    }
    
    public void method2()
    {
        System.out.println("and in method2: " + instanceVariable);
        counter++;
        System.out.println("Counter: " + counter);
        System.out.println();
    }
    
}