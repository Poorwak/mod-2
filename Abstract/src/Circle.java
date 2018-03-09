
public class Circle extends Shape
{
	private int radius;
	public Circle(){}
	public Circle (int radius)
	{
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public double calcArea() 
	{
		
		return (Math.PI*radius*radius);
	}
	@Override
	public double calcPerimeter() 
	{
		
		return (2*Math.PI*radius);
	}
	
}
