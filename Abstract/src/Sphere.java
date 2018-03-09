
public class Sphere extends Circle
{
	public Sphere()
	{
		
	}
	public Sphere(int radius)
	{
		super(radius);
	}
	@Override
	public double calcArea() 
	{
		
		return ((4/3)*Math.PI*(Math.pow(getRadius(),3)));
	}
	@Override
	public double calcPerimeter() 
	{
		
		return (4*Math.PI*getRadius()*getRadius());
	}
}
