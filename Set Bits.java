import java.util.* ;
import java.io.*; 

public class Solution {
	public static int countSetBits(int n) {
		// Write your code here.
		int count=0;
		String s="";
		while(n>0){
			s+=Integer.toString(n%2);
			n/=2;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='1') {
				count++;
			}
		}
		return count;
	}
}
