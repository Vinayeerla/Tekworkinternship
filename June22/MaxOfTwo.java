//Write a java program to find maximum between two numbers.
import java.util.Scanner;

class maxtwo {
  public static void main(String[] args)
    {
      int a,b;
      Scanner obj=new Scanner(System.in);
      System.out.print("eneter any number:")
      a=obj.nextInt();
      System.out.print("eneter any number:")
      b=obj.nextInt();
      if (a>b)
      System.out.println("a is greater than b");
      else 
        System.out.println("b is greater than a");
    }
}