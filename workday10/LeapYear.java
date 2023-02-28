/* Leap Year Checker: Create an application that takes a year as input and checks if it's a leap year. Use conditional statements to determine if the year is a leap year based on the rules for determining leap years.*/

import java.util.Scanner;
class LeapYear
  {
  public static void main(String[] args)
    {
    Scanner obj = new Scanner(System.in);
    char ch;
    do{
      System.out.println("Enter year to check");
    int year=obj.nextInt();
    if (( (year%4==0) &&  (year%100!=0) )|| (year%400==0))
     System.out.println("leap year");
  else
      {    
        System.out.println("not a leap year");
    }System.out.println("Do you want to chech another year");
      ch = obj.next().charAt(0);
    } while (ch != 'n');
  }
}