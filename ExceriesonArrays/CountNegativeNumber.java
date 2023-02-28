//Write a java program to count the total number of negative elements in an array.
import java.util.*;
class CountNegativeNumber{
  public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    System.out.println("enter number of elemnets in an array : ");
    int size;
    size=obj.nextInt();
    int array[]=new int[size];
    System.out.println("enter array elements : ");
    for(int i=0;i<=size-1;i++)
      array[i]=obj.nextInt();
      displayArrayElements(array,size);
  
}
  public static void displayArrayElements(int array[],int size){
    int count=0;
    for(int j : array){
      if(j<0)
        count=count+1;
    }
        System.out.println(count);
    
  }
}