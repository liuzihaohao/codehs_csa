import java.util.ArrayList;

public class ShapesTester
{
    public static void main(String[] args)
    {
        Shape rectangle = new Rectangle(10, 20);
        
        Shape circle = new Circle(10);
        
        Shape ellipse = new Ellipse(5, 4);
        
        Shape square = new Square(6);
        
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        
        shapes.add(rectangle);
        shapes.add(circle);
        shapes.add(ellipse);
        shapes.add(square);
        
        for(int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i).getName());
        }
        
    }
}