import java.util.*;
class AdditionofTwoMatrix{
  public static void main(String[] args){
    
    Scanner obj=new Scanner(System.in);
  
    System.out.println("enter number of rows in matrix 1 ");
    int rows1=obj.nextInt();
    System.out.println("enter number of colunms in matrix 1 ");
    int colunms1=obj.nextInt();
   System.out.println("enter elements in matrix 1");
    int array1[][]=new int[rows1][colunms1];
    for(int i=0;i<=rows1;i++){
      for(int j=0;j<=colunms1;j++)
        array1[i][j]=obj.nextInt();
      
    System.out.println("enter number of rows in matrix 2 ");
    int rows2=obj.nextInt();
    System.out.println("enter number of colunms in matrix 2 ");
      int colunms2=obj.nextInt();
    System.out.println("enter elements in matrix 2");
    int array2[][]=new int[rows2][colunms2];
    
      for(int i=0;j<=rows1;i++){
      for(int i=0;j<=colunms1;j++)
        array2[k][l]=obj.nextInt();
      }
}
    displayAdditionofTwoMatrix(array1,rows1,colunms1,array2,rows2,colunms2);
  }
  static void displayAdditionofTwoMatrix(int array1[][],int rows1,int colunms,int array2[][],int rows2,int colunms2){
    
    int res[][]=new int[rows1][colunms1];
    if(rows1==rows2 && colunms1==colunms2){
      int j=0;
      for(int i=0;i<firstrows;i++){
              for( j=0;j<firstcolumns;j++)  
              ResultArray[i][j]=array1[i][j]+array2[i][j];
    }
        for(int i=0;i<firstrows;i++){
              for( j=0;j<firstcolumns;j++)  
                System.out.println(res[i][j]);
  }
    }
}
}

    