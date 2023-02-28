//Write a java program to print multiplication table of any number
import java.util.Scanner;
class Multiplication
  {
    public static void main(String[] args)
    {
      Scanner obj=new Scanner(System.in);
      System.out.print("enter any number :");
      int num=obj.nextInt();
      Multiplication.All(num);
    }
    public static void All(int num)
    {
       int i=1;
      while(i<=10)
        {
          System.out.println(num*i);
          i=i+1;
        }
    }
  }