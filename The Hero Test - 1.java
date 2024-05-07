import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<Integer> theOrder(int n) {
		ArrayList<Integer> question=new ArrayList<>();
		int currentIndex=0;
		for (int i = 1; i <= n; i++) {
			question.add(i);
		}
		ArrayList<Integer>order=new ArrayList<>();
		while (!question.isEmpty()) {
			currentIndex=(currentIndex+1)%question.size();
			order.add(question.remove(currentIndex));
			
		}
		return order;
	}
}

