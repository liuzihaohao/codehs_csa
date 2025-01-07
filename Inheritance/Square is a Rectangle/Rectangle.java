public class Rectangle {
    
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getArea() {
        return width * height;
    }
    
    public String toString() {
        return "Rectangle with width: " + width 
                + " and height: " + height;
    }
}
