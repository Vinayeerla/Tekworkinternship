import java.util.*;
class FibonacciSeries{
  public static void main(String []p){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    displayFibonacciSeries(num);
  }
  static void displayFibonacciSeries(int num){
    int a=0,b=1;
    int c;
    System.out.println(a);
    System.out.println(b);
    for(int i=2; i<num; i++){
      c=a+b;
      System.out.println(c);
      a=b;
      b=c;
    }
  }
}