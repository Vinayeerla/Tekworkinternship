//Write a java program to check whether a number is palindrome or not.
import java.util.Scanner;
class Palindrome
{
  public static void main(String[] args)
  {
    
    int r,sum=0;
    Scanner obj=new Scanner(System.in);
    System.out.print("enter any number :");
    int num=obj.nextInt();
    int temp=num;
    while(num!=0)
      {
        r=num%10;
        sum=(sum*10)+num;
        num=num/10;
      }
        if(temp==sum)
        {
          System.out.println("it is a palindrome number");
        }
        else
          System.out.println("it is not a palindrome number");
  
  }
}