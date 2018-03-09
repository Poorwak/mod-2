import com.cg.bat.Batch;
import com.cg.stu.Student;


public class TestStudentDemo 
{
	public static void main(String [] args)
	{
		Batch javaBatch=new Batch("JEE_Propel_001", "8.30 to 6.00", "Anjulata Tembhare");
		
		Batch vnvBatch=new Batch("VNV_PT_002", "9 to 6.00", "Shilpa Bhosale");
		
		Batch oraAppBatch=new Batch("oraApp_ABridge_003", "8.30 to 6.00", "Sachin Naradekar");
		
		Student student1=new Student(111,"Ronak",90,javaBatch);
		Student student2=new Student(222,"Vaibhav",56,javaBatch);
		Student student3=new Student(333,"Nilima",70,vnvBatch);
		Student student4=new Student(444,"Devangana",55,oraAppBatch);
		
		System.out.println(student1.dispStuInfo());
		System.out.println(student2.dispStuInfo());
		System.out.println(student3.dispStuInfo());
		System.out.println(student4.dispStuInfo());
	}
}
