//Write a Program to print Prime factors in java.
import java.util.Scanner;
class PrimeFactors
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter The number :");
      int num = sc.nextInt();     
      for(int i = 2; i< num; i++) {
         while(num%i == 0) {
            System.out.println(i+" ");
            num = num/i;
         }
      }
      if(num >2) {
         System.out.println(num);
      }
   }
}