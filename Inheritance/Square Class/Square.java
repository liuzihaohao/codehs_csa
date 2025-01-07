public class Square extends Rectangle {
    
    public Square(int sideLength) {
        super(sideLength, sideLength);
    }
    
    public double getSideLength() {
        return super.getHeight();
    }
    
    // To call a method from the superclass, we use super as the object
    @Override
    public String toString() {
        return "Square with an area of " + super.area(); 
    }
}