public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        
        // Put your code here!
        double angle = Math.PI/4;
double cosine = Math.cos(angle); // 0.707106781
cosine = cosine * 100;       // 70.7106781
cosine = Math.round(cosine);  // 71.0
cosine = cosine / 100.0;     // 0.71

// Or put it all on one line:
cosine = Math.round(cosine * 100) / 100.0;
        
System.out.println("0.0: 1.0, 0.0");
System.out.println("1.5707963267948966: 0.0, 1.0");
System.out.println("3.141592653589793: -1.0, 0.0");
    }
}