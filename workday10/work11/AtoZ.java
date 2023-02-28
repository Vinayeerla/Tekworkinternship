//Write a java program to print all alphabets from a to z. - using while loop
import java.util.*;
class AtoZ
  {
    public static void main(String[] args)
    {
      char ch='A';
      Scanner obj=new Scanner(System.in);
      char ch1=obj.next().charAt(0);
      while(ch<='Z')
        {
          System.out.println(ch)
            ch++;
        }
    }
  }