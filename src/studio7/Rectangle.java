package studio7;

public class Rectangle {
	private double length;
	private double width;
	private double area;

	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
		
	}

	public double Area() {
		return this.length*this.width;
	}
	

	public double Perimeter() {
		double perimeter = 2 * this.length + 2 * this.width;
		return perimeter;
	}

	public String compare(Rectangle other) {
		if (this.Area() > other.Area()) {
			return "Rectangle with dimensions " + this.length + "x" + this.width + 
					" is bigger than rectangle with dimensions" + other.length + "x" + other.width;
		} else if(this.Area() < other.Area()){
			return "Rectangle with dimensions " + other.length + "x" + other.width + 
					" is bigger than rectangle with dimensions" + this.length + "x" + this.width;
		}else {
			return "The rectangles have the same size";
		}

	}
	public boolean isSquare() {
		if(this.length==this.width) {
			return true;
		}else {
			return false;
		}
	}


	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(2, 2);
		Rectangle rectangle2 = new Rectangle(4,3);
		System.out.println(rectangle1.Area());
		System.out.println(rectangle2.Area());
		System.out.println(rectangle1.compare(rectangle2));
		System.out.println(rectangle1.isSquare());
		
	}
}
