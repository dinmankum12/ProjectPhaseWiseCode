//mport java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) throws UserAgeExceededException {
		
		System.out.println("Enter user's name and age");
		
		Scanner scan = new Scanner(System.in);
		
		String userName = scan.nextLine();
		
		Integer userAge = scan.nextInt();
		
		try {
			validateUserAge(userName, userAge);
		} catch (UserAgeExceededException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	private static void validateUserAge(String userName, Integer userAge) throws UserAgeExceededException {
		if(userAge < 18) {
			throw new UserAgeExceededException("Sorry, you are too young to register yet!");
		}
		else {
			System.out.println("Welcome " + userName + ", You are now registered...");
		}
	}

}


class UserAgeExceededException extends Exception{
	public UserAgeExceededException(String message) {
		super(message);
	}
}