import java.util.*;
class FactorialOfANumber{
  public static void main(String []p){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    displayFactorialOfANumber(num);
  }
  static void displayFactorialOfANumber(int num){
    int fact=1;
    for(int i=1; i<=num; i++){
      fact=fact*i;
    }
    System.out.println(fact);
  }
}