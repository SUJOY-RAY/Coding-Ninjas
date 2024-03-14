import java.util.* ;
import java.io.*; 
public class Solution {
  public static int hotelBookings(List<String> queries)
  {
    int sum=0;
      for (String a: queries) {
        String coin=a.charAt(0)+"";
        if (coin.equals("+")) {
          
            sum++;
        }else if(coin.equals("-")){
            sum+=0;

          }
      }
      return sum;
  }
}



