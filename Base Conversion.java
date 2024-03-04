import java.util.* ;
import java.io.*; 
public class Solution {
	public static int baseConversion(String num, int base) {
		char []arr=num.toCharArray();
		int [] intArr=new int [arr.length];
		for (int i = 0; i < arr.length; i++) {
			intArr[i]=Character.getNumericValue(arr[i]);
		}
		int power=0;
		int result=0;
		for(int i =intArr.length-1;i>=0;i--){
			if (intArr[i]>=base) {
				return -1;
			}
			result+=intArr[i]*Math.pow(base, power);
			power++;
		}
		return result;
		

	}
}
