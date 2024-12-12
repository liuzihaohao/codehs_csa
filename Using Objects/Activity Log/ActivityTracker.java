public class ActivityTracker
{
    public static void main(String[] args)
    {
        ActivityLog mylog = new ActivityLog();
        
        mylog.addMiles(5);
        mylog.addHours(1);
        
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        
        // Save today's hours
        double hoursToday = mylog.getHours();
        
        // Add hours for next two days
        mylog.addHours(1.5);
        mylog.addHours(3);
        
        // Print out the increase in hours
        double increase = mylog.getHours() - hoursToday;
        
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}
