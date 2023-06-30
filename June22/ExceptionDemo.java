class ExceptionDemo{
  public static void main(String []args){
    int arr[]={1,2,3,4,5};
    String s="abc";  
    String st=null;
    //ArithmeticException
    try
      {
        int a=10/0;
      }
    catch(ArithmeticException ae){
      System.out.println(ae);
    }
    System.out.println("================================");
    //ArrayIndexOutOfBoundsException
    try
      {
        System.out.println(arr[6]);
      }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }
    System.out.println("================================");
    //NumberFormatException
    try
      {
        int i=Integer.parseInt(s);
      }
    catch(NumberFormatException ne){
      System.out.println(ne);
    }
    System.out.println("================================");
    //NullPointerException
    try{
      System.out.println(st.length());
    }
    catch(NullPointerException npe){
      System.out.println(npe);
    }
  }
}