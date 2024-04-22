import java.util.* ;
import java.io.*; 
public class Solution {
    public static String maximumDifference(int n, int[] arr) {


    int max=-1;
    int min=1000000001;
    for (int  i = 0; i < n; i++) {
        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
        min=arr[i];
    }
    
    }
    if((max-min)%2==1){
        return "ODD";
    }
        return "EVEN";




    //    if(n==1){
    //        if(arr[0]%2==0){
    //            return "EVEN";
    //        }
    //        return "ODD";
    //    }
    //    int min=arr[0];
    //    int maxDiff=arr[1]-arr[0];
    //             for (int i = 0; i < n; i++) {
    //                 maxDiff=Math.abs(Math.max(maxDiff, arr[i]-min));
    //                 min=Math.abs(Math.min(min, arr[i]));
    //         }
    //         if (maxDiff%2==0) {
    //             return "EVEN";
    //         }
    //         return "ODD";
    }
    
}













