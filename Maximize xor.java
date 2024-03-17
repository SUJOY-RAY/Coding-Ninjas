import java.util.* ;
import java.io.*; 
public class Solution {

    public static int maxXor(int L, int R) {

     int msbPosition=0;
     int xor=L^R;
     while (xor>0) {
         msbPosition++;
         xor>>=1;
     }
     int result=(1<<msbPosition)-1;
    return result;
    }
}
