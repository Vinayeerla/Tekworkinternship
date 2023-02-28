//Write a java program to find sum of first and last digit of a number
import java.util.Scanner;
class SumofFirstLast
  {
    public static void main(String[] args)
    {
      Scanner obj=new Scanner(System.in);
      System.out.print("enter any number :");
      int num=obj.nextInt();
      SumofFirstLast.All(num);
    }
    public static void All(int num)
    {
       int Last_Digit=num%10;
       while(num>=10) {
            num /= 10;
        }
       int First_Digit=num;
   
      int sum=Last_Digit + First_Digit;
      System.out.println("Sum Of First and Last Digit is :"+sum);

         }
  }
  