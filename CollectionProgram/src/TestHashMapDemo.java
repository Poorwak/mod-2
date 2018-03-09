import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class TestHashMapDemo 
{

	public static void main(String[] args) 
	{
		HashMap<Long,String> mobileDirectory= new HashMap<Long,String>();
		
		mobileDirectory.put(9999999999L , "Poorwa");
		mobileDirectory.put(8888888888L , "Namrata");
		mobileDirectory.put(7777777777L , "Shweta");
		mobileDirectory.put(6666666666L , "Rishita");
		mobileDirectory.put(9999999999L , "Ayushi");
		
		/*Set<Entry<Long,String>> setIt=mobileDirectory.entrySet();
		Iterator<Entry<Long,String>> mobIt=setIt.iterator();
		while(mobIt.hasNext())
		{
			Entry<Long,String> dirEntry=mobIt.next();
			System.out.println("Mobile: "+dirEntry.getKey() + "\n" + "Name: "+dirEntry.getValue() + "\n");
		}*/
		
		System.out.println(mobileDirectory.keySet());     //To Print only key
		System.out.println(mobileDirectory.values());	  //To Print only values
	}

}
