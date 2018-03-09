
public class TestInterfaceDemo {

	public static void main(String[] args) 
	{
		Printable pp= new Box(8,9,2);
		System.out.print("Box Info :");
		pp.print();
		System.out.println("Box Volume :"+((Box)pp).calcVol());
	}

}
