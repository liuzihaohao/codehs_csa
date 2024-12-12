public class BaseballPlayer
{
    private int hits;
    private int atBats;
    private String name;
    
    //Add constructor here
    public BaseballPlayer(String c,int a,int b){
        hits=a;
        atBats=b;
        name=c;
    }
    
    public void printBattingAverage()
    {
        double battingAverage = hits / (double) atBats;
        System.out.println(battingAverage);
    }
    
    public String toString()
    {
        return name + ": " + hits + "/" + atBats;
    }
    
    
}