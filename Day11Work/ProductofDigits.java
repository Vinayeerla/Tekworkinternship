//Write a java program to calculate product of digits of a number
import java.util.Scanner;
class ProductofDigits
  {
    public static void main(String[] args){
      int rem,product=1;
      Scanner obj=new Scanner(System.in);
      System.out.print("enter any number ");
      int num=obj.nextInt();
      while(num!=0){
        rem=num%10;
        product=(product*rem);
        num=num/10;
      }
      System.out.println(product);
    }
  }