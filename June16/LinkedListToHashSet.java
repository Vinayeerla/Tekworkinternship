import java.util.*;
class LinkedListToHashSet{
  public static void main(String []args){
    LinkedList<String> list=new LinkedList<>();
    list.add("apple");
    list.add("Peach");
    list.add("Guava");
    list.add("Pear");
    Set<String> setList=new HashSet<>(list);
    setList.add("mango");
    for(String s: setList)
      System.out.println(s);
  }
}