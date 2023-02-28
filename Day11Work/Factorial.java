//Write a java program to calculate factorial of a number
import java.util.Scanner;
class Factorial
  {
    public static void main(String[] args){
      int fac=1;
      Scanner obj=new Scanner(System.in);
      System.out.print("enter any num : ");
      int num=obj.nextInt();
      for(int i=1;i<=num;i++){
        fac=fac*i;
      }
      System.out.println("factorial " + fac );
    }
  }