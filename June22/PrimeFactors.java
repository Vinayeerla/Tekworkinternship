import java.util.*;
class PrimeFactors{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    displayPrimeFactors(num);
  }
  static void displayPrimeFactors(int num){
    for(int i=2; i<num; i++){
      if(num%i==0){
        int count=0;
        for(int j=2; j<=i; j++){
          if(j%i==0){
            count++;
          }
        }
        if(count>0)
          System.out.println(i);
      }
    }
    /*for(int i=2; i<=num; i++){
      while(num%i==0){
        System.out.println(i);
        num/=i;
      }
    }*/
  }
}