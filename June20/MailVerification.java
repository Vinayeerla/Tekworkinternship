import java.util.*;
class MailVerification{
  static void displayMailVerification(String mail){
    if(mail.contains("@")){
      String arr[]=mail.split("@");
      if(arr.length==2 && arr[1].contains(".com")){
        System.out.println(mail + " is a valid e-mail");
      }
      else {
        System.out.println(mail + " is a Invalid e-mail");
      }
    }
    else {
      System.out.println("please enter a valid e-mail id");
    }
  }
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your E-Mail id");
    String mail=sc.nextLine();
    displayMailVerification(mail);
  }
}