import java.util.*;
class ProductOfDigits{
  public static void main(String []p){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    displaySumOfDigits(num);
  }
  static void main(string []p){
    int rem,product=1;
    while(num!=0){
      rem=num%10;
      product=product*rem;
      num=num/10;
    }
    System.out.println(product);
  }
}