public class Triangle {

	private int base;
	private int height;
	
	public Triangle(int tBase, int tHeight){
		base = tBase;
		height = tHeight;
	}
	
	/**
	* Returns value of base
	* @return int - Value of base
	*/
	public int getBase() {
		return base;
	}

	/**
	* Sets new value of base
	* @param int - new triangle base
	*/
	public void setBase(int tBase) {
		base = tBase;
	}

	/**
	* Returns value of height
	* @return int
	*/
	public int getHeight() {
		return height;
	}

	/**
	* Sets new value of height
	* @param int - new value of triangle height
	*/
	public void setHeight(int tHeight) {
		height = tHeight;
	}

    /**
     * Returns the String representation of a Triangle
     * @return String - value for Triangle
     */
    public String toString() {
		return "Triangle with an area of " + area();
	}
	
    /**
     * Returns the area of the triangle
     * @return double area of triangle
     */
	public double area() {
		return 0.5*base*height;
	}
}