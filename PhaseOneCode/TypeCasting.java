
class TypeCasting
	{
	public static void main(String[] args)
	{
		char c1 = 'A';
		int i = c1; //widening 
		System.out.println("c1 = "+c1);
		System.out.println("i = " + i);
		int b=c1;
		System.out.println("Value of b: "+b);
		
		float c=c1;
		System.out.println("Value of c: "+c);
		
		long d=c1;
		System.out.println("Value of d: "+d);
		
		double e=c1;
		System.out.println("Value of e: "+e);

		int j = 77;
		char c2 = (char)j; // narrowing 
		System.out.println(" j = " + j); 
		System.out.println( " c2 = " + c2);
	}
}
