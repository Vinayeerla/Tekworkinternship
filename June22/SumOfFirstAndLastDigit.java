import java.util.*;
class SumOfFirstAndLastDigit{
  public static void main(String []p){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    int firstdigit=0;
    int lastdigit=0;
    int sum=0;
    lastdigit=num%10;
    while(num!=0){
      firstdigit=num%10;
      num=num/10;
    }
    sum=firstdigit+lastdigit;
    System.out.println(sum);
  }
}