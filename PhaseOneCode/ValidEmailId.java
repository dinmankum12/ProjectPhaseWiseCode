package Rest5Code;

//import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
  
public class ValidEmailId
{
    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
  
    public static void main(String[] args)
    {
        ArrayList<String> address = new ArrayList<>();
            
        System.out.println("Enter your email id :");
        Scanner sc = new Scanner(System.in);
        String emailId=sc.nextLine();
        address.add(emailId);
            
        for(String i : address){
            if (isValid(i))
                System.out.println(i + " - Yes");
            else
                System.out.println(i + " - No");
        }
    }
}