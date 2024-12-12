public class RaterTesting
{
    public static void main(String[] args)
    {
        Rater a=new Rater("Company A",3);
        
        a.updateReview();
        System.out.println(a);
        
        a.setRating(4);
        a.updateReview();
        System.out.println(a);
    }
}