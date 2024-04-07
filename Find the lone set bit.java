import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSetBit(int n) {
		if (n==0||(n&(n-1))!=0) {
			return -1;
		}

		int i=1, pos=1;
		while(n>0){
			if ((n&1)==1) {
				return pos;
			}
			n>>=1;
			pos++;
		}
		return -1;
	}
}
