import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {
		int rows=mat.size();
		int cols=mat.get(0).size();
		int total=0;
		for ( int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (mat.get(i).get(j)==0) {
					int coverage=getCoverage(mat, i, j);
					total+=coverage;
				}
				
			}
		}
		return total;
	}
	private static int getCoverage(ArrayList<ArrayList<Integer>>mat, int row, int col){
		int coverage=0;

		if (col>0&&mat.get(row).get(col-1)==1) 
			coverage++;
			
		if (col<mat.get(0).size()-1&&mat.get(row).get(col+1)==1) 
			coverage++;

		if (row>0&&mat.get(row-1).get(col)==1) 
			coverage++;
			
		if (row<mat.size()-1&&mat.get(row+1).get(col)==1) 
			coverage++;
		
		return coverage;
	}
}












