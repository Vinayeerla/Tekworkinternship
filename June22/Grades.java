import java.util.Scanner;
class Grade
  {
    public static void main(String[] args)
    {
      int phy,che,math,bio,comp;
      Scanner s = new Scanner(System.in);
      System.out.print("enter marks in py :");
      phy=s.nextInt();
      System.out.print("enter marks in che :");
      che=s.nextInt();
      System.out.print("enter marks in math :");
      math=s.nextInt();
      System.out.print("enter marks in bio :");
      bio=s.nextInt();
      System.out.print("enter marks in comp :");
      comp=s.nextInt();
      float per=((float) (phy+che+math+bio+comp)/5);
      if(per>=90)
        System.out.println("Grade A");
      else if(per>=80 && per<90)
        System.out.println("Grade B");
      else if(per>=70 && per<80)
        System.out.println("Grade C");
      else if(per>=50 && per<70)
        System.out.println("Grade D");
      else
        System.out.println("Grade F");
    }
  }