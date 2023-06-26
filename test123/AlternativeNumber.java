import java.util.*;
class AlternativeNumber{
  public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    Sytem.out.println("enter numbers of elements in an array ");
    int size=obj.nextInt();
    Sytem.out.println("enter prime elements in an array ");
    int prime_num[]=new int[size];
    for(int i=0;i<size-1;i++){
      prime_num[i]=obj.nextInt();
    }
    displayAlternativeNumber(prime_num,size);
  }
  static void displayAlternativeNumber(int pm[],int s){
    Scanner obj=new Scanner(System.in);
    int array[]=new int[s];
    for(int i=0;i<s;i=i+2){
      int temp=0;
      for(int j=1;j<s;j++){
        if(array[i]%j==0){
          temp=temp+1;
        }
      }
    }
    for(int i=0;i<s;i=i+2){
      
    }
  }
}