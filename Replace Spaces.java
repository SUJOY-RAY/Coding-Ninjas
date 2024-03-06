import java.util.* ;
import java.io.*; 
public class Solution {
	public static StringBuilder replaceSpaces(StringBuilder str) {
		StringBuilder newString=new StringBuilder();
		for(int i=0;i<str.length();i++){
			if (str.charAt(i)==' ') {
				newString.append("@40");
			}
			else{
				newString.append(str.charAt(i));
			}
		}
		return newString;
	}
}
