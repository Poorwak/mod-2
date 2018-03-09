
public class TestDrawingApp 
{

	public static void main(String[] args) 
	{
		Shape shape1=new Circle(5);
		Shape shape2=new Circle(2);
		Shape shape3=new Sphere(5);
		
		System.out.println("Area of circle: "+shape1.calcArea());
		System.out.println("Parameter of circle: "+shape1.calcPerimeter());
		
		System.out.println("Area of circle: "+shape2.calcArea());
		System.out.println("Parameter of circle: "+shape2.calcPerimeter());
		
		System.out.println("Volume: "+shape3.calcArea());
		System.out.println("Surface Area: "+shape3.calcPerimeter());
	}

}
