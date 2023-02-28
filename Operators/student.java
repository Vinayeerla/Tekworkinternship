import java.util.Scanner;
 
class student
{
      public static void main(String args[])
      {
          String name;
          int roll, m1, m2, m3;
           
          Scanner SC=new Scanner(System.in);
           
          System.out.print("Enter Name: ");
          name=SC.nextLine();
          System.out.print("Enter Roll Number: ");
          roll=SC.nextInt();
          System.out.print("Enter marks in m1, m2 and m3: ");
          m1=SC.nextInt();
          m2=SC.nextInt();
          m3=SC.nextInt();

          int sum = m1+m2+m3;
          int avg=sum/3;
        
           
          
          System.out.println("avg of three subjects m1,m2 and m3: "+avg);
            
      }
          
}