import java.util.*;
class SumOfDigits{
  public static void main(String []p){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    displaySumOfDigits(num);
  }
  static void main(string []p){
    int rem,sum=0;
    while(num!=0){
      rem=num%10;
      sum=sum+rem;
      num=num/10;
    }
    System.out.println(sum);
  }
}