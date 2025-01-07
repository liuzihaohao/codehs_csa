import java.util.ArrayList;
import java.util.Scanner;

public class FantasyFootball
{
    public static void main(String[] args)
    {
        ArrayList<String> availablePlayers = new ArrayList<String>();
        addPlayers(availablePlayers);
        Scanner scan=new Scanner(System.in);
        
        ArrayList<String> tmp=new ArrayList<String>();
        
        int now=0;
        while(now<5){
            System.out.println("Enter name of player to add: ");
            String tmmmp=scan.nextLine();
            int index=search(availablePlayers,tmmmp);
            if(index>=0){
                System.out.println("Successfully added player");
                tmp.add(availablePlayers.get(index));
                availablePlayers.remove(index);
                now++;
                System.out.println();
            }else{
                System.out.println(tmmmp+" is not an available player.\n");
            }
        }
        System.out.println("Final Team Roster: ");
        for(String i:tmp){
            System.out.println(i);
        }
    }
    
    public static int search(ArrayList<String> array, String player)
    {
for(int i=0;i<array.size();i++){
    if(array.get(i).equals(player)){
        return i;
    }

}return -1;
    }
    
    public static void addPlayers(ArrayList<String> array)
    {
        //Feel free to add names of your favorite players to this list!
        //But make sure you DON'T remove any players from it!
        array.add("Cam Newton");
        array.add("Antonio Brown");
        array.add("Leveon Bell");
        array.add("Patrick Mahomes");
        array.add("Saquon Barkley");
        array.add("Mike Evans");
        array.add("Odell Beckham Jr.");
        array.add("Travis Kelce");
        array.add("Baker Mayfield");
        array.add("Michael Thomas");
        array.add("Julio Jones");
        array.add("Ezekial Elliott");
        array.add("Alvin Kamara");
        array.add("Davante Adams");
        array.add("Aaron Rogers");
    }
}