//This example reviews the equals method for comparing strings

import java.util.Scanner;

public class ComparingStrings
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        //Ask user to input a string
        System.out.println("What is your favorite website?");
        String favoriteWebsite = input.nextLine();
        
        //We can compare two Strings using equals(). 
        //The method returns true if both Strings have the same characters! 
        //Returns true if favoriteWebsite is equal to CodeHS and prints message; 
        //returns false otherwise and prints message
        if(favoriteWebsite.equals("CodeHS"))
        {
            System.out.println("Good Choice");
        }
        else 
        {
            System.out.println("Are you sure that's your favorite website?");
        }
    }
}