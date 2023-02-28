//Write a java program to check whether a year is leap year or not
import java.util.Scanner;
class LeapYear
  {
  public static void main(String[] args)
    {
    Scanner obj = new Scanner(System.in);
      System.out.println("Enter year to check");
    int year=obj.nextInt();
    if (( (year%4==0) &&  (year%100!=0) )|| (year%400==0))
     System.out.println("leap year");
  else
      {    
        System.out.println("not a leap year");
    }
  
  }
}