import java.util.* ;
import java.io.*; 

public class Solution {

	public static int digitProduct(int n) {
		List<Integer>factors=new ArrayList<>();
		for(int i=9;i>=2;i--){
			while (n%i==0) {
				factors.add(i);
				n/=i;
			}
		}
		if (n>1) {
			return -1;
		}
		Collections.sort(factors);
		StringBuilder result=new StringBuilder();
		for (Integer factor : factors) {
			result.append(factor);
		}
		return Integer.parseInt(result.toString());
	}

}
