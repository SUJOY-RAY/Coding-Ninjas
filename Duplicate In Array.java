import java.util.ArrayList;

public class Solution {

	public static int findDuplicate(ArrayList<Integer> arr) {
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i+1; j < arr.size(); j++) {
				if (arr.get(i).equals(arr.get(j))) {
					return arr.get(j);			
				}
			}
		}
		return -1;
	}
}
