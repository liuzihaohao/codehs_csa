import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        String first = "apple";
        String last = "zebra";
        
        // Compare apple and zebra
        boolean isSmaller = first.compareTo(last) < 0;
        System.out.println(first + " comes before " + last + "?");
        System.out.print(first.compareTo(last) + " means ");
        System.out.println(isSmaller);
        
        
        // Compare zebra and apple
        isSmaller = last.compareTo(first) < 0;
        System.out.println(last + " comes before " + first + "?");
        System.out.print(last.compareTo(first) + " means ");
        System.out.println(isSmaller);
        
        
        
        // In lexicographical order, capital letters
        // come before lowercase letters
        // Meaning according to compareTo,
        // capital letters are "smaller" than lowercase letters.
        // compareTo will return a negative number
        String tree = "Oak";
        String smallTree = "oak";
        
        isSmaller = tree.compareTo(smallTree) < 0;
        
        System.out.println(tree + " comes before " + smallTree + "?");
        System.out.print(tree.compareTo(smallTree) + " means ");
        System.out.println(isSmaller);
        
        
        isSmaller = smallTree.compareTo(tree) < 0;
        System.out.println(smallTree + " comes before " + tree + "?");
        System.out.print(smallTree.compareTo(tree) + " means ");
        System.out.println(isSmaller);
        
        
        // Input two words to see which is bigger
        Scanner input = new Scanner(System.in);
        String word1, word2;
        System.out.println();
        System.out.println("Enter two words: (hit enter between words): ");
        word1 = input.nextLine();
        word2 = input.nextLine();
        
        isSmaller = word1.compareTo(word2) < 0;
        System.out.println(word1 + " comes before " + word2 + "?");
        System.out.print(word1.compareTo(word2) + " means ");
        System.out.println(isSmaller);
        
    }
}
