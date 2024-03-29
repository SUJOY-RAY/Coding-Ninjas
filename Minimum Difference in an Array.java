import java.util.* ;
import java.io.*; 


public class Solution {

    static int minDiff(int n, int[] arr) {
        Arrays.sort(arr);
        int minimum=Integer.MAX_VALUE;

        for(int i =1;i<arr.length;i++){
                int a=Math.abs(arr[i]-arr[i-1]);
                minimum=Math.min(minimum, a);
            }
        
        return minimum;

    }
}
