import java.util.* ;


import java.io.*; 
public class Solution {

	public static int middleOfThree(int x, int y, int z) {
		if(x>y){
			int temp=x;
			x=y;
			y=temp;
		}
		if(y>z){
			int temp=y;
			y=z;
			z=temp;
		}
		if(x>y){
			int temp=x;
			x=y;
			y=temp;
		}
		return y;
	}
}

//A simpler way to do this code but will nit follow the minimum comparision rule

// import java.util.* ;
// import java.io.*; 
// public class Solution {
// 	public static int middleOfThree(int x, int y, int z) {
// 		int arr[]={x,y,z};
// 		Arrays.sort(arr);
// 		return arr[1];
// 	}
// }
