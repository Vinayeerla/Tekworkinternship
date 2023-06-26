import java.util.*;
class MainMethod{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    DataImp emobj=new DataImp();
    char ch;
    int choice;
    do{
    System.out.println("1.Add patient Details");
    System.out.println("2.view patient Details");
    System.out.println("3.search by id patient Details");
    System.out.println("4.search by name patient Details");
    System.out.println("5.search by age patient Details");
    System.out.println("6.search by city patient Details");
    System.out.println("7.recovery patient Details");
      System.out.println("enter u r choice");
      choice=sc.nextInt();
      switch(choice){
        case 1: emobj.addDetails();
          break;
        case 2: emobj.viewDetails();
          break;
        case 3: emobj.searchId();
          break;
        case 4: emobj.searchName();
          break;
        case 5: emobj.searchAge();
          break;
        case 6: emobj.searchCity();
          break;
        case 7: emobj.recovery();
          break;
        default :
          System.out.println("enter correct number");
          break;
      }
      System.out.println("do u want one more operation");
      ch=sc.next().charAt(0);
    }
      while(ch!='n');
  }
}