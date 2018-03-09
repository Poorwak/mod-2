import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class TestStreamAPIDemo 
{

	public static void main(String[] args)  
	{
		List<String> cityList=Arrays.asList("Pune", "Mumbai", "Nagpur", "Gaziabad", "Mumbai", "Delhi","") ;
		
		cityList.stream().distinct().forEach(System.out::println);
		System.out.println("************************************");

		long cityCount=cityList.stream().distinct().count();
		System.out.println(" How many Cities? "+cityCount);
		System.out.println("************************************");
		
		cityList.stream().map(str->str.length()).forEach(System.out::println);
		System.out.println("************************************");
		long emptyStrCount = cityList.stream().filter((String str)->str.isEmpty()).count();
		System.out.println("Empty String: "+emptyStrCount);
	}

}
