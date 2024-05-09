import java.util.* ;
import java.io.*; 
public class Solution {	
	public static String reverseString(String str) {
		// StringBuilder sb=new StringBuilder();
		// for (int i = str.length()-1; i >=0; i--) {
		// 	sb.append(str.charAt(i));
		// }
		// return sb.toString();
	
		char [] charArr=str.toCharArray();
		int left=0;
		int right=charArr.length-1;

		while (left<right) {
			char temp=charArr[left];
			charArr[left]=charArr[right];
			charArr[right]=temp;
			left++;
			right--;
		}
		return new String(charArr);
	}
}
