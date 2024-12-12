public class Update
{
    public static void main(String[] args)
    {
        int[] scores = {80, 92, 91, 68, 88};
        
        System.out.println("** Original Values **");
        //Print the values of score
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        
        // Attempt to add 5 in Enhanced For Loop
        for (int score : scores) {
            score += 5; //Does this work?
        }
        
        System.out.println("** Adding in a Enhanced For Loop **");
        //Print the values of score
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        
        // Attempt to add 5 in Standard For Loop
        for (int i = 0; i < scores.length; i++) {
            scores[i] += 5; //Does this work?
        }
        
        System.out.println("** Adding in a Standard For Loop **");
        //Print the values of score
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}