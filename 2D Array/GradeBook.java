public class GradeBook
{
    public static void main(String[] args)
    {
        int[] week1 = {90, 87, 86, 56, 96};
        int[] week2 = {65, 76, 87, 84, 93};
        int[] week3 = {85, 56, 91, 90, 65};
        int[] week4 = {65, 56, 78, 31, 65};
        int[] week5 = {85, 56, 71, 80, 39};
        int[][] gradeBook = {week1, week2, week3, week4, week5};
        System.out.println("Alex  Harry  Ellen  Sammy  Pat");
        print2D(gradeBook);
        
        int grade = gradeBook[3][3];
        System.out.println("\nSammy's Grade for Week 4: " + grade);
        int grade2 = gradeBook[1][0];
        System.out.println("\nAlex's Grade for Week 2: " + grade2);
        
    }
    
    
    //This is a method to print the 2D array.
    //We will learn more about this in the next lesson!
    public static void print2D(int[][] array)
    {
        for(int[] elem: array)
        {
            for(int num: elem)
            {
                System.out.print(num+ "     ");
            }
            System.out.println();
        }
    }
}