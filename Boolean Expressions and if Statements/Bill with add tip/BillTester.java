public class BillTester
{
    public static void main(String[] args)
    {
        // Create a bill for a (very expensive) birthday dinner
        Bill birthdayDinner = new Bill(250.46, 14);
        System.out.println("Birthday Dinner");
        System.out.println(birthdayDinner);
        
        // Add the tip
        birthdayDinner.addTip();
        System.out.println("\nBirthday Dinner after tip");
        System.out.println(birthdayDinner);
        
        
        // Another dinner with less guests
        System.out.println("\n\n"); // print a few blank lines
        birthdayDinner = new Bill(250.46, 7);  // reassign the variable to a new object
        System.out.println("Birthday Dinner");
        System.out.println(birthdayDinner);
        
        // Add the tip
        // Notice the difference in the final amount
        birthdayDinner.addTip();
        System.out.println("\nBirthday Dinner after tip");
        System.out.println(birthdayDinner);
        
        
    }
}
