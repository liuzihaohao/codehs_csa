import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        
       System.out.println("Hello! What is your name?");
       Bot2 bot=new Bot2(scanner.nextLine());
       bot.greeting();
       
       System.out.println("\nWhat is your favorite animal?");
       bot.favoriteAnimal(scanner.nextLine());
       
       System.out.println("\nIf you could visit any place, where would you go? ");
       bot.destination(scanner.nextLine());
       
       System.out.println("\nWhat is your favorite number?");
       bot.favoriteNumber(scanner.nextInt());
       
       System.out.println();
       bot.goodbye();
    }
}