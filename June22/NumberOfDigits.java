import java.util.*;
class NumberOfDigits{
  public static void main(String []o){
    Scanner sc=new Scanner(System.in);
    Syste.out.println("enter any number");
    int num=sc.nextInt();
    int count=0;
    while(num!=0){
      num=num/10;
      count=count+1;
    }
    System.out.println(count);
  }
}