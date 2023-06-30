import java.util.*;
class ReverseNumber{
  public static void main(String []p){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    displaySumOfDigits(num);
  }
  static void displaySumOfDigits(int num){
    int rem,rev=0;
    while(num!=0){
      rem=num%10;
      rev=(rev*10)+rem;
      num=num/10;
    }
    System.out.println(rev);
  }
}