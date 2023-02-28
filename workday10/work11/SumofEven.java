//Write a java program to find sum of all even numbers between 1 to n
import java.util.Scanner;
class SumofEven
  {
    public static void main(String[] args)
    {
      int n,i=1,sum=0;
      Scanner obj=new Scanner(System.in);
      System.out.print("enter the values of n :");
      int n=obj.nextInt();
      while(i<=n)
        {
          if(i%2==0)
          {
            sum=+i;
            System.out.println(sum);
          }
        }
    }
  }