import java.util.*;
class SetOfPrimeNumber{
  public static void main(String []p){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    displayPrimeNumber(num);
  }
  static void displayPrimeNumber(int num){
    for(int j=2; j<=num; j++){
    int count=0;
    for(int i=1; i<=j; i++){
      if(j%i==0)
        count++;
    }
    if(count==2)
      System.out.print(j + " ");
  }
  }
}