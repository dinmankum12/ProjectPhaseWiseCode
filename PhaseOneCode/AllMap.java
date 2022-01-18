
import java.util.HashMap; 
import java.util.Set;
import java.util.function.BiConsumer;

public class AllMap {

	public static void main(String[] args)
		{
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>(); 
		hm1.put("aa", 1234); // use of put method
		hm1.put("bb", 1425);
		hm1.put("cc", 4528);
		hm1.put("dd", 4568);
 
		System.out.println("	");
		Set <String> keys=hm1.keySet(); // to store all keys inside a set

		for(String str : keys) //using of advance for loop
			{
			System.out.println("key ="+ str+" "+"value = "+hm1.get(str));
			}
		}
}
