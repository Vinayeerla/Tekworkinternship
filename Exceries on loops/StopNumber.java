/*Write a program that prints on the console all numbers from N to M that are divisible by 2 and 3 without remainder, in reversed order. We will read from the console one additional "stop" number S. If any of the numbers divisible by 2 and 3 is equal to the stop number, it should not be printed and the program should end. Otherwise, print all numbers up*/
import java.util.*;
class StopNumber
  {
    public static void main(String[] args)
    {
      Scanner obj=new Scanner(System.in);
      System.out.print("enter the value of n:");
      int n=obj.nextInt();
      System.out.print("enter the value of m:");
      int m=obj.nextInt();
      System.out.print("enter the value of s:");
      int s=obj.nextInt();
      StopNumber.All(n,m,s);
    }
      public static void All(int n,int m,int s)
        {
      for(int i=n;i>=m;i--)
        {
          if(i%2==0 && i%3==0)
          {
           if(i==s)
             break;
            System.out.println(i);
          }
        }
}
  }