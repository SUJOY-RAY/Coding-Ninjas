import java.util.* ;
import java.io.*; 

public class Solution {

	public static List<List<Integer>> fahrenheitToCelsius(int s, int e, int w) {
		List<List<Integer>>result=new ArrayList<>();

		for (int index = s; index <= e; index+=w) {
			List<Integer> convertedValue=new ArrayList<>();
			int celciusValue=(index-32)*5/9;
			convertedValue.add(index);
			convertedValue.add(celciusValue);
			result.add(convertedValue);
		}
		return result;
	}

}
