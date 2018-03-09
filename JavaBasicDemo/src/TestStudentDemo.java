
public class TestStudentDemo 
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.setRollNo(111);
		s1.setStuName("Pravin");
		s1.setMark(45);
		
		System.out.println(" Roll No: "+s1.getRollNo());
		System.out.println(" Student Name: "+s1.getStuName());
		System.out.println(" Student Marks: "+s1.getMark());
		System.out.println("***************************");
		
		Student s2=new Student();
		s2.setRollNo(222);
		s2.setStuName("Poorwa");
		s2.setMark(80);
		
		System.out.println(" Roll No: "+s2.getRollNo());
		System.out.println(" Student Name: "+s2.getStuName());
		System.out.println(" Student Marks: "+s2.getMark());
	}
}
