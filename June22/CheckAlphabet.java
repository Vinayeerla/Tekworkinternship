//Write a java program to check whether a character is alphabet or not.
import java.util.Scanner; 
class alpha
  {
    public static void main(String[] args)
    {
      char ch;
      Scanner obj=new Scanner(System.in);
      System.out.print("enter any character :");
      ch=obj.next().charAt(0);
      if(ch=='A' && ch=='Z')
        System.out.println("given character"+ch+"is a alphabet");
      else
        System.out.println("given character"+ch+"is not an alphabet")
    }
  }