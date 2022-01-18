
class Sample
	{
		String name; int id; double sal;
		public Sample()
		{

		}
			public void display()
			{
					System.out.println(" name is = " + name);; System.out.println(" id is = " + id);; System.out.println(" salary is = " + sal);;
			}
		}
public class DefaultConstructor {

	public static void main(String[] args)
		{
		Sample s = new Sample(); 
		s.display();
		}
}
