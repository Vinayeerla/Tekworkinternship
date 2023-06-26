/*create a class ArraySequence having  add() and sequence() to give data and arrange all –ve numbers in descending order, if any array element is 0 or +ve then generate a custom exception. Test your code for any 6 different scenarios. Use an array of objects for the test cases. */
import java.util.*;
class InvalidArrayException extends Exception{
    InvalidArrayException(String msg){
        super(msg);
    }
}
class ArraySequence{
    int array[];
    Scanner sc=new Scanner(System.in);
    void read(){
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
    }
    }
    void sequence(){
      for (int i = 0; i < array.length; i++)   
        {  
        for (int j = i + 1; j < array.length; j++)   
        {  
        int temp;  
        if (array[i] > array[j])   
        {  
        temp = array[i];  
        array[i] = array[j];  
        array[j] = temp;  
        }  
           }  
        }
        for(int h:array){
        try
            {
        if(h < 0){
          System.out.println(h);
        }
        else{
            throw new InvalidArrayException("+ve or zero");
        }
    }
    catch(InvalidArrayException e){
        System.out.println("Error : "+e.getMessage());
    }
        }
}
}
class ArraySequenceTest{
    public static void main(String args[]){
        ArraySequence a[]=new ArraySequence[4];
        for(int i=0;i<4;i++)
            {
                a[i]=new ArraySequence();
                a[i].read();
                a[i].sequence();
            }
    }
}
