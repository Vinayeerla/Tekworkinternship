//Write a java program to check whether a number is negative, positive or zero.
import java.util.Scanner;
class Checknumber
  {
    public static void main(String[] args)
    {
      int a;
      Scanner obj=new Scanner(System.in);
      a=obj.nextInt();
      if(a>0)
        System.out.println("a is +ve number");
      else if(a<0)
        System.out.println("a is -ve number");
      else 
        System.out.println("a is equal to zero");
    }
    
  }