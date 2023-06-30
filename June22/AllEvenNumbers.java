class AllEvenNumbers{
  public static void main(String []u){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number ");
    int num=sc.nextInt();
    int i=1;
    int sum=0;
    while(i<=num){
      if(i%2==0){
        sum=sum+i;
      }
      i++;
    }
    System.out.println(sum);
  }
}