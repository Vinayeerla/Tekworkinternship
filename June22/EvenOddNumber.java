//Write a java program to check whether a number is even or odd.
import java.util.Scanner;
class EvenOddNumber
  {
    public static void main(String[] args)
    {
      int num;
      Scanner obj=new Scanner(System.in);
      System.out.print("enter any nuber: ");
      num = obj.nextInt();
      if(num %2==0)
        System.out.println("given number "+num+"is evn");
      else
        System.out.println("given number "+num+"is odd");
      
    }
  }