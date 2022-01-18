
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RugularExpression {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String userName = scan.nextLine();
		
		validateUserName(userName);
		

	}
	
	static void validateUserName(String userName) {
		String namePattern = "[a-z]{6}";
		
		if(userName.matches(namePattern)) {
			System.out.println("Welcome " + userName);
		}
		else {
			System.out.println("Sorry, not the correct name...");
		}
	}

}
