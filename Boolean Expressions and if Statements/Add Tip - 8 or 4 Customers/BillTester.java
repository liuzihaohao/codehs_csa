public class BillTester
{
    public static void main(String[] args)
    {
        double cost = 125.45;
        
        // Create a bill for a (very expensive) birthday dinner
        Bill birthdayDinner = new Bill(cost, 10);
        System.out.println("Birthday Dinner");
        System.out.println(birthdayDinner);
        
        // Add the tip
        birthdayDinner.addTip();
        System.out.println("\nBirthday Dinner after tip");
        System.out.println(birthdayDinner);
        
        
        // Another dinner with less guests
        System.out.println("\n\n"); // print a few blank lines
        birthdayDinner = new Bill(cost, 5);  // reassign the variable to a new object
        System.out.println("Birthday Dinner");
        System.out.println(birthdayDinner);
        
        // Add the tip
        // Notice the difference in the final amount
        birthdayDinner.addTip();
        System.out.println("\nBirthday Dinner after tip");
        System.out.println(birthdayDinner);
        

        // Another dinner with even less guests
        System.out.println("\n\n"); // print a few blank lines
        birthdayDinner = new Bill(cost, 2);  // reassign the variable to a new object
        System.out.println("Birthday Dinner");
        System.out.println(birthdayDinner);
        
        // Add the tip
        // Notice the difference in the final amount
        birthdayDinner.addTip();
        System.out.println("\nBirthday Dinner after tip");
        System.out.println(birthdayDinner);

        
    }
}
