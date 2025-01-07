public class Square extends Rectangle {
    
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }
    
    public double getSideLength() {
        return super.getHeight();
    }
    
    @Override
    public String toString() {
        return "Square with side lengths " + getSideLength(); 
    }
    
}

