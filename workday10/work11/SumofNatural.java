//write a java program to find sum of all natural numbers between 1 to 
import java.util.*;
class SumofNatural
  {
    public static void main(String[] args)
    {
      int num=100,i=0,sum=0;
      Scanner obj=new Scanner(System.in);
      System.out.println("enter the vales of n: ");
      while(i<=num)
        {
          sum=sum+i;
          System.out.println("Sum of al, natural numberds between 1 to n is  " + sum);
        }
    }
  }

          