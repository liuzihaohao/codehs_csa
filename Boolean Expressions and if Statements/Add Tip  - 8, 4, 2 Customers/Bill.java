class Bill
{
	private double costOfMeal;
	private int totalCustomers;

    // Constructor
	public Bill(double totalBill, int numCustomers)
	{
		costOfMeal = totalBill;
		totalCustomers = numCustomers;
	}
	
	// Add a tip based on the number of guests
	// Notice how multiple else if statements are used to differentiate between the values of totalCustomers
	public void addTip()
    {
        if(totalCustomers >=8) 
        {
        	costOfMeal *= 1.25;
        }
        else if(totalCustomers >=4)
        {
        	costOfMeal *= 1.20;
        }
        else if(totalCustomers >=2)
        {
        	costOfMeal *= 1.05;
        }

        // costOfMeal doesn't change if
        // totalCustomers < 2

    }


    public String toString()
    {
        // Round the bill to two decimal places
        double roundedBill = Math.round(costOfMeal * 100.0) / 100.0;
        
        return "Bill for " + totalCustomers + " comes to $" + roundedBill;
    }
	
	
}
