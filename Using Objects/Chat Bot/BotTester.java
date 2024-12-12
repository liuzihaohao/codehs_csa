import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        //Put your code here
        System.out.println("Hello! What is your name?");
        Scanner scanner = new Scanner(System.in);
        
        
        Bot bot = new Bot(scanner.nextLine());
        bot.greeting();
        bot.help();
        System.out.println();

        System.out.println("Tell me Bot, which countries use the imperial system?");
        bot.imperialCountries();
        System.out.println();

        System.out.println("Tell me Bot, what was the first computer bug?");
        bot.firstBug();
        System.out.println();

        bot.goodbye();
    }
}