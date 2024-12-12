public class Gradebook
{
       public static void main(String[] args)
       {
            int[][] gradeBook = {{90, 87, 86, 56, 96},
                                {65, 76, 87, 84, 93},
                                {85, 56, 91, 90, 65},
                                {65, 56, 78, 31, 65},
                                {85, 56, 71, 80, 39}};
                             
            //Iterate through each row in the gradebook   
            for(int row = 0; row < gradeBook.length; row++)
            {
                System.out.print("Week "+ (row +1)+ " Scores: ");
                //Iterate through each score in a row
                for(int grade: gradeBook[row])
                {
                    System.out.print(grade + " ");
                }
                System.out.println();
            }
       }

}