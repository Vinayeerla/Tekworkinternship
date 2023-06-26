class UpperCaseLetter{
  public static void main(String []args){
    String str="vinay";
    //using predefind method
    //System.out.println(str.toUpperCase());
    //without using predefind method
    char ch[]=str.toCharArray();
    for(int i=0; i<ch.length; i++){
      if(ch[i]>= 'a' && ch[i]<= 'z'){
        ch[i]=(char)((int)ch[i]-32);
      }
      else {
        ch[i]=(char)((int)ch[i]+32);
      }
    }
    String str1=new String(ch);
    for(int i=0; i<str.length(); i++){
      System.out.println(str1);
      break;
    }
  }
}