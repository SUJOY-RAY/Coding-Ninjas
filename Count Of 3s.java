import java.util.* ;
import java.io.*; 
public class Solution {
  public static List<Integer> digitToList(int a){
    List<Integer>num=new ArrayList<>();
    while (a>0) {
      num.add(a%10);
      a/=10;
    }
    return num;
  }
  public static long countOf3(int x) {
      HashMap<Integer,List<Integer>> map=new HashMap<>();
      long counter=0;
      for (int i = 0; i <=x; i++) {
        map.put(i, digitToList(i));
      }

      for (int i = 0; i <=x; i++) {
        for (int j = 0; j < map.get(i).size(); j++) {
          if (map.get(i).get(j)==3) {
            counter++;
          }
        }
      }

      return counter;
  }
}
