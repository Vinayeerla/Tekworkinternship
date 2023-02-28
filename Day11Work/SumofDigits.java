//Write a java program to calculate sum of digits of a number
import java.util.Scanner;
class SumofDigits
  {
    public static void main(String[] args){
      int rem,sum=0;
      Scanner obj=new Scanner(System.in);
      System.out.print("enter any number ");
      int num=obj.nextInt();
      while(num!=0){
        rem=num%10;
        sum=sum+rem;
        num=num/10;
      }
      System.out.println(sum);
    }
  }