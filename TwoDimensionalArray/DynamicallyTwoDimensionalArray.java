import java.util.*;
class DynamicallyTwoDimensionalArray{
  public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    System.out.println("enter number of rows in an array ");
    int rows=obj.nextInt();
    System.out.println("enter number of colunms in an array ");
    int colunms=obj.nextInt();
    int array[][]=new int[rows][colunms];
    for(int i=0;i<=rows;i++){
      for(int j=0;j<=colunms;j++){
        array[i][j]=obj.nextInt();
      }
    }
  }
}