public class Power
{
    //instance variables for Power object
	private String name;
	private int strength;
    
    /**
    Initializes a Power object. 
    Precondition: Power object must take a String theName and int theStrength 
    Postcondition: Instance variables String name and int strength are initialized with 
    String theName, and int theStrength.
    
    @param theName -String to initialize instance variable name for Power object
    @param theStrength - int to initialize instance variable strength for Power object
    */
	public Power(String theName, int theStrength)
	{
	    //initialize instance variables of Power object
		name = theName;
		strength = theStrength;
	}
	
	/**
    Returns the String name of a given Power object.
    Precondition: Power object must be initialized.
    Postcondition: Returns String name accessed from the Power object.
    
    @return name -the name of the Power object
    */
	public String getName()
	{
		return name;
	}

    /**
    Returns the int strength of a given Power object.
    Precondition: Power object must be initialized.
    Postcondition: Returns int strength accessed from the Power object.
    
    @return strength -the strength of the Power object
    */
	public int getStrength()
	{
		return strength;
	}
	
	/**
    Sets the strength value of a given Power object.
    Precondition: Power object must be initialized.
    Postcondition: int strength of Power object is changed to the value of int theStrength
    
    @param theStrength -the new value of strength to be set for Power object
    */
	public void setStrength(int theStrength)
	{
	    strength = theStrength;
	}
}