import java.util.* ;

public class Solution {
	static String []st;
	public static String[] printPatt(int n) {
		StringBuilder sb=new StringBuilder();
		List<String> pattern=new ArrayList<>();
		for (int i = n; i >0; i--) {
			sb.setLength(0);
			for (int j = 0; j <i; j++) {
				sb.append("*");
			}
		pattern.add(sb.toString().trim());
		}
		st=pattern.toArray(new String[0]);
		return st;
	}

}
