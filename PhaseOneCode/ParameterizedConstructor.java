
class Details
	{
		String name; int id; double sal;

		public Details(String a, int b, double c)
		{

			id=b; sal=c; return;
		}
			public void display()
			{
				System.out.println(" name is = " + name);; System.out.println(" id is = " + id);; System.out.println(" salary is = " + sal);;
			}
	}
 
class ParameterizedConstructor
	{
	public static void main(String[] args)
	{
	Details s = new Details("Ajay", 101, 2000); s.display();
	Details s2 = new Details("Rohit", 102, 2500); s2.display();

	}
}
