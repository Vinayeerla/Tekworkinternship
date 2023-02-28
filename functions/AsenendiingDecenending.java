import java.util.*;
class AsceningDecening{
  public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    System.out.println("enter num of elements");
    int size=obj.nextInt();
    System.out.println("enter elements in an array");
    int array[]=new int[size];
    for(int i=0;i<size-1;i++)
      array[i]=obj.nextInt();
    displaysimples(array,size);
  }
  static void displaysimples(int array[],int size){
    Scanner obj=new Scanner(System.in);
    int temp=0;
    for(int i=0;i<size/2;i++){
      for(int j=i+1;j<size/2;j++){
      if(array[j]<array[i]){
        temp=array[j];
        array[j]=array[i];
        array[i]=temp;
      }
      }
      System.out.println(array[i]);
  }
    for(int i=size/2;i<size-1;i++){
      for(int j=i;j<size-1;j++){
      if(array[j]>array[i]){
        temp=array[j];
        array[j]=array[i];
        array[i]=temp;
  }
}
      System.out.println(array[i]);
    }
  }
}
  