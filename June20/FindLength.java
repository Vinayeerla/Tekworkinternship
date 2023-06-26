class FindLength{
  public static void main(String []args){
    String str="vinay";
    int count=0;
    char ch[]=str.toCharArray();
    for(char c: ch)
      count++;
    System.out.println(count);
  }
}