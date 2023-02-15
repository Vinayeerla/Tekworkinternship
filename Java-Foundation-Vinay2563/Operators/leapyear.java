//Write a java program to check whether a year is leap year or not
import java.util.Scanner;
class leapyear
  {
    public staic void main(String[] args)
    {
      int num;
      Scanner obj=new Scanner(System.in);
      System.out.print("enter any number: ");
      num = obj.nexInt();
      if(num%400==0)
        System.out.println("Given number"+ num+"is leap year");
      else
        System.out.println("given number "+ num+"is not leap year");
    }
  }