public class Ball
{
   private double diameter;
   
   public Ball(double diameter){
       this.diameter = diameter;
   }
   
    public double getDiameter(){
       return diameter;
   }
   
   // Write an equals method here that returns true if
   // the diameters are the same.
   
   // Write a toString statement here, in this format:
   // Diameter: 2.75
   
   public boolean equals(Ball other){
       if(this.diameter==other.diameter){
           return true;
       }else{
           return false;
       }
   }
   
   public String toString(){
       return "Diameter: "+getDiameter();
   }
}