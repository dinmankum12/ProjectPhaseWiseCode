
public class AllString {

	public static void main(String[] args) {
		
		String myStr = "Mukiln";
		
		System.out.println(myStr);//Mukiln
		
		myStr = "Anand";
		
		
		String anotherStr = "Anand";
		
		System.out.println(anotherStr);//Anand
		
		
		anotherStr = anotherStr.toUpperCase();
		
		System.out.println(anotherStr);//ANAND
		
		anotherStr = anotherStr.toLowerCase();
		
		System.out.println(anotherStr);//anand
		
		anotherStr = anotherStr.concat(" pootluru");
		
		System.out.println(anotherStr);
		
		anotherStr += " J";
		
		System.out.println(anotherStr);
		
		System.out.println(anotherStr.substring(4));
		
		System.out.println(anotherStr.substring(4, 9));
		
		
		
		String []values = anotherStr.split(" ");
		
		System.out.println("Splitted strings are :");
		
		for(String value : values) {
			System.out.println(value);
		}
		
		System.out.println(anotherStr.charAt(6));
	
		
		
	}

}
