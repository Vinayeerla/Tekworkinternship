//Write a java program to find first and last digit of a number
import java.util.Scanner;
class FirstLast
  {
    public static void main(String[] args)
    {
      Scanner obj=new Scanner(System.in);
      System.out.print("enter any number :");
      int num=obj.nextInt();
      FirstLast.first(num);
      FirstLast.last(num);
    }
    public static void last(int num)
    {
      int last=num%10;
      System.out.println("last digit of a number is " + last);
    }
    public static void first(int num)
    {
      while(num>=10)
      {  
        num=num/10;
      }
      System.out.println("first digit of a number is " + num);
      
         }
    }
  