import java.util.* ;
import java.io.*; 

public class Solution {
    private static void swap(int arr[],int a, int b){
            int temp;
            temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        
        for(int i=0;i<arr.length-1;i++){
            swap(arr, i,i+1);
        }
        return arr;
    }
}
