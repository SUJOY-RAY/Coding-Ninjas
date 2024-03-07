import java.util.* ;
import java.io.*; 
public class Solution {
	public static String toBinaryCalculator(double num) {
		StringBuilder st=new StringBuilder("0.");
		while (num>0) {

			double r=num*2;
			if (r>=1) {
				st.append(1);
				num=r-1;
			}
			else{
				st.append(0);
				num=r;
			}
		}
		return st.length()<=32?st.toString():"ERROR";
	}
}
