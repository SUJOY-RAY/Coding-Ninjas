import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		int maxLength=0;
		for (int i = 0; i < input.length(); i++) {
			Set<Character>charSet=new HashSet<>();
			int j=i;
			while(j<input.length()&&!charSet.contains(input.charAt(j))){
				charSet.add(input.charAt(j));
				j++;
			}
			maxLength=Math.max(maxLength, j-i);
		}
		return maxLength;
	}
}
