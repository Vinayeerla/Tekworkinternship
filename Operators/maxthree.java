//Write a java program to find maximum between three numbers.
import java.util.Scanner;
class maxthree
  {
    public static void main(String[] args)
    {
      int a,b,c;
    Scanner obj=new Scanner(System.in);
      System.out.print("enter any three numbers :");
      a=obj.nextInt();
      b=obj.nextInt();
      c=obj.nextInt();
      if((a>=b) && (a>=c))
        System.out.println("a is largest number");
      else if((b>=a) &&(b>=c))
        System.out.println("b is largest number");
      else
        System.out.println("c is largest number");
        
    }
  }