public class ShapeTester {

	public static void main(String[] args) {
		
	
		Triangle tri1 = new Triangle(3,5);
		System.out.println(tri1);
		
		Triangle tri2 = new Triangle(4,10);
		System.out.println("Base: " + tri2.getBase());
		tri1.setBase(5);
		System.out.println("Base: " + tri2.getBase());
		System.out.println("Area: " + tri2.area());
		
	}

}