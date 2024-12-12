public class PlayerTester
{
    public static void main(String[] args) {
       
       //Start 
       
       CricketPlayer a=new CricketPlayer("Brian Lara");
       CricketPlayer b=new CricketPlayer("Fabian Allen","bbb");
       
       a.addMatch(1,1);
       a.addMatch(1,1);
       a.addMatch(1,1);
       a.addMatch(1,1);
       System.out.println("Brian Lara's Stats:");
       a.printRunsScored();
       a.printBallsBowled();
       System.out.println(a);
       System.out.println();
       
       a.addMatch(1,1);
       a.addMatch(1,1);
       a.addMatch(1,1);
       a.addMatch(1,1);
       System.out.println("Fabian Allen's Stats: ");
       a.printRunsScored();
       a.printBallsBowled();
       System.out.println(a);
       System.out.println();
       
    }
}