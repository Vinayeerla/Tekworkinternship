import java.util.*;
class ArrayPerson
  {
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      System.out.println("enter number of elemnets in an array : ");
      int size=obj.nextInt();
      int personage[]=new int[size];
      System.out.println("enter array elements : ");
      for(int i=0;i<=size-1;i++)
        personage[i]=obj.nextInt();
      displayArray(personage,size);
      
    }
    public static void displayArray(int ps[] ,int s)
    {
      for(int h:ps)
          System.out.println(h);
    }
  }