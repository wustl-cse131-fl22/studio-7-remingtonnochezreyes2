package studio7;

public class Rectangle {

	
	private double length; 
	private double width; 
	

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double area ()
	{
		return (this.length*this.width);  
	}
	
	public double perimeter ()
	{
		return (this.length*2) + (this.width*2); 
	}
	
	public boolean isSmaller (Rectangle r)
	{
		if (this.area()<r.area())
		{
			return true; 
		}
		else 
		{
			return false; 
		}
	}
	
	public boolean isSquare ()
	{
		if (this.length == this.width)
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
	
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(5.0, 4.0);
		Rectangle r2 = new Rectangle(3.0,3.0);
		
		System.out.println(r1.isSmaller(r2));
		System.out.println(r2.isSquare());
		System.out.println(r1.area());
		
		
		
	}
}
