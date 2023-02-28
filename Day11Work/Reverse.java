//Write a java program to enter a number and print its reverse
import java.util.Scanner;
class Reverse
  {
    public static void main(String[] args){
      int rem,rev=0;
      Scanner obj=new Scanner(System.in);
      System.out.print("enter any number :");
      int num=obj.nextInt();
      while(num!=0){
        rem=num%10;
        rev=(rev*10)+rem;
        num=num/10;
      }
      System.out.println(rev);
    }
  }
    
