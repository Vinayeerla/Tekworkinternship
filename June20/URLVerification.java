import java.util.*;
class URLVerification{
  static void displayURLVerification(String url){
    if(url.startsWith("http://") || url.startsWith("httsp://")){
      String arr[]=url.split("/");
      if(arr.length>=2 && arr[2].contains(".")){
        System.out.println(url + " is a valid url");
      }
      else {
        System.out.println(url + " is a invalid url");
      }
    }
    else {
      System.out.println("please enter a valid url");
    }
  }
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any URL ");
    String url=sc.nextLine();
    //http://www.company.com/showOrder.php?order=4621047
    //http://host.company.com/showCompanyInfo?name=C%26H%20Sugar
    displayURLVerification(url);
  }
}