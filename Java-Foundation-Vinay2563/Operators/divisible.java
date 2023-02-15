//Write a java program to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;
class divisible
  {
    public static void main(String[] args)
    {
      int num;
      Scanner obj=new Scanner(System.in);
      num=obj.nextInt();
      if((num%5==0) && (num%11==0))
        System.out.println("a is divisible by 5 and 11");
      else 
        System.out.println("a is not divisble by 5 and 11");
    }
  }