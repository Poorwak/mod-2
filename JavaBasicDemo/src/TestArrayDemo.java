
public class TestArrayDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int marks[]=new int[5];
		
		marks[0]=90;
		marks[1]=34;
		marks[2]=78;
		marks[3]=67;
		marks[4]=55;
		
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("marks["+i+"] : "+marks[i]);
		}
		System.out.println("****************************");
		
		String cars[]={"Manali", "Honda", "BMW"};
		for(int i=0; i<cars.length; i++)
		{
			System.out.println("cars["+i+"] : "+cars[i]);
		}
		System.out.println("****************************");
		
		int A[]=null;
		A = new int[3];
		A[0]= 9;
		A[1]= 3;
		A[2]= 4;
		
		for(int i=0; i<A.length; i++)
		{
			System.out.println("A["+i+"] : "+A[i]);
		}
		
		
		System.out.println("**************2D**************");
		int B[][]=new int[3][2];
		
		B[0][0]=9;
		B[0][1]=8;
		B[1][0]=7;
		B[1][1]=6;
		B[2][0]=5;
		B[2][1]=4;
		
		for(int i=0; i<B.length; i++)
		{
			for(int j=0; j<B[i].length; j++)
			{
				System.out.print("  "+B[i][j]);
			}
			System.out.println("   ");
		}
	}

}
