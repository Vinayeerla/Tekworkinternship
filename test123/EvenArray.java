/*create a class EvenArray having  add() and testEven() methods to take input and verify whether each array element is even or not, if the element is not an even number generate a custom exception, Test your code for any 4 different cases. Use an array of objects for the test cases. */
import java.util.*;
class InvalidArrayException extends Exception{
    InvalidArrayException(String msg){
        super(msg);
    }
}
class EvenArray{
    char array[];
    Scanner sc=new Scanner(System.in);
    void read(){
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        array=new char[n];
        for(int i=0;i<n;i++){
            array[i]=sc.next().charAt(0);
        }
    }
    void testEven(){
      for(int i=0;i<array.length;i++){
        try
            {
        if(array[i] % 2 == 0)
            System.out.println("set of elements is greater than 2");
        else
            throw new InvalidArrayException("set of elements is less than 2");
    }
    catch(InvalidArrayException e){
        System.out.println("Error : "+e.getMessage());
    }
}
}
}
class SortingLength{
    public static void main(String args[]){
        EvenArray a[]=new EvenArray[4];
        for(int i=0;i<4;i++)
            {
                a[i]=new EvenArray();
                a[i].read();
                a[i].testEven();
            }
    }
}
