import java.util.*;
class ArrayOperations
  {
    public static void main(String[] args){
      Scanner obj=new Scanner(System.in);
      System.out.println("enter no of elements in an array : ");
    
    int size=obj.nextInt();
    int array[]=new int[size];
      System.out.println("which of the following operation you want to perform ");
      System.out.println(" 1.Insert an element in first index ");
      System.out.println(" 2.Insert an element in last index ");
      System.out.println(" 3.Insert an element in specified index ");
      System.out.println(" 4.Remove element from first index ");
      System.out.println(" 5.Remove element from last index ");
      System.out.println(" 6.Remove element from specified index ");
      System.out.println(" 7.Remove user eneted element ");
      System.out.println(" 8.Display all in ASC/DESC order. ");
      System.out.println(" Display array elements ");
      int operation=obj.nextInt();
      switch(operation){
        case 1: insertAtFirstIndex(array,size);
          break;
        case 2: insertAtLastIndex(array,size);
          break;
        case 3: insertAtSpecifiedIndex(array,size);
          break;
        case 4: removeFromFirstIndex(array,size);
          break;
        case 5: removeFromLastIndex(array,size);
          break;
        case 6: removeFromSpecifiedIndex(array,size);
          break;
        case 7: removeUserEnter(array,size);
          break;
        case 8: DisplayArrayElementsAsening(array,size);
          break;
        case 9: DisplayArrayElementsdescening(array,size);
          break;
      }
      static void insertAtFirstIndex(int array[],int size)
        {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter element to insert at first : ");
        array[0]=obj.nextInt();
        }
      static void insertAtLastIndex(int array[],int size)
        {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter element to insert at last : ");
        array[size-1]=obj.nextInt();
        }
      static void insertAtSpecifiedIndex(int array[],int size)
        {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter position no to insert data : ");
        int position=obj.nextInt();
        System.out.println("enter element to insert at " + position + "index");
        array[position]=obj.nextInt();
        }
      static void removeFromFirstIndex(int array[],int size)
        {
        
        array[0]=0;
      }
      static void removeFromLastIndex(int array[],int size)
        {
        array[size-1]=0;
        }
      static void removeFromSpecifiedIndex(int array[],int size)
        {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter position no to remove data : ");
        int position=obj.nextInt();
        System.out.println("enter element to insert at " + position + "index");
        array[position]=0;
        }
      static void removeUserEnter(int array[],int size)
        {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter element to remove from array : ");
        int remove=obj.nextInt();
        System.out.println("enter element")
        int i;
        for(i=0;i<size;i++){
          if(array[i]==remove)
            array[i]=0;
        }
        if(i==size)
          System.out.println(remove + " not available in the array");
        }
      static void  DisplayArrayElementsAsening(int array[],int size)
        {
        for (int i = 0; i < array.length; i++)   
        {  
        for (int j = i + 1; j < array.length; j++)   
        {  
        int temp = 0;  
        if (array[i] > array[j])   
        {  
        temp = array[i];  
        array[i] = array[j];  
        array[j] = temp;  
        }  
        }
        } 
        }
      static void DisplayArrayElementsdescening(int array[],int size)
        {
        for(int h : array)
          System.out.println(h);
        }
    }
  