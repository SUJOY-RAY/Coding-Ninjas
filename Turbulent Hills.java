import java.util.* ;
import java.io.*; 
public class Solution {
	public static int compare(int a,int  b){
		if (a<b) {
			return -1;
		}
		else if (a>b){
			return 1;
		}
		else{
			return 0;
		}
	}

	public static int longestDangerousRange(ArrayList<Integer> height, int n) {
		// Write your code here
		int turbulenceCounter=0;
		int maxLen=1;int curLen=1;int direction=0;

		for (int i = 1; i < n; i++) {
			int newDirection=compare(height.get(i), height.get(i-1));
			if (newDirection==0) {
				curLen=1;
				direction=0;
			}else if (newDirection==direction) {
				curLen=2;
			}else{
				curLen++;
			}
			direction=newDirection;
			maxLen=Math.max(maxLen, curLen);
		}
return maxLen;
	}
}
