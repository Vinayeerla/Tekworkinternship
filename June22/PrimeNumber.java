import java.util.*;
/*class PrimeNumber{
  public static void main(String []p){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    displayPrimeNumber(num);
  }
  static void displayPrimeNumber(int num){
    int count=0;
    for(int i=2; i<num; i++){
      if(num%i==0)
        count++;
    }
    if(count>0)
      System.out.println(num + " is not a prime number");
    else 
      System.out.println(num + " is a prime number");
  }
}*/
class PrimeNumber{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number for prime number upto n");
    int n=sc.nextInt();
    System.out.println("prime numbers are: ");
    for(int i=2; i<=n; i++){
      int count=0;
      for(int j=1; j<=i; j++){
        if(i%j==0){
          count++;
        }
      }
      if(count==2){
        System.out.println(i);
      }
    }
  }
}