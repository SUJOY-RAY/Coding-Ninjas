import java.util.* ;
import java.io.*; 
public class Solution {
	public static boolean isPossibleToSplit(int n, int[] arr) {
		HashMap<Integer,Integer> map=new HashMap<>();

		for (int num:arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
				
			}
			
		
		int minCount=Integer.MAX_VALUE;
		for (int count : map.values()) {
			minCount=Math.min(minCount, count);
		}
		return minCount>=2;
	}
}
