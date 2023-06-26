import java.util.*;
class ElementPosition{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size");
    int size=sc.nextInt();
    System.out.println("Enter array elemnts ");
    int array[]=new int[size];
    for(int i=0; i<size; i++){
      array[i]=sc.nextInt();
    }
    displayElementPosition(array,size);
  }
  static void displayElementPosition(int array[], int size)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter target element");
    int target_element=sc.nextInt();
    for(int i=0; i<size; i++){
      if(array[i]==target_element)
      {
        System.out.println(i);
      }
      else {
        System.out.println("-1");
        break;
      }
    }
  }
}