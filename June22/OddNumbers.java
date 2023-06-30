class OddNumbers{
  public static void main(String []u){
    Scanner sc =new Scanner(System.in);
    int i=1;
    while(i<100){
      if(i%2==1){
        System.out.println(i);
      }
      i++;
    }
  }
}