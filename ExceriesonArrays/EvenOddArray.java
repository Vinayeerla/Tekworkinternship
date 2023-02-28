//Write a java program to count the total number of even and odd elements in an array
import java.util.*;
class EvenOddArray{
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
  public static void displayArrayElements(int aray[],int s){
    for(int i=0;i<array.length;i++){
      if(array[i]%2==0)
        System.out.println("even number " + array[i]);
      else
        System.out.println("odd number " + array[i]);
    }
    }
}