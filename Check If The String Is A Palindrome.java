import java.util.* ;
import java.io.*; 
public class Solution {

	public static boolean checkPalindrome(String str) {
		str=str.toLowerCase();
		String updated="";
		
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				updated+=str.charAt(i);
			}
		}
		updated=updated.replaceAll("[^a-zA-Z0-9]", "");

		String reversedString="";
		for (int j = updated.length()-1; j >=0 ; j--) {
			reversedString+=updated.charAt(j);
		}
		
		return updated.equals(reversedString);
	    
	}
}
