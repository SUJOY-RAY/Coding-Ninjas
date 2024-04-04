import java.util.* ;

import com.sun.net.httpserver.Authenticator.Result;

import java.io.*; 
public class Solution {
	public static String findSum(String num1 , String num2)  {
		StringBuilder sb=new StringBuilder();
		int carry=0;
		int i=num1.length()-1;
		int j=num2.length()-1;

		while (i>=0||j>=0) {
			int digit1=i>=0?num1.charAt(i--)-'0':0;
			int digit2=j>=0?num2.charAt(j--)-'0':0;
			int sum=digit1+digit2+carry;
			sb.insert(0, sum%10);
			carry=sum/10;
		}
		if (carry>0) {
			sb.insert(0, carry);
		}
		return sb.toString();
	}
}
