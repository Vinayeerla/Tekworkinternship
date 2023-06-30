import java.util.*;
class InvalidLoginException extends Exception{
  public InvalidLoginException(String str){
    super(str);
  }
}
public class Login {
     String user_name = "vinay";
     String password = "vinay@123";
  public void login(String username, String password1) throws InvalidLoginException {
        if (!username.equals(user_name) || !password1.equals(password)) {
            throw new InvalidLoginException("Incorrect username or password.");
        }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Login l=new Login();
      System.out.println("Enter username: ");
      String username = sc.nextLine();
      System.out.println("Enter password: ");
      String password1 = sc.nextLine();
      try {
        l.login(username, password1);
        System.out.println("Login successful!");
      } catch (InvalidLoginException e) {
        System.out.println("Login failed: " + e.getMessage());
      }
    }
}
