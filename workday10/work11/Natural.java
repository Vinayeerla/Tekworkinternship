/*Write a java program to print all natural numbers from 1 to n. - using while loop*/
import java.util.*;
class Natural
  {
    public static void main(String[] args)
    {
      int i;
      Scanner obj=new Scanner(System.in);
      System.out.print("enter the values of n: ");
      int n=obj.nextInt();
      while(i<=n)
        {
          System.out.println(i);
          i=i+1;
        }
    }
  }