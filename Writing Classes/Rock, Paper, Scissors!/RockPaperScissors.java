import java.util.Scanner;

public class RockPaperScissors
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
        
    public static String getWinner(String user, String computer)
    {
        if(user.equals(computer)){
            return TIE;
        }
        if(user.equals("rock")){
            if(computer.equals("paper")){
                return COMPUTER_PLAYER;
            }
            return USER_PLAYER;
        }
        if(user.equals("paper")){
            if(computer.equals("scissors")){
                return COMPUTER_PLAYER;
            }
            return USER_PLAYER;
        }
            if(computer.equals("rock")){
                return COMPUTER_PLAYER;
            }
            return USER_PLAYER;
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String user,computer;
        for(;;){
        System.out.println("Enter your choice (rock, paper, or scissors): ");
 user = scanner.nextLine();
 if(user.equals("")){
     break;
 }
 int tmp=Randomizer.nextInt(1,3);
 if(tmp==1){
     computer="rock";
 }else if(tmp==2){
     computer="paper";
 }else{
     computer="scissors";
 }
 System.out.println("User: "+user);
 System.out.println("Computer: "+computer);
 System.out.println(getWinner(user,computer));
 
}
System.out.println("Thanks for playing!");
    }
}