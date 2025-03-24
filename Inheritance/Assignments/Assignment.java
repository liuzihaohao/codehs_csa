public class Assignment
{
    private String name;
    private String dueDate;
    private double availablePoints;
    private double earnedPoints;
    public Assignment(String name, String dueDate, double availablePoints, double earnedPoints){
        this.name=name;
        this.dueDate=dueDate;
        this.availablePoints=availablePoints;
        this.earnedPoints=earnedPoints;
    }
    public double getEarnedPoints(){
        return earnedPoints;
    }
    public double getAvailablePoints(){
        return availablePoints;
    }
    public String getName(){
        return name;
    }
    public String getDueDate(){
        return dueDate;
    }
}