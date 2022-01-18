
public class InnerClass {


	public static void main(String[] args) {
		new Outer().met();
	}

}

class Outer {
	void met() {
		boolean flag = false;//Effectively final starting with Java 8
		class Inner {
			void in() {
				System.out.println("Inside Inner's in...");
				System.out.println("flag : " + flag);
			}
		}
		Inner ref = new Inner();
		ref.in();
	}
}