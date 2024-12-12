public class Main
{
    public static void main(String[] args)
    {
        /* Strings in Java are treated different than both objects and
        primitive variables. They are generally treated like objects, but Java
        used a 'String Pool' to store Strings that may be seen often in the 
        program.
        
        When we assign a string value to the string variable, Java will check
        if the string with the equal value is already present in the string  
        pool. If it is not present in the string pool, it will be added to
        the constant pool and the reference to that string object is returned.
        */
        String literal = "Test!";
        
        /*If a String is present in the string pool, the reference to the memory 
	    address of that string object is returned. In this case, because "Test!"
	    has already been added to the pool on line 10, the String anotherLiteral
	    references the existing call to the String object "Test!" */
	    String anotherLiteral = "Test!";
	    
	    /*The first comparison is true because both variables reference the same 
	    String object in memory. */
	    System.out.println("Java Pool Reference using ==: " + (anotherLiteral == literal));
	    //The second is true because the value of both Strings is the same.
	    System.out.println("Java Pool Reference using equals: " + anotherLiteral.equals(literal));
	    
	    
	    /*If a new String is created with the keyword new, the new String is stored
	    separately in a different part of memory known as the heap*/
	    String strObject = new String("Test!");
	   
    	/*The first comparison is false because the two variables reference different
    	String objects in different locations.*/
    	System.out.println("Using ==: " + (literal == strObject));
    	
    	//The second is true because the content of both String objects is the same.
	    System.out.println("Using equals: " + literal.equals(strObject));
	    
	    /* The morale of the story: Always use .equals to compare Strings. It
	    always works as expected. Using == may work, but the results can be
	    inconclusive if the values are not equal.
	    */
    }
}