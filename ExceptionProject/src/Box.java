
public class Box implements Printable
{
	private int height;
	private int width;
	private int length;
	
	
	public Box(int height, int width, int length) 
	{
		super();
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void print() 
	{
		System.out.println(" Height :"+height);
		System.out.println(" Width :"+width);
		System.out.println(" Length :"+length);
	}
	
	public int calcVol()
	{
		return height*width*length;
	}
	
	
	
}
