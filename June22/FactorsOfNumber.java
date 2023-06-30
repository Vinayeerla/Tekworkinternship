import java.util.*;
class FactorsOfNumber{
  public static void main(String []p){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    displayFactorsOfNumber(num);
  }
  static void displayFactorsOfNumber(int num){
    for(int i=0; i<num; i++){
      if(num%i==0)
        System.out.println(i);
    }
  }
}