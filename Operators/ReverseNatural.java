//Write a java program to print all natural numbers in reverse (from n to 1
import java.util.*;
class ReverseNatural
  {
    public static void main(String[] args)
    {
      int i=1;
      Scanner obj=new Scanner(System.in);
      System.out.print("enter the values of n: ");
      int n=obj.nextInt();
      while(i>=n)
        {
          System.out.println(n);
          i=i-1;
        }
    }
  }