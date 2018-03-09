
public abstract class Shape 
{
	public Shape()
	{}
	public void drawShape()
	{
		 System.out.println("" +"Shape is drawn with RED");
	}
	public abstract double calcArea();
	public abstract double calcPerimeter();
}
