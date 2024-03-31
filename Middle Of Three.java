import java.util.* ;
import java.io.*; 
public class Solution {
	public static int middleOfThree(int x, int y, int z) {
		int arr[]={x,y,z};
		Arrays.sort(arr);
		return arr[1];
	}
}
