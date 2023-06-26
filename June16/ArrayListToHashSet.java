import java.util.*;
class ArrayListToHashSet{
  public static void main(String []args){
    ArrayList<String> arrayList=new ArrayList<>();
    arrayList.add("apple");
    arrayList.add("Peach");
    arrayList.add("Guava");
    arrayList.add("Pear");
    Set<String> setList=new HashSet<>(arrayList);
    setList.add("mango");
    for(String s: setList)
      System.out.println(s);
  }
}