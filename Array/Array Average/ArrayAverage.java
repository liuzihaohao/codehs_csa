public class ArrayAverage
{
   private int[] values;

   public ArrayAverage(int[] theValues)
   {
      values = theValues;
   }

   public double getAverage()
   {
       double res=0;
       
     // your code goes here!
     for(int tmp:values){
         res+=tmp;
     }
     return res/values.length;
   }
}