// Write a java program to find sum of all odd numbers between 1 to n
import java.util.Scanner;
class SumofOdd
  {
    public static void main(String[] args)
    {
      int n,i=1,sum=0;
      Scanner obj=new Scanner(System.in);
      System.out.print("enter the values of n :");
      int n=obj.nextInt();
      while(i<=n)
        {
          if(i%2==1)
          {
            sum=+i;
            System.out.println(sum);
          }
        }
    }
  }