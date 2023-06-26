import java.util.*;
class HashSetToArrayList{
  public static void main(String []args){
    HashSet<Integer> set=new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    ArrayList<Integer> array=new ArrayList<>(set);
    array.add(4);
    for(Object ele: array)
      System.out.println(ele);
  }
}