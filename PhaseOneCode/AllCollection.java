import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class AllCollection {
	public static void main(String[] args) {

				LinkedList<Integer> list = new LinkedList<>();
				HashSet<String> list3 = new HashSet<>();
				ArrayList<String> list2 = new ArrayList<>();
				
				list.add(4367);
				list.add(33);
				list.add(178);
				list.add(2728);
				System.out.println("LinkedList  : " + list);
				
				list3.add("Mayank");
				list3.add("Rajesh");
				list3.add("Mayank");//Not added to the set
				list3.add("Nikita");
				System.out.println("HashSet  : " + list3);
				
				list2.add("Waleed");
				list2.add("Harni");
				list2.add("UMME");
				list2.add("Harni");
				System.out.println("ArrayList  : " + list2);

				
	

	}
}
