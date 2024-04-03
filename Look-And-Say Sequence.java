public class Solution {
	public static String nextTerm(String term) {
		
		StringBuilder sb=new StringBuilder();
		int count=1;
		for (int i = 1; i < term.length(); i++) {
			if (term.charAt(i)==term.charAt(i-1)) {
				count++;
			}else{
				sb.append(count).append(term.charAt(i-1));
				count=1;
			}
		}
		sb.append(count).append(term.charAt(term.length()-1));
		return sb.toString();
	}
	public static String lookAndSaySequence(int n){
		String term="1";
		for(int i=1;i<n;i++){
			term=nextTerm(term);
		}
		return term;


	}
}
