import java.util.*;
class DiagonalElement{
  public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
      int rows,columns,i,j;
      System.out.println("enter dimensions of Matrix");
      rows=s.nextInt();
      columns=s.nextInt();
      int matric[][]=new int[rows][columns];
      for(i=0;i<rows;i++)
        {
          for( j=0;j<columns;j++)
            matric[i][j]=s.nextInt();
        }
      displayDiagonalElement(matric,rows,columns);
}
  public static void displayDiagonalElement(int matric[][],int r,int c){
    for(int i=0;i<r;i++){
      for(j=i;j<c;j++){
         System.out.println(matric[i][j]);
      }
    }
  }
}