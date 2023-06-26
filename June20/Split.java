class Split{
  static void displaySplit(String str){
    int count=0;
    String arr[]=str.split(" ");
    for(String s: arr)
      count++;
    System.out.println(count);
  }
  public static void main(String []args){
    String str="hi hello world";
    displaySplit(str);
  }
}