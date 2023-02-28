// storing and reading data from an array dynamically
import java.util.*;
class DynamicallyArray{
  public static void main(String[] args){
  Scanner obj=new Scanner(System.in);   
  System.out.println("enter number of elemnets in an array : ");
    int size;
    size=obj.nextInt(); //size holding array size
    int amount[]=new int[size]; //allocating memory for array
    System.out.println("enter array elements : ");
    for(int i=o;i<=size-1;i++)   //for travelling over indexes
      amount[i]=obj.nextInt(); //for reading array elements from i/p keyword
  // how to give data dunamically
    displayArryElements(amount,size);
  }
  public static void displayArryaElements(int a[],int s)
  {
    for(int h : a)
      System.out.println(h); // element of array
      System.out.println(a[s]); // printting array elements
  }
  }
  
}