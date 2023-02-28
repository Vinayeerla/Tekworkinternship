public class ArrayExample{
  public static void main(String[] args){
    int staticarray[]={12,2,3,4,5};
    //int dynamicarray[]=new int[10];
    displayArrayExample(staticarray,5);
  }
  static void displayArrayExample(int fs[],int n1)
  {
    for(int l=0;l<fs.length;l++){
    System.out.println(fs[l]);
    
  }
  }
}
